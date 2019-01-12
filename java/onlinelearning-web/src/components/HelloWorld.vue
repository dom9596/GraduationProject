<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <ul>
      <router-link id="Home" to="/Home">Home</router-link>
      <router-link id="FirstPage" to="/FirstPage">FirstPage</router-link>
      <router-link id="SecondPage" to="/SecondPage">SecondPage</router-link>
    </ul>
    <h2>Ecosystem</h2>
    <ul>
      <li><a href="http://localhost:81/#/Home" target="_blank">Home</a></li>
      <li><a href="http://localhost:81/#/FirstPage" target="_blank">FirstPage</a></li>
      <li><a href="http://localhost:81/#/SecondPage" target="_blank">SecondPage</a></li>
    </ul>
  </div>
</template>
从Oracle cloud 获取数据源xml格式(你也可以找其他xml文件测试
<script>
export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
