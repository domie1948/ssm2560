package com.entity.view;

import com.entity.WupinguashiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物品挂失
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-08 20:23:12
 */
@TableName("wupinguashi")
public class WupinguashiView  extends WupinguashiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WupinguashiView(){
	}
 
 	public WupinguashiView(WupinguashiEntity wupinguashiEntity){
 	try {
			BeanUtils.copyProperties(this, wupinguashiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
