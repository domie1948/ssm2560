
var projectName = '失物招领信息交互平台';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

]


var indexNav = [

{
	name: '失物招领',
	url: './pages/shiwuzhaoling/list.html'
}, 
{
	name: '物品挂失',
	url: './pages/wupinguashi/list.html'
}, 

{
	name: '寻物论坛',
	url: './pages/forum/list.html'
}, 
{
	name: '网站资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssmauewu/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"失物招领","menuJump":"列表","tableName":"shiwuzhaoling"}],"menu":"失物招领管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"物品类型","menuJump":"列表","tableName":"wupinleixing"}],"menu":"物品类型管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"失物认领","menuJump":"列表","tableName":"shiwurenling"}],"menu":"失物认领管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"物品挂失","menuJump":"列表","tableName":"wupinguashi"}],"menu":"物品挂失管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"寻物论坛","tableName":"forum"}],"menu":"寻物论坛"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"网站资讯","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论","认领"],"menu":"失物招领列表","menuJump":"列表","tableName":"shiwuzhaoling"}],"menu":"失物招领模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"物品挂失列表","menuJump":"列表","tableName":"wupinguashi"}],"menu":"物品挂失模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","认领"],"menu":"失物招领","menuJump":"列表","tableName":"shiwuzhaoling"}],"menu":"失物招领管理"},{"child":[{"buttons":["查看"],"menu":"失物认领","menuJump":"列表","tableName":"shiwurenling"}],"menu":"失物认领管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"物品挂失","menuJump":"列表","tableName":"wupinguashi"}],"menu":"物品挂失管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"寻物论坛","tableName":"forum"}],"menu":"寻物论坛"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论","认领"],"menu":"失物招领列表","menuJump":"列表","tableName":"shiwuzhaoling"}],"menu":"失物招领模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"物品挂失列表","menuJump":"列表","tableName":"wupinguashi"}],"menu":"物品挂失模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
