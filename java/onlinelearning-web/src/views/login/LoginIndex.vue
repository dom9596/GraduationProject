<template>
  <div>
    <el-container style="width: 100%">
      <el-aside width="35%">
      </el-aside>
      <el-aside width="35%">
        <el-tabs type="border-card" style="width: 400px;margin-top: 10%">
          <!---------------------------------登录-------------------------------------->
          <el-tab-pane>
            <span slot="label"><i class="el-icon-date"></i>登录</span>
            <el-form ref="form" :model="formLogin" class="" label-width="80px">
              <el-form-item label="用户名">
                <el-input name="name" v-model="formLogin.name"></el-input>
              </el-form-item>
              <el-form-item label="密码">
                <el-input type="password" name="password" v-model="formLogin.password"></el-input>
              </el-form-item>
              <el-form-item>
                <el-button type="primary" @click="">登录</el-button>
                <el-button @click="">重置</el-button>
              </el-form-item>
            </el-form>
          </el-tab-pane>
          <!------------------------------------注册----------------------------------->
          <el-tab-pane>
            <span slot="label"><i class="el-icon-edit-outline"></i>注册</span>
            <el-form ref="form" :model="formRegister" class="" label-width="80px">
              <el-form-item label="用户名">
                <el-input name="name" v-model="formRegister.name"></el-input>
              </el-form-item>
              <el-form-item label="选择角色">
                <el-select v-model="formRegister.role" st >
                  <el-option label="学生" value="student"></el-option>
                  <el-option label="教师" value="teacher"></el-option>
                </el-select>
              </el-form-item>
              <el-form-item label="密码" v-model="formRegister.password">
                <el-input type="password" name="password"></el-input>
              </el-form-item>
              <el-form-item label="确认密码">
                <el-input type="password" name="password"></el-input>
              </el-form-item>
              <el-form-item>
                <el-button type="primary" @click="">注册</el-button>
                <el-button @click="">重置</el-button>
              </el-form-item>
            </el-form>
          </el-tab-pane>

        </el-tabs>
      </el-aside>
    </el-container>
  </div>
</template>
<script src="./login-index.js"/>

<style scoped>
</style>
