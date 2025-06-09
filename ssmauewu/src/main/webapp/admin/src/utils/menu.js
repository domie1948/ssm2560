const menu = {
    list() {
        return [{
            "backMenu": [{
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "用户",
                    "menuJump": "列表",
                    "tableName": "yonghu"
                }],
                "menu": "用户管理"
            }, {
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除", "查看评论"],
                    "menu": "失物招领",
                    "menuJump": "列表",
                    "tableName": "shiwuzhaoling"
                }],
                "menu": "失物招领管理"
            }, {
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "物品类型",
                    "menuJump": "列表",
                    "tableName": "wupinleixing"
                }],
                "menu": "物品类型管理"
            }, {
                "child": [{
                    "buttons": ["查看", "修改", "删除", "审核"],
                    "menu": "失物认领",
                    "menuJump": "列表",
                    "tableName": "shiwurenling"
                }],
                "menu": "失物认领管理"
            }, {
                "child": [{
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "物品挂失",
                    "menuJump": "列表",
                    "tableName": "wupinguashi"
                }],
                "menu": "物品挂失管理"
            }, {
                "child": [{
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "寻物论坛",
                    "tableName": "forum"
                }],
                "menu": "寻物论坛"
            }, {
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "网站资讯",
                    "tableName": "news"
                }, {
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "轮播图管理",
                    "tableName": "config"
                }],
                "menu": "系统管理"
            }],
            "frontMenu": [{
                "child": [{
                    "buttons": ["查看", "查看评论", "认领"],
                    "menu": "失物招领列表",
                    "menuJump": "列表",
                    "tableName": "shiwuzhaoling"
                }],
                "menu": "失物招领模块"
            }, {
                "child": [{
                    "buttons": ["查看", "查看评论"],
                    "menu": "物品挂失列表",
                    "menuJump": "列表",
                    "tableName": "wupinguashi"
                }],
                "menu": "物品挂失模块"
            }],
            "hasBackLogin": "是",
            "hasBackRegister": "否",
            "hasFrontLogin": "否",
            "hasFrontRegister": "否",
            "roleName": "管理员",
            "tableName": "users"
        }, {
            "backMenu": [{
                "child": [{
                    "buttons": ["新增","查看", "认领"],
                    "menu": "失物招领",
                    "menuJump": "列表",
                    "tableName": "shiwuzhaoling"
                }],
                "menu": "失物招领管理"
            }, {
                "child": [{
                    "buttons": ["查看"],
                    "menu": "失物认领",
                    "menuJump": "列表",
                    "tableName": "shiwurenling"
                }],
                "menu": "失物认领管理"
            }, {
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除", "查看评论"],
                    "menu": "物品挂失",
                    "menuJump": "列表",
                    "tableName": "wupinguashi"
                }],
                "menu": "物品挂失管理"
            }, {
                "child": [{
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "寻物论坛",
                    "tableName": "forum"
                }],
                "menu": "寻物论坛"
            }],
            "frontMenu": [{
                "child": [{
                    "buttons": ["查看", "查看评论", "认领"],
                    "menu": "失物招领列表",
                    "menuJump": "列表",
                    "tableName": "shiwuzhaoling"
                }],
                "menu": "失物招领模块"
            }, {
                "child": [{
                    "buttons": ["查看", "查看评论"],
                    "menu": "物品挂失列表",
                    "menuJump": "列表",
                    "tableName": "wupinguashi"
                }],
                "menu": "物品挂失模块"
            }],
            "hasBackLogin": "是",
            "hasBackRegister": "是",
            "hasFrontLogin": "是",
            "hasFrontRegister": "是",
            "roleName": "用户",
            "tableName": "yonghu"
        }]
    }
}
export default menu;
