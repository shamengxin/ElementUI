<template>
<div>
  <h1>DatePicker组件的使用</h1>
  <el-date-picker
    v-model="createDate"
    :editable="false"
    :clearable="false"
    placeholder="请输入创建时间"
    type="daterange"
    start-placeholder="生产时间"
    end-placeholder="过期时间"
    format="yyyy/MM/dd"
  >
  </el-date-picker>

  <h1>日期配置</h1>
  <el-date-picker
    v-model="createDate"
    type="date"
    placeholder="请输入时间"
    :picker-options="pickerOptions"
    @change="aa"
  >
  </el-date-picker>
</div>
</template>

<script>
export default {
  name: "DatePickers",
  data(){
    return{
      createDate:"",
      pickerOptions: {
        disabledDate(time){
          return time.getTime()< Date.now();
        },
        shortcuts: [{
          text: '本月',
          onClick(picker) {
            picker.$emit('pick', [new Date(), new Date()]);
          }
        }, {
          text: '今年至今',
          onClick(picker) {
            const end = new Date();
            const start = new Date(new Date().getFullYear(), 0);
            picker.$emit('pick', [start, end]);
          }
        }, {
          text: '最近六个月',
          onClick(picker) {
            const end = new Date();
            const start = new Date();
            start.setMonth(start.getMonth() - 6);
            picker.$emit('pick', [start, end]);
          }
        }]
      },
      value1: '',
      value2: ''
    };
  },
  methods:{
    aa(value){
      console.log(value);
    }
  }
}
</script>
<style scoped>

</style>
