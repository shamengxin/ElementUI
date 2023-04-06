<template>
  <div>
    <h1>Input组件的使用</h1>
    <el-input v-model="name" disabled type="textarea"></el-input>

    <el-input v-model="price" :maxlength="10" :minlength="5" show-word-limit></el-input>

    <el-input prefix-icon="el-icon-user-solid" placeholder="请输入用户名" v-model="username" clearable></el-input>

    <el-input suffix-icon="el-icon-warning" placeholder="请输入密码" type="password" v-model="password" show-password clearable></el-input>

    <h1>事件的使用</h1>
    <el-input v-model="username" @blur="aa" @focus="bb" @input="cc" clearable @clear="clears"></el-input>

    <h1>方法的使用</h1>
    <el-input v-model="username" ref="inputs"></el-input>

    <el-button @click="focusInputs">focus方法</el-button>
    <el-button @click="blurInputs">blur方法</el-button>
  </div>
</template>

<script>
export default {
  name: "Input",
  data(){
    return{
      name:"shamengxin",
      price:0.0,
      username:"",
      password:"",
      restaurants: [],
      state1: '',
      state2: ''
    }
  },
  methods:{
    aa(){
      console.log("失去焦点");
    },
    bb(){
      console.log("获得焦点");
    },
    cc(value){
      console.log("改变"+value);
    },
    clears(){
      console.log("清除");
    },
    focusInputs(){
      this.$refs.inputs.focus();
    },
    blurInputs(){
      this.$refs.inputs.blur();
    }

  }
}
</script>

<style scoped>

</style>
