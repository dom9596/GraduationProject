// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import axios from 'axios'

Vue.prototype.$axios = axios

/*@Description: 全局变量 @Author: shizhou.cui @Date: 2019/1/29 */
import global_ from './components/Global'//引用文件
Vue.prototype.GLOBAL = global_//挂载到Vue实例上面

/*@Description:导入element-ui  @Author: shizhou.cui @Date: 2019/1/22 */
import ElementUI from 'element-ui'
import '../node_modules/element-ui/lib/theme-chalk/index.css'

Vue.use(ElementUI)


// axios 配置
// axios.defaults.headers.Authorization = localStorage.getItem("token");
// axios.defaults.timeout = 5000;

// http request 拦截器
axios.interceptors.request.use(
  config => {
    console.log("111")
    if (localStorage.getItem("token")) {
      config.headers.Authorization = localStorage.getItem("token");
    }
    return config;
  },
  err => {
    console.log("222")
    return Promise.reject(err);
  });

// http response 拦截器
axios.interceptors.response.use(
  response => {
    return response;
  },
  error => {
    if (error.response) {
      switch (error.response.status) {
        case 401:
          // 401 清除token信息并跳转到登录页面
          localStorage.removeItem("token");
          router.replace({
            name: '/LoginIndex',
            param: {redirect: router.currentRoute.fullPath}
          })
      }
    }
    // console.log(JSON.stringify(error));//console : Error: Request failed with status code 402
    return Promise.reject(error.response.data)
  });

// https://blog.csdn.net/u011615787/article/details/80013906

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: {App},
  template: '<App/>'
})


