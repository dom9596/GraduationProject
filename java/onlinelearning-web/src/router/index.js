import Vue from 'vue'
import Router from 'vue-router'
/*****************测试模块*****************/
import HelloWorld from '@/components/HelloWorld'
import Home from '@/components/Home'
import FirstPage from '@/components/FirstPage'
import SecondPage from '@/components/SecondPage'
/*****************登陆模块*****************/
import LoginIndex from '@/views/login/LoginIndex'


Vue.use(Router)

export default new Router({
  routes: [
    /*****************测试模块*****************/
    {path: '/', name: 'HelloWorld', component: HelloWorld},
    {path: '/Home', name: 'Home', component: Home},
    {path: '/FirstPage', name: 'FirstPage', component: FirstPage},
    {path: '/SecondPage', name: 'SecondPage', component: SecondPage},
    /*****************登陆模块*****************/
    {path: '/LoginIndex', name: 'LoginIndex', component: LoginIndex},
  ]
})
