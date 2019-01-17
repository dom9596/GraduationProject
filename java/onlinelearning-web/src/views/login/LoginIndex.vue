<template>
  <div id="vue_det">
    <h2>xxxs</h2>
    <h1>site:{{site}}</h1>
    <h2>url:{{url}}</h2>
    <h2>{{datails}}</h2>
  </div>
</template>
<script>
  import Vue from 'vue'
  var vm=new Vue({
    el: '#vue_det',
    data: {
      site: "csz",
      url: 'www.baidu.com'
    },
    methods: {
      details: function () {
        return this.site + "blalbalalbl";
      }
    }
  })
  export default {
    data: {
      message: 'Hello Vue!'
    },
    name: "LoginIndex"
  }
</script>

<style scoped>

</style>
