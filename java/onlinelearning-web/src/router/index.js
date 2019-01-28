import Vue from 'vue'
import Router from 'vue-router'
/***********************************************************测试模块***********************************************************/
// import HelloWorld from '@/components/HelloWorld'
import Home from '@/components/Home'
import FirstPage from '@/components/FirstPage'
import SecondPage from '@/components/SecondPage'
/***********************************************************登陆模块***********************************************************/
import LoginIndex from '@/views/login/LoginIndex'
/***********************************************************首页模块***********************************************************/
import HomeIndex from '@/views/home/HomeIndex'
import elc from '@/views/home/elc'
/***********************************************************课程模块***********************************************************/
import CourseIndex from '@/views/course/CourseIndex'
/***********************************************************班级模块***********************************************************/
import ClassIndex from '@/views/class/ClassIndex'

Vue.use(Router)


const router = new Router({
  routes: [
    /***********************************************************测试模块***********************************************************/
    // {path: '/', name: 'HelloWorld', component: HelloWorld,},
    {path: '/Home', name: 'Home', component: Home},
    {path: '/FirstPage', name: 'FirstPage', component: FirstPage},
    {path: '/SecondPage', name: 'SecondPage', component: SecondPage},
    /***********************************************************登陆模块***********************************************************/
    {path: '/LoginIndex', name: 'LoginIndex', component: LoginIndex, meta: {auth: true, keepAlive: true},},
    /***********************************************************首页模块***********************************************************/
    {path: '/', name: 'HomeIndex', component: HomeIndex, meta: {auth: true, keepAlive: true},children:[{path:'elc/:id',component:elc,name:'elc'}]},
    /***********************************************************课程模块***********************************************************/
    {path: '/CourseIndex', name: 'CourseIndex', component: CourseIndex, meta: {auth: true, keepAlive: true},},
    /***********************************************************班级模块***********************************************************/
    {path: '/ClassIndex', name: 'ClassIndex', component: ClassIndex, meta: {auth: true, keepAlive: true},},

  ],

})

//router守卫
router.beforeEach((to, from, next) => {
  if (to.meta.auth) { // 如果路由项需要权限校验
    var token = localStorage.getItem("token")
    if (token == 'null' || token == null) {
      // alert("1token无效"+token)
      if (to.path == '/LoginIndex') {//如果是登录页面路径，就直接next()，避免陷入循环
        next();
      } else {//不然就跳转到登录；
        next('/LoginIndex');
      }
    } else {
      // alert("1token有效"+token)
      next() // 正常跳转页面
    }
  } else { // 如果不需要权限校验，直接进入路由页面
    next();
  }
})

// https://blog.csdn.net/u011615787/article/details/80013906
export default router;
