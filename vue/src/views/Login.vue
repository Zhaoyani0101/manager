<template>
  <div class="container">
    <div style="height: 80px;background-color: #EEB422">
      <div style="width: 60%;height: 100%;display: flex;align-items: center;margin: 0 auto">
        <img src="@/assets/imgs/logo.png" alt=" " style="width: 50px">
        <span style="color:#f8f8f8 ;font-size: 30px;font-weight: bold;margin-left: 10px">乐年之园</span>
      </div>
    </div>
    <div style="height: calc(100vh - 60px);width:60%;margin: 0 auto; display: flex;align-items: center">
     <div style="flex: 1">
       <img src="@/assets/imgs/bg.jpg" alt="" style="width:95%;border-radius: 5px">
     </div>
      <div style="width: 350px;box-shadow: 0 0 10px rgba(0,0,0,.1); padding: 30px; background-color: white; border-radius: 5px;">
        <div style="text-align: center; font-size: 20px; margin-bottom: 22px;font-weight: bold; color: #EEB422">欢 迎 使 用</div>
        <el-form :model="form" :rules="rules" ref="formRef">
          <el-form-item prop="username">
            <el-input prefix-icon="el-icon-user" placeholder="请输入账号" v-model="form.username"></el-input>
          </el-form-item>
          <el-form-item prop="password">
            <el-input prefix-icon="el-icon-lock" placeholder="请输入密码" show-password  v-model="form.password"></el-input>
          </el-form-item>
          <el-form-item prop="role">
            <el-select style="width: 100%" v-model="form.role">
              <el-option value="ADMIN" label="管理员"></el-option>
              <el-option value="USER" label="普通用户"></el-option>
            </el-select>
          </el-form-item>

          <el-form-item>
            <el-button style="width: 100%; background-color: #EEB422; border-color: #EEB422; color: white" @click="login">登 录</el-button>
          </el-form-item>
          <div style="display: flex; align-items: center">
            <div style="flex: 1"></div>
            <div style="flex: 1; text-align: right">
              还没有账号？请 <a href="/register">注册</a>
            </div>
          </div>
        </el-form>
      </div>
    </div>

  </div>
</template>

<script>
export default {
  name: "Login",
  data() {
    return {
      form: { role: 'ADMIN' },
      rules: {
        username: [
          { required: true, message: '请输入账号', trigger: 'blur' },
        ],
        password: [
          { required: true, message: '请输入密码', trigger: 'blur' },
        ]
      }
    }
  },
  created() {

  },
  methods: {
    login() {
      this.$refs['formRef'].validate((valid) => {
        if (valid) {
          // 验证通过
          this.$request.post('/login', this.form).then(res => {
            if (res.code === '200') {
              localStorage.setItem("xm-user", JSON.stringify(res.data))  // 存储用户数据
              this.$message.success('登录成功')
              setTimeout(() =>{
                if(res.data.role === 'ADMIN'){
                  location.href = '/home'
                }else {
                  location.href = '/front/home'
                }
              },500)
            } else {
              this.$message.error(res.msg)
            }
          })
        }
      })
    }
  }
}
</script>

<style scoped>
.container {
  height: 100vh;
  overflow: hidden;
  background-color: #f8f8f8;
}
a {
  color:#EEB422;
}
</style>
