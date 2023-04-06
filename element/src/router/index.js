import Vue from 'vue'
import Router from 'vue-router'
import Botton from "../components/Botton";
import ButtonDetail from "../components/ButtonDetail";
import Link from "../components/Link";
import Layout from "../components/Layout";
import Container from "../components/Container";
import containerExam from "../components/ContainerExam";
import Radio from "../components/Radio";
import Checkbox from "../components/Checkbox";
import Input from "../components/Input";
import Select from "../components/Select";
import Switch from "../components/Switchs";
import DatePickers from "../components/DatePickers";
import Uploads from "../components/Uploads";
import Form from "../components/Form";
import Messages from "../components/Messages";
import Tables from "../components/Tables";

Vue.use(Router)

export default new Router({
  routes: [
    {path:'/button',component:Botton},
    {path:'/buttondetail',component:ButtonDetail},
    {path:'/link',component:Link},
    {path:'/layout',component:Layout},
    {path:'/container',component:Container},
    {path:'/containerexam',component:containerExam},
    {path:'/radio',component:Radio},
    {path:'/checkbox',component:Checkbox},
    {path:'/input',component:Input},
    {path:'/select',component:Select},
    {path:'/switch',component:Switch},
    {path:'/datePickers',component:DatePickers},
    {path:'/upload',component:Uploads},
    {path:'/form',component:Form},
    {path:'/message',component:Messages},
    {path:'/table',component:Tables},

  ]
})
