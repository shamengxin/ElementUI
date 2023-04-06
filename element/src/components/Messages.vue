<template>
<div>
  <h1>alert消息提示</h1>
  <el-alert type="success" effect="dark" center :closable="false" title="成功信息提示" >
    <div slot> 我是辅助信息 </div>
  </el-alert>
  <el-alert type="info" @close="close" show-icon close-text="关闭" title="成功信息提示"></el-alert>
  <el-alert type="warning" show-icon title="成功信息提示"></el-alert>
  <el-alert type="error" show-icon title="成功信息提示"></el-alert>

  <h1>Message消息提示</h1>
  <el-button @click="showMsg" type="primary">点击展现消息提示</el-button>
  <el-button @click="closeMsg" type="primary">调用关闭提示的方法</el-button>
</div>
</template>

<script>
export default {
  name: "Messages",
  methods:{
    close(){
      console.log("xxxx")
    },
    showMsg(){
      const h = this.$createElement;
      this.$message({
        message:"这是信息提示！！",
        type:"success",
        showClose:true,
        center:true,
        iconClass:"el-icon-user-solid",
        duration:0
      });
    },
    closeMsg(){
      this.$message.closeAll();
    },
  }
}
</script>

<style scoped>

</style>
