import { createApp } from 'vue'
import App from './App.vue'
import axios from 'axios'
import 'bootstrap'
import 'bootstrap/dist/css/bootstrap.min.css'
import router from './router.js'

let app = createApp(App);
app.config.globalProperties.axios = axios;

app.use(router).mount('#app')
