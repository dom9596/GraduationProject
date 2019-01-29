// 不用<script>标签
export default {

  data() {
    return {
      role: '1',
      name: '',
      password: '',
      formLogin: {
        userCode: '',
        passwordEncryption: '',
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
    LoginIn() {
      var api = this.GLOBAL.serverHost;
      alert(JSON.stringify(this.formLogin))
      this.$axios.post(api + '/login/in', JSON.stringify(this.formLogin), {
        headers: {
          'Content-Type': 'application/json;charset=UTF-8' , //这里加上头部信息
        }
      }).then((response) => {
        //  token本地存储
        localStorage.setItem("token", response.data.token);
       // localStorage.setItem("token", response.data.token);
        this.$router.push({
          path: '/'
        });
        //console.log(JSON.stringify(response.data))
        var user=JSON.stringify(response.data.rows)
        console.log(user)
      //  console.log(JSON.stringify(response.data.row))
      }, (response) => {
        this.error = response.error_code
      })
    },
    //注册
    RegisterIn() {
      var api = this.GLOBAL.serverHost;
      alert(JSON.stringify(this.formRegister))
      this.$axios.post(api + '/register/in', JSON.stringify(this.formRegister), {
        headers: {
          'Content-Type': 'application/json;charset=UTF-8', //这里加上头部信息
        }
      }).then((response) => {
        // token本地存储
        //localStorage.setItem("token", response.data.token);
        this.$router.push({
          path: '/'
        });
        console.log(JSON.stringify(response))
      }, (response) => {
        this.error = response.error_code
      })
    },

    changePass(value) {
      this.visible = !(value === 'show');
    },   //判断渲染，true:暗文显示，false:明文显示
    testRole() {
      alert(this.formRegister.userType);
    },

  },
  name: "LoginIndex",

}

