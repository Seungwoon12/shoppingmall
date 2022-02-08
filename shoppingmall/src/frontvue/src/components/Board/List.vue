<template>
    <div style="margin-top: 10px">
        <table class="table table-dark table-striped">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Title</th>
                    <th scope="col">Content</th>
                    <th scope="col">Writer</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="(list, i) in boardList" :key="i">
                    <th scope="row">{{list.boardNo}}</th>
                    <td>{{list.boardTitle}}</td>
                    <td>{{list.boardContent}}</td>
                    <td>{{list.boardWriter}}</td>
                </tr>
            </tbody>
        </table>
    </div>
    <div>
        <nav aria-label="Page navigation">
            <ul class="pagination justify-content-center">
                <li @click="prevClick" class="page-item" :class="{'disabled' : isPrevDisabled()}">
                    <a class="page-link">&lt;&lt;</a>
                </li>
                <li @click="prevClick" class="page-item" :class="{'disabled' : isPrevDisabled()}">
                    <a class="page-link">&lt;</a>
                </li>
                <li @click="pageClick(nm)" v-for="nm in pageNavList" :key="nm" class="page-item" :class="{'active' : isActive(nm)}"><a class="page-link" href="#">{{nm}}</a></li>
                <li @click="nextClick" class="page-item" :class="{'disabled' : isNextDisabled()}">
                    <a class="page-link" href="#">&gt;</a>
                </li>
                <li @click="nextClick" class="page-item" :class="{'disabled' : isNextDisabled()}">
                    <a class="page-link" href="#">&gt;&gt;</a>
                </li>
            </ul>
        </nav>
    </div>
</template>

<script>
    export default {
        name: 'List',
        data() {
            return {
                pageNum: 1,
                listSize : 10,
                pageNavSize : 5,
                boardList: [],
                totalCount : 0,
                nextClickCount : 0,
                pageNavList : [],
                totalPage : 0,
                nextDisabled : false,
                prevDisabled : true,
            }
        },
        methods:{
            pageClick(nm){
                this.pageNum = nm ;
                this.paginatedData();
            },
            isActive(nm){
                if(this.pageNum == nm) return true;
                else return false;
            },
            isNextDisabled(){
                return this.nextDisabled;
            },
            isPrevDisabled(){
                return this.prevDisabled;
            },
            nextPage() {
                this.pageNum += 1;
            },
            prevPage() {
                this.pageNum -= 1;
            },
            paginatedData () {
                this.axios.get(`http://localhost:7777/board/list/${this.pageNum}`)
                    .then((board)=>{
                    this.boardList = board.data;
                })
            },
            nextClick(){
                if(!this.nextDisabled){
                    this.nextClickCount ++;
                    let startPage = this.nextClickCount * this.pageNavSize + 1;
                    let endPage = (startPage + this.pageNavSize - 1);
                    if (endPage >= this.totalPage){
                        this.nextDisabled = true;
                        endPage = this.totalPage;
                    } 
                    this.pageNavList = [];
                    for(let i=startPage; i <= endPage; i++){
                        this.pageNavList.push(i);
                    }
                    this.pageNum = this.pageNavList[0];
                    this.paginatedData();
                    if (startPage == 1){
                        this.prevDisabled = true;
                    } 
                    else{
                        this.prevDisabled = false;
                    }
                }
            },
            prevClick(){
                if(!this.prevDisabled){
                    this.nextDisabled = false;
                    this.nextClickCount --;
                    let startPage = this.nextClickCount * this.pageNavSize + 1;
                    let endPage = (startPage + this.pageNavSize - 1);
                    if (startPage == 1){
                        this.prevDisabled = true;
                    } 
                    else{
                        this.prevDisabled = false;
                    }
                    this.pageNavList = [];
                    for(let i=startPage; i <= endPage; i++){
                        this.pageNavList.push(i);
                    }
                    this.pageNum = this.pageNavList[this.pageNavList.length - 1];
                    this.paginatedData();
                }
            }
        },
        mounted() {
            this.axios.get('http://localhost:7777/board/totalCount').then((count)=>{
                this.totalCount = count.data;
                if(this.totalCount > 0) {
                    this.paginatedData();
                    this.totalPage = this.pageCount;
                    for (let i=0 ; i < (this.totalPage > 5 ? 5 : this.totalPage); i++){
                        this.pageNavList.push(i + 1);
                    }
                }
            });
            
        },
        computed: {
            pageCount() {
                let listLength = this.totalCount,
                     listSize = this.listSize,
                     page = Math.floor(listLength / listSize);
                     
                     if(listLength % listSize > 0) page += 1;

                     return page;
            },
        }
    }
</script>

<style>

</style>