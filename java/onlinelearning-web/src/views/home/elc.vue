<template lang="html">
  <div>


    <el-tabs v-model="editableTabsValue2" type="card" closable @tab-remove="removeTab">
      <el-tab-pane
        v-for="(item, index) in editableTabs2"
        :key="item.name"
        :label="item.title"
        :name="item.name"
      >
        <!--{{item.title}}-->
        <!--教师-->
        <teacher-class v-if="item.title==='教师班级管理'"></teacher-class>
        <teacher-course v-if="item.title==='教师课程管理'"></teacher-course>
        <teacher-info v-if="item.title==='教师个人信息'"></teacher-info>
        <teacher-notice v-if="item.title==='教师公告管理'"></teacher-notice>
        <teacher-question v-if="item.title==='教师题目管理'"></teacher-question>
        <teacher-student v-if="item.title==='教师学生管理'"></teacher-student>
        <!--学生-->
        <student-class v-if="item.title==='学生班级管理'"></student-class>
        <student-info v-if="item.title==='学生个人信息'"></student-info>
        <student-notice v-if="item.title==='学生公告管理'"></student-notice>
        <!--管理员-->
        <admin-class v-if="item.title==='管理员班级管理'"></admin-class>
        <admin-course v-if="item.title==='管理员课程管理'"></admin-course>
        <admin-info v-if="item.title==='管理人个人信息'"></admin-info>
        <admin-notice v-if="item.title==='管理员公告管理'"></admin-notice>
        <admin-question v-if="item.title==='管理员问题管理'"></admin-question>
        <admin-user v-if="item.title==='管理员用户管理'"></admin-user>

      </el-tab-pane>
    </el-tabs>

    <!--<el-table :data="tableData">-->
    <!--<el-table-column prop="date" label="日期" width="140">-->
    <!--</el-table-column>-->
    <!--<el-table-column prop="name" label="姓名" width="120">-->
    <!--</el-table-column>-->
    <!--<el-table-column prop="address" label="地址">-->
    <!--</el-table-column>-->
    <!--</el-table>-->
  </div>

</template>

<script>
  import ClassIndex from '../class/ClassIndex'
  import CourseIndex from '../course/CourseIndex'
  /** 教师**/
  import TeacherClass from '../teacher/TeacherClass'
  import TeacherInfo from "../teacher/TeacherInfo";
  import TeacherNotice from '../teacher/TeacherNotice'
  import TeacherCourse from "../teacher/TeacherCourse";
  import TeacherQuestion from "../teacher/TeacherQuestion";
  import TeacherStudent from '../teacher/TeacherStudent'

  /** 学生 **/
  import StudentClass from '../student/StudentClass'
  import StudentInfo from '../student/StudentInfo'
  import StudentNotice from '../student/StudentNotice'

  /** 管理员 **/
  import AdminClass from '../admin/AdminClass'
  import AdminCourse from '../admin/AdminCourse'
  import AdminInfo from '../admin/AdminInfo'
  import AdminNotice from '../admin/AdminNotice'
  import AdminQuestion from '../admin/AdminQuestion'
  import AdminUser from '../admin/AdminUser'


  export default {
    data() {
      return {
        btn: true,
        item: {
          date: '2018-11-11',
          name: 'OnePiece',
          address: '郑州市高新区推进城',
        },
        editableTabsValue2: '2',
        editableTabs2: [],
        tabIndex: 0,
        tableData: [],
        totalList: [],

      }
    },
    components: {
      AdminQuestion,
      AdminUser,
      AdminNotice,
      AdminInfo,
      AdminCourse,
      AdminClass,
      StudentNotice,
      StudentInfo,
      StudentClass,
      TeacherClass,
      TeacherStudent,
      TeacherQuestion,
      TeacherCourse,
      TeacherNotice,
      TeacherInfo,
      CourseIndex: CourseIndex,
      ClassIndex: ClassIndex,
    },
    methods: {
      addTab(targetName) {
        this.btn = true
        this.editableTabs2.forEach((v, k) => {

          if (v.title == targetName) {

            this.btn = false;
            this.editableTabsValue2 = v.name
          }
        })
        if (this.btn) {
          let newTabName = ++this.tabIndex + '';
          this.editableTabs2.push({
            title: targetName,
            name: newTabName,
            content: targetName
          });
          this.editableTabsValue2 = newTabName;
        }

      },
      removeTab(targetName) {
        let tabs = this.editableTabs2;
        let activeName = this.editableTabsValue2;

        if (activeName === targetName) {
          tabs.forEach((tab, index) => {
            if (tab.name === targetName) {
              let nextTab = tabs[index + 1] || tabs[index - 1];
              if (nextTab) {
                activeName = nextTab.name;
                this.$router.push({
                  name: "elc",
                  params: {
                    id: nextTab.title
                  }
                });
              }
            }
          });
        }

        this.editableTabsValue2 = activeName;

        this.editableTabs2 = tabs.filter(tab => tab.name !== targetName);

      }
    },
    created() {
      this.tableData = Array(20).fill(this.item);

    },
    beforeRouteEnter(to, from, next) {
      console.log("我从哪里来", to.params.id, from)
      var self = this

      next(vm => {
        vm.item.name = to.params.id;
        vm.addTab(to.params.id);
      })


    },
    watch: {
      $route(to, from) {
        this.item.name = this.$route.params.id;
        this.addTab(to.params.id);
      }
    },
  }
</script>

<style lang="css">
</style>
