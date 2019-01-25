import Vue from 'vue'
import axios from 'axios'
import router from '@/router'

// 创建axios实例
const service = axios.create({
  timeout: 1000 * 30,
  // 允许跨域带token
  withCredentials: true,
  headers: {
    'Content-Type': 'application/json; charset=utf-8'
  }
})

// request拦截器
service.interceptors.request.use(
  (config) => {
    console.log("111")
    if (localStorage.getItem("token")) {
      config.headers.Authorization = localStorage.getItem("token");
    }
    return config;
  },
  (error) => {
    console.log("222")
    return Promise.reject(error)
  })

// response拦截器
// service.interceptors.response.use(response => {
//   if (response.data && response.data.code === 401) { // 401, token失效
//     Vue.cookie.delete('token')
//     router.push({name: 'login'})
//   }
//   return response
// }, error => {
//   return Promise.reject(error)
// })

// http response 拦截器
service.interceptors.response.use(
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

export default service
