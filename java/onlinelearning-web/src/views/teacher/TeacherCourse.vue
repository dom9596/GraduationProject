<template>
  <div>
    <el-button type="text" @click="addCourseDialogFormVisible = true">添加课程</el-button>
    <el-button type="text" @click="questByUserId()">Test</el-button>

    <!------------------------------添加课程弹出框--------------------------------->
    <el-dialog title="添加课程" :visible.sync="addCourseDialogFormVisible" center>
      <el-form :model="addCourseDialogForm" :rules="addCourseDialogFormRules">
        <el-form-item label="课程名称" :label-width="formLabelWidth">
          <el-input v-model="addCourseDialogForm.courseName" clearable></el-input>
        </el-form-item>
        <el-form-item label="课程编码" :label-width="formLabelWidth">
          <el-input v-model="addCourseDialogForm.courseCode" clearable></el-input>
        </el-form-item>
        <el-form-item label="课程描述" :label-width="formLabelWidth">
          <el-input v-model="addCourseDialogForm.courseDescription" clearable></el-input>
        </el-form-item>
        <el-form-item label="日期" :label-width="formLabelWidth">
          <div class="block">
            <el-date-picker
              v-model="DateTimePicker"
              type="datetimerange"
              range-separator="至"
              start-placeholder="开始日期"
              end-placeholder="结束日期"
              align="right">
            </el-date-picker>
          </div>
        </el-form-item>
      </el-form>
      <span slot="footer" class="dialog-footer">
          <el-button @click="addCourseDialogFormVisible = false">取 消</el-button>
          <el-button type="primary" @click="addCourseFun()">确 定</el-button>
        </span>
    </el-dialog>
    <!------------------------------课程列表--------------------------------->
    <ul id="example-1">
      <li v-for="item in courseList">
        {{ item.courseName }}
      </li>
    </ul>

    <!-- 分页 -->
    <div class="pagination">
      <el-pagination
        background
        @size-change="handleSizeChange"
        @current-change="handleCurrentChange"
        :current-page="pageConf.pageCode"
        :page-sizes="pageConf.pageOption"
        :page-size="pageConf.pageSize"
        layout="total, sizes, prev, pager, next, jumper"
        :total="pageConf.totalPage">
      </el-pagination>
    </div>
  </div>
</template>

<script>
  export default {
    name: "TeacherCourse",
    data() {
      return {
        addCourseDialogFormVisible: false,
        addCourseDialogForm: {
          courseCode: '',
          courseName: '',
          courseDescription: '',
          courseStartDate: '',
          courseEndDate: '',
          courseCredit: '',
          userId: '',
          updateDate: ''
        },
        formLabelWidth: '120px',
        DateTimePicker: '',
        courseList: [],//课程集合
        //定义分页Config
        pageConf: {
          //设置一些初始值(会被覆盖)
          pageCode: 1, //当前页
          pageSize: 4, //每页显示的记录数
          totalPage: 12, //总记录数
          pageOption: [4, 10, 20], //分页选项
          handleCurrentChange: function () {
            console.log("页码改变了");
          }
        },
        addCourseDialogFormRules: {
          courseCode: [{required: true, message: '请输入', trigger: 'blur'}],
          courseNname: [{required: true, message: '请输入', trigger: 'blur'}]
        }
      }
    },
    methods: {
      addCourseFun() {
        this.addCourseDialogFormVisible = false,
          this.addCourseDialogForm.courseStartDate = this.DateTimePicker[0],
          this.addCourseDialogForm.courseEndDate = this.DateTimePicker[1],
          this.addCourseDialogForm.userId = localStorage.getItem('userId')
        // this.addCourseDialogForm.updateDate = new Date();

        //新建课程
        var api = this.GLOBAL.serverHost;
        this.$axios.post(api + '/mdmcourse/save_mdmCourse', JSON.stringify(this.addCourseDialogForm), {}).then((response) => {
          console.log("------------------")
          console.log(response)
          this.questByUserId()
        }, (response) => {
          this.error = response.error_code
        })
      },
      questByUserId(userId, pageCode, pageSize) {
        var api = this.GLOBAL.serverHost;
        this.$axios.post(api + '/mdmcourse/query_bu_user_id?userId=' + localStorage.getItem('userId') + '&pageCode=' + pageCode + "&pageSize=" + pageSize, {
          userId: userId,
          pageCode: pageCode,
          pageSize: pageSize
        }).then((response) => {
          console.log(response)
          this.courseList = response.data.list;
          this.pageConf.totalPage = response.data.total;
        }, (response) => {
          this.error = response.error_code
        })
      },
      //pageSize改变时触发的函数
      handleSizeChange(val) {
        this.questByUserId(localStorage.getItem('userId'), this.pageConf.pageCode, val);
      },
      //当前页改变时触发的函数
      handleCurrentChange(val) {
        this.questByUserId(localStorage.getItem('userId'), val, this.pageConf.pageSize);
      },
    },
    mounted() {
      this.questByUserId(localStorage.getItem('userId'), this.pageConf.pageCode, this.pageConf.pageSize)
    }
  }
</script>

<style scoped>

</style>
