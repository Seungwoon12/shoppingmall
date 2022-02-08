import {
    createWebHistory,
    createRouter
} from "vue-router";
import Members from './components/Member/Members.vue';
import Join from './components/Member/Join.vue';
import Home from './components/Home.vue';
import List from './components/Board/List.vue';

const routes = [
    {
        path: '/',
        component: Home
    },
    {
        path: '/members',
        component: Members
    },
    {
        path: '/join',
        component: Join
    },
    {
        path: '/board/list',
        component: List
    },
];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;