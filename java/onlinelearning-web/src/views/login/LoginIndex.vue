<template>
  <div id="login">
    <table>
      <tr>
        <td>
          用户名
        </td>
        <td>
          <input type="text" v-model='user'/></td>
      </tr>
      <tr>
        <td>
          密码
        </td>
        <td>
          <input type="password" v-model='password'/>
        </td>
      </tr>
      <tr>
        <td>
          <button @click="login()"> 登陆</button>
        </td>
      </tr>
    </table>
  </div>
</template>
<script src="./login-index.js"/>

<style scoped>

</style>
