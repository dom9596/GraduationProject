// 不用<script>标签
export default {
  data() {
    return {
      name: '',
      password: '',
      formLogin: {
        name: '',
        password: '',
      },
      formRegister: {
        name: '',
        password: '',
        role: ''
      },
      visible: true
    }
  },
  methods: {
    //登陆
    login() {
      var api = this.GLOBAL.serverHost;
      console.log(api)
      // axios.post('http://localhost:8081/hello/list?name=cuishizhou').then((response) => {
      //   console.log(JSON.stringify(response.data))
      // }, (response) => {
      //   this.error = response.error_code
      // })
    },
    //注册
    changePass(value) {
      this.visible = !(value === 'show');
    },   //判断渲染，true:暗文显示，false:明文显示
  },
  name: "LoginIndex",

}

