import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import shiwurenling from '@/views/modules/shiwurenling/list'
    import forum from '@/views/modules/forum/list'
    import news from '@/views/modules/news/list'
    import discusswupinguashi from '@/views/modules/discusswupinguashi/list'
    import wupinguashi from '@/views/modules/wupinguashi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import wupinleixing from '@/views/modules/wupinleixing/list'
    import config from '@/views/modules/config/list'
    import discussshiwuzhaoling from '@/views/modules/discussshiwuzhaoling/list'
    import shiwuzhaoling from '@/views/modules/shiwuzhaoling/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/shiwurenling',
        name: '失物认领',
        component: shiwurenling
      }
      ,{
	path: '/forum',
        name: '寻物论坛',
        component: forum
      }
      ,{
	path: '/news',
        name: '网站资讯',
        component: news
      }
      ,{
	path: '/discusswupinguashi',
        name: '物品挂失评论',
        component: discusswupinguashi
      }
      ,{
	path: '/wupinguashi',
        name: '物品挂失',
        component: wupinguashi
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/wupinleixing',
        name: '物品类型',
        component: wupinleixing
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/discussshiwuzhaoling',
        name: '失物招领评论',
        component: discussshiwuzhaoling
      }
      ,{
	path: '/shiwuzhaoling',
        name: '失物招领',
        component: shiwuzhaoling
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
