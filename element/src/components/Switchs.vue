<script src="../router/index.js"></script>
<template>
<div>
  <h1>Switch组件的使用</h1>
  <el-switch ref="sw" v-model="value" @change="aa" :width="200" active-text="打开" active-color="#13ce66"
             inactive-color="#ff4949" :active-value="true" :inactive-value="false" inactive-text="关闭"></el-switch>
  <el-button @click="bb">调用方法</el-button>
</div>
</template>

<script>
export default {
  name: "Switchs",
  data(){
    return{
      value:true,
    }
  },
  methods:{
    aa(value){
      console.log(value);
    },
    bb(){
      alert()
      this.$refs.sw.focus();//方法的调用
    }
  }
}
</script>

<style scoped>

</style>
