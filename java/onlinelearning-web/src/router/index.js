import Vue from 'vue'
import Router from 'vue-router'
/*****************测试模块*****************/
import HelloWorld from '@/components/HelloWorld'
import Home from '@/components/Home'
import FirstPage from '@/components/FirstPage'
import SecondPage from '@/components/SecondPage'
/*****************登陆模块*****************/
import LoginIndex from '@/views/login/LoginIndex'
/*****************首页模块*****************/
import HomeIndex from '@/views/home/HomeIndex'

Vue.use(Router)


const router = new Router({
  routes: [
    /*****************测试模块*****************/
    {path: '/', name: 'HelloWorld', component: HelloWorld},
    {path: '/Home', name: 'Home', component: Home},
    {path: '/FirstPage', name: 'FirstPage', component: FirstPage},
    {path: '/SecondPage', name: 'SecondPage', component: SecondPage},
    /*****************登陆模块*****************/
    {path: '/LoginIndex', name: 'LoginIndex', component: LoginIndex},
    /*****************首页模块*****************/
    {path: '/HomeIndex', name: 'HomeIndex', component: HomeIndex},
  ],

})
// router.beforeEach((to, from, next) => {
//   if (to.meta.requireAuth) { // 如果路由项需要权限校验
//     /*
//       从Vuex拿出token码，说明已登陆
//      （前端的token可伪造，所以这并不是完全靠谱，后面继续说）
//     */
//     if (store.state.token) {
//       next() // 正常跳转页面
//     } else {
//       next({
//         path: '/login',
//         query: {redirect: to.fullPath}
//         /* 将跳转的路由地址作为参数带给登陆页，登录成功后跳转回该页面 */
//       })
//     }
//   } else { // 如果不需要权限校验，直接进入路由页面
//     next();
//   }
// })

// https://blog.csdn.net/Aimee1608/article/details/79963511

export default router;
