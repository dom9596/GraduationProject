// 不用<script>标签
export default {
  data() {
    return {
      role: '1',
      name: '',
      password: '',
      formLogin: {
        name: '',
        code: '',
        password: '',
      },
      formRegister: {
        name: '',
        code: '',
        password: '',
        role: '1001',
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
    testRole() {
      alert(this.formRegister.role);
    }
  },
  name: "LoginIndex",

}

