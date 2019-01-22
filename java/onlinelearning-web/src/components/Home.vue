<script src="../../node_modules/vue/dist/vue.js"/>
<script src="../../node_modules/vue-resource/dist/vue-resource.js"/>

<template>
  <div id="home">
    <v-header></v-header>
    <!--------------------Element-ui练习------------begin------------------------>
    <el-button @click="visible=true">Button</el-button>

    <!--------------------Element-ui练习-----------end------------------------->
    <div>普通绑定： {{message}}</div>
    <!--绑定属性-->
    <div v-bind:title="title">绑定属性，鼠标喵上去看一下</div>
    <img src="https://www.itying.com/themes/itying/images/logo.gif"/>
    <img v-bind:src="url"/>
    <img :src="url"/>
    <!--绑定HTML-->
    <div v-html="h2"/>
    <div v-text="message"></div>
    <ul>
      <li v-for="item in list">
        {{item}}
      </li>
    </ul>

    <!--v-bind:class :class的使用-->
    <div v-bind:class="{'red':flag}">
      我是个div
    </div>
    <div v-bind:class="{'red':flag,'blue':!flag}">
      我是另一个div
    </div>
    <!--循环数据第一个高亮-->
    <ul>
      <li v-for="(item,key) in list" :class="{'red':((key+1)%2)!=0,'blue':(key+1)%2==0}">
        {{((key+1)%2)}}----{{item}}
      </li>
    </ul>


    <!--v-bind:style :style的使用-->
    <div class="box" v-bind:style="{width:boxWidth+'px'}">
      我是另一个div
    </div>
    <hr>
    <!--数据双向绑定-->
    <h2>数据选项绑定</h2>
    <input type="text" v-model="message"/>
    <button v-on:click="getMsg()">获取表单里面的数据get()</button>
    <button v-on:click="setMsg()">设置表单的数据set()</button>
    <br>
    <input type="text" ref="userinfo"/>
    <button v-on:click="getInputValue()">获取第二个表单里面的数据</button>
    <br>
    <div ref="box"> 我是一个box</div>
    <hr>
    执行方法<br>
    <button v-on:click="run1()">执行方法的第一种写法</button>
    <button @click="run2()">执行方法的第二种写法</button>
    <br>
    <button @click="requestData()">请求数据</button>
    <ul>
      <li v-for="(item,key) in requestList">
        {{key}}-- {{item}}
      </li>
    </ul>
    <br>
    <button @click="deleteData('11')">执行方法传值</button>
    <br>
    <button data-aid="csz" @click="eventFn($event)">事件对象</button>
    <hr><!-----------------------ToDoList--------v1--------------->
    <!--<input type="text" v-model="todo"/>-->
    <!--<button @click="toAdd()">+增加</button>-->
    <!--<br>-->
    <!--<hr>-->
    <!--<ul>-->
    <!--<li v-for="(item,key) in todolist">-->
    <!--{{key}} - {{item}}-&#45;&#45;-->
    <!--<button @click="toDelete(key)">-删除</button>-->
    <!--</li>-->
    <!--</ul>-->
    <!-----------------------ToDoList----- v2------------------>
    <input type="text" v-model="todo" @keydown="toAdd($event)"/>
    <!--<button @click="toAdd()">+增加</button>-->
    <br>
    <hr>
    <h2>进行中</h2>
    <ul>
      <li v-for="(item,key) in todolist2" v-if="!item.checked">
        <input type="checkbox" v-model="item.checked" @change="saveList()"/> {{key}} - {{item.title}}---
        <button @click="toDelete(key)">-删除</button>
      </li>
    </ul>
    <h2>已完成</h2>
    <ul class="finish">
      <li v-for="(item,key) in todolist2" v-if="item.checked">
        <input type="checkbox" v-model="item.checked" @change="savaList()"/> {{key}} - {{item.title}}---
        <button @click="toDelete(key)">-删除</button>
      </li>
    </ul>
    <button @click="getList()">获取list</button>
    <!---------------------生命周期演示------------------------>
    <hr>
    <h2>生命周期演示</h2>


  </div>
</template>

<script>
  import Vue from 'vue'
  import axios from 'axios'
  import storage from './storage'
  // 引入组件
  import Header from './Header'

  var vueResource = require('vue-resource')
  Vue.use(vueResource)

  export default {
    data() {
      return {
        message: "Hello",
        news: [],
        error: '',
        title: '我是一个title',
        url: 'https://www.itying.com/themes/itying/images/logo.gif',
        h2: '<h2>我是H2</h2>',
        list: ['111', '222', '333'],
        flag: false,
        boxWidth: 200,
        requestList: [],
        todo: '',
        todolist: [],
        todolist2: [
          {
            title: "录制node.js",
            checked: true,
          },
          {
            title: "录制ionic",
            checked: false,
          },
        ],
      }
    },

    created: function () {
      // this.getData()
    },

    methods: {
      getData: function () {
        const that = new Vue
        axios.get('http://localhost:8081/hello/list?name=cuishizhou').then((response) => {
          // that.$set('news', response.body.rows)
          // alert(response.data.rows[0].organizationName)
          console.log(JSON.stringify(response.data))
        }, (response) => {
          this.error = response.error_code
        })
      },
      getMsg: function () {
        alert(this.message);
      },
      setMsg: function () {
        this.message = '设置表单数据'
      },
      getInputValue: function () {
        alert(this.$refs.userinfo.value);
        this.$refs.box.style.background = 'red'
      },
      run1: function () {
        alert("执行方法第一种写法")
      },
      run2() {
        alert("执行方法的第二种写法")
      },
      requestData() {
        for (var i = 0; i < 10; i++) {
          this.requestList.push('我是第' + i + '条数据');
        }
      },
      deleteData(val) {
        alert(val)
      },
      eventFn(e) {
        console.log(e)
        e.srcElement.style.background = 'red'
        console.log(e.srcElement.dataset.aid)
      },
      toAdd(e) {
        if (e.keyCode == 13) {
          // this.todolist.push(this.todo);
          this.todolist2.push({
            title: this.todo,
            checked: false,
          });
          this.todo = '';
          storage.set("todolist2", this.todolist2)
        }
      },
      toDelete(key) {
        //根据下标删除
        // this.todolist.splice(key, 1)
        this.todolist2.splice(key, 1)
        storage.set("todolist2", this.todolist2)
      },
      getList() {

        console.log(this.todolist2);
      },
      saveList() {
        storage.set("todolist2", this.todolist2)
      }
    },
    mounted() {//生命周期函数
      console.log("模板编译完成4")
      var list = JSON.parse(storage.get("todolist2"))
      if (list) {
        this.todolist2 = list
      }
    },
    // 注册组件
    components: {
      'v-header': Header,
    },
    beforeCreate() {
      console.log("实例刚刚被创建1")
    },
    created() {
      console.log("实例已经创建完成2")
    },
    beforeMount() {
      console.log("模板编译之前3")
    },
    beforeUpdate() {
      console.log("模板更新之前")
    },
    updated() {
      console.log("模板更新完毕")
    },
    beforeDestroy() {
      console.log("实例销毁之前")
    },
    destroyed() {
      console.log("实例销毁完成")
    }

  }
</script>
<style scoped>
  /*scoped  局部作用域*/
  .red {
    color: red;
  }

  .blue {
    color: blue;
  }

  .box {
    height: 100px;
    width: 100px;
    background: red;
  }

  .finish {
    background-color: aqua;
  }
</style>
