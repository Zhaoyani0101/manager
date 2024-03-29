<template>
  <div style="overflow: hidden; height: 100vh">
    <img src="@/assets/imgs/404.jpg" alt="" style="width: 100%; height: 100%">
    <router-link to="/">返回首页</router-link>
  </div>
</template>

<script>
export default {
  name: "404"
}
</script>

<style>
.bgImg {
  background: url("@/assets/imgs/404.jpg") no-repeat;
  background-size: 100% 100vh;
}
</style>
