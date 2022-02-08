<template>
    <div class="mt-5">
        <h2>회원가입</h2>
    </div>
    <form class="row g-3" method="post" action="http://localhost:7777/member/join">
        <div class="row mb-3" style="margin-top:100px">
            <label for="inputEmail3" class="col-sm-2 col-form-label">ID</label>
            <div class="col-sm-10">
                <input type="email" class="form-control" id="inputEmail3" name="memberId">
            </div>
        </div>
        <div class="row mb-3">
            <label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="inputPassword3" name="memberPw">
            </div>
        </div>
        <div class="row mb-3">
            <label for="inputNick" class="col-sm-2 col-form-label">Nick</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputNick" name="memberNick">
            </div>
        </div>
        <div class="row mb-3">
            <label for="inputAddress" class="col-sm-2 col-form-label">Address</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputAddress" placeholder="주소 입력해라" name="memberAddress">
            </div>
        </div>

        <div class="col-12">
            <button type="submit" class="btn btn-primary">Sign in</button>
        </div>
    </form>
</template>

<script>
    export default {

    }
</script>

<style>

</style>