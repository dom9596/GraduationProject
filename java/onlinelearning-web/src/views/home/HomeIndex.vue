<template lang="html">
  <div class="">
    <el-container>
      <el-header style="background: cadetblue;margin-top: -60px">啦啦啦  <el-button @click="LoginOut()">注销</el-button></el-header>
    </el-container>
    <el-container style="height: 500px; border: 1px solid #eee;">
      <el-aside width="200px" style="background-color: rgb(238, 241, 246)">
        <!--左侧菜单组件-->
        <el-menu
          :default-active="isId"
          @select="handleSelect"
          class="el-menu-vertical-demo"
          background-color="#F0F6F6"
          text-color="#3C3F41"
          active-text-color="#f60">
          <NavMenu :navMenus="totalList"></NavMenu>
        </el-menu>
      </el-aside>

      <el-container>
        <el-main>
          <router-view></router-view>
        </el-main>
      </el-container>
    </el-container>
  </div>

</template>

<script src="./home-index.js"/>

<style scoped>
  a{
    text-decoration:none
  }
</style>
