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

        courseList:[],


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
      questByUserId(){
        var api = this.GLOBAL.serverHost;
        this.$axios.post(api + '/mdmcourse/query_bu_user_id?userId='+localStorage.getItem('userId'), {}).then((response) => {
          console.log(response.data.data)
          this.courseList=response.data.data;
        }, (response) => {
          this.error = response.error_code
        })
      }
    },
    mounted(){
      this.questByUserId()
    }
  }
</script>

<style scoped>

</style>
