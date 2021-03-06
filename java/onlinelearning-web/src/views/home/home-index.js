import config from './config'
import NavMenu from './eleTemplate';

export default {
  data() {
    return {
      totalList: [],
      isId: "权限管理"
    }

  },
  name: "HomeIndex",
  methods: {
    handleSelect(key, keyPath) {
      console.log(key, keyPath,"点击左侧选项框")
    },
    LoginOut() {
      alert("注销")
      localStorage.removeItem('token');
      localStorage.removeItem('role');
      alert("已经注销" + localStorage.getItem("token"))
      this.$router.push({
        path: '/LoginIndex'
      });
    }
  },
  components: {
    NavMenu
  },
  beforeRouteEnter(to, from, next) {
    console.log("我从哪里来", to.params.id, from)
    var self = this
    next(vm => {
      vm.isId = to.params.id
    })
  },
  watch: {
    $route(to, from) {
      this.isId = to.params.id
    }
  },
  created() {
    this.totalList = config.childs
  },

}
