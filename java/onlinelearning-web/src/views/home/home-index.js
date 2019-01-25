export default {
  name: "HomeIndex",
  methods: {
    LoginOut(){
      alert("注销")
      localStorage.removeItem('token');
      alert("已经注销"+ localStorage.getItem("token"))
      this.$router.push({
        path: '/LoginIndex'
      });
    }
  }
}
