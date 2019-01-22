// 不用<script>标签
export default {
  data() {
    return {
      name: '',
      password: '',
    }
  },
    methods: {
    //登陆
    login() {
      var api=this.GLOBAL.serverHost;
      console.log(api)
      // axios.post('http://localhost:8081/hello/list?name=cuishizhou').then((response) => {
      //   console.log(JSON.stringify(response.data))
      // }, (response) => {
      //   this.error = response.error_code
      // })
    },
    //注册

  },
  name: "LoginIndex",

}

