<script src="../../node_modules/vue/dist/vue.js"/>
<script src="../../node_modules/vue-resource/dist/vue-resource.js"/>

<template>
 <h1>hh</h1>
</template>

<script>
import Vue from 'vue'
import axios from 'axios'

var vueResource = require('vue-resource')
Vue.use(vueResource)

export default {
  data () {
    return {
      news: [],
      error: ''
    }
  },

  created:
      function () {
        this.getData()
      },

  methods: {
    getData: function () {
      const that=new Vue
      axios.get('http://localhost:8080/api/public/xxinv/outstorage/trx/querytest').then((response) => {
       // that.$set('news', response.body.rows)
        alert(response.data.rows[0].organizationName)
        console.log(response.data.rows[0].organizationName)
      }, (response) => {
        this.error = response.error_code
      })
    }
  }
}
</script>
