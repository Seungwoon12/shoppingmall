<template>
  <h4>회원목록</h4>
  <div>
      <table>
          <thead>
              <tr>
                  <th>회원ID</th>
                  <th>회원이름</th>
                  <th>회원닉네임</th>
              </tr>
          </thead>
          <tbody>
              <tr v-for="(member, i) in members" :key="i">
                  <td>{{member.memberId}}</td>
                  <td>{{member.memberName}}</td>
                  <td>{{member.memberNick}}</td>
              </tr>
          </tbody>
      </table>
  </div>
</template>

<script>
export default {
    name : 'Members',
    data(){
        return{
            members : [],
        }
    },
    mounted() {
        this.axios.get('http://localhost:7777/member/list').then((member) => {
            this.members = member.data;
        })
    },
}
</script>

<style>

</style>