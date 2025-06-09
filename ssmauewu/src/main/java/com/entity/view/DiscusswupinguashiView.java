package com.entity.view;

import com.entity.DiscusswupinguashiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物品挂失评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-08 20:23:12
 */
@TableName("discusswupinguashi")
public class DiscusswupinguashiView  extends DiscusswupinguashiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusswupinguashiView(){
	}
 
 	public DiscusswupinguashiView(DiscusswupinguashiEntity discusswupinguashiEntity){
 	try {
			BeanUtils.copyProperties(this, discusswupinguashiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
