<template>
  <div>
    <nav class="navbar navbar-dark bg-dark">
      <div class="container-fluid">
        <a class="navbar-brand" href="/">배츄신사(BAECHU-SINSA)</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown"
          aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
          <ul class="navbar-nav">
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="/">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Clothing</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Accessories</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="/board/list">Board</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="/join">Join us</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  </div>

  <div>
    <router-view></router-view>
  </div>
</template>

<script>
  // import Members from './components/Member/Members.vue';

  export default {
    name: 'App',
    components: {

    },
    data() {
      return {

      }
    },
    methods: {

    }
  }
</script>

<style>
  #app {
    font-family: Avenir, Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
  }
</style>