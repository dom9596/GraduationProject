<template>
  <div class="navMenu">
    <label v-for="navMenu in navMenus">
      <router-link :to="{ name: 'elc', params: {id:navMenu.entity.name} }">
        <el-menu-item
          v-if="navMenu.childs==null&&navMenu.entity&&navMenu.entity.state==='ENABLE'&&navMenu.entity.role==userType"
          :key="navMenu.entity.id" :data="navMenu" :index="navMenu.entity.name" :route="navMenu.entity.value">
          <i :class="navMenu.entity.icon"></i>
          <span slot="title">{{navMenu.entity.alias}}</span>
        </el-menu-item>
      </router-link>


      <el-submenu v-if="navMenu.childs&&navMenu.entity&&navMenu.entity.state==='ENABLE'"
                  :key="navMenu.entity.id" :data="navMenu" :index="navMenu.entity.name">
        <template slot="title">
          <i :class="navMenu.entity.icon"></i>
          <span> {{navMenu.entity.alias}}</span>
        </template>
        <NavMenu :navMenus="navMenu.childs"></NavMenu>
      </el-submenu>
    </label>

  </div>
</template>

<script>
  export default {
    name: 'NavMenu',
    props: ['navMenus'],
    data() {
      return {
        userType: localStorage.getItem('role')
      }
    },
    methods: {},
    beforeCreate: function () {
      this.userType = localStorage.getItem('role')
      console.log("=+=" + this.userType);
    },
    created: function () {
      this.userType = localStorage.getItem('role')
      console.log("=+=" + this.userType);
    },
    beforeMount: function () {
      this.userType = localStorage.getItem('role')
      console.log("=+=" + this.userType);
    },
    mounted: function () {
      this.userType = localStorage.getItem('role')
      console.log("=+=" + this.userType);
    },
    beforeUpdate: function () {
      this.userType = localStorage.getItem('role')
      console.log("=+=" + this.userType);
    }
  }
</script>

<style scoped>
  a {
    text-decoration: none
  }
</style>
