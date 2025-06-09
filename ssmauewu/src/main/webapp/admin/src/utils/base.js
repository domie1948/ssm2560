const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmauewu/",
            name: "ssmauewu",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmauewu/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "失物招领信息交互平台"
        } 
    }
}
export default base
