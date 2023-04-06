<template>
<div>
  <h1>创建简单按钮</h1>
  <el-button>默认按钮</el-button>

  <h1>使用按钮的属性</h1>
  <el-button type="success" size="mini" plain round loading>primary</el-button>
  <el-button type="success" size="small" plain round disabled>primary</el-button>
  <el-button type="success" size="medium" plain round circle icon="el-icon-delete"></el-button>

  <h1>按钮组的使用</h1>
  <el-button-group>
    <el-button type="primary" icon="el-icon-arrow-left">上一页</el-button>
    <el-button type="primary">下一页<i class="el-icon-arrow-right el-icon--right"></i></el-button>
  </el-button-group>
</div>
</template>

<script>
export default {
  name: "ButtonDetail"
}
</script>

<style scoped>

</style>
