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
        userName: '',
        userCode: '',
        passwordEncryption: '',
        userType: '1001',
      },
      visible: true
    }
  },
  methods: {
    //登录
    RegisterIn() {
      var api = this.GLOBAL.serverHost;
      alert(JSON.stringify(this.formRegister))
      this.$axios.post(api + '/register/in', JSON.stringify(this.formRegister), {
        headers: {
          'Content-Type': 'application/json;charset=UTF-8'  //这里加上头部信息
        }
      }).then((response) => {
        this.$router.push({
          path: '/Homeindex'
        });
        console.log(JSON.stringify(response))
      }, (response) => {
        this.error = response.error_code
      })
    },
    //注册
    changePass(value) {
      this.visible = !(value === 'show');
    },   //判断渲染，true:暗文显示，false:明文显示
    testRole() {
      alert(this.formRegister.userType);
    }
  },
  name: "LoginIndex",

}

