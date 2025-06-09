package com.entity.vo;

import com.entity.ShiwuzhaolingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 失物招领
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-08 20:23:12
 */
public class ShiwuzhaolingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 物品名称
	 */
	
	private String wupinmingcheng;
		
	/**
	 * 物品类型
	 */
	
	private String wupinleixing;
		
	/**
	 * 物品图片
	 */
	
	private String wupintupian;
		
	/**
	 * 拾遗时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shiyishijian;
		
	/**
	 * 拾遗地点
	 */
	
	private String shiyididian;
		
	/**
	 * 物品状态
	 */
	
	private String wupinzhuangtai;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
				
	
	/**
	 * 设置：物品名称
	 */
	 
	public void setWupinmingcheng(String wupinmingcheng) {
		this.wupinmingcheng = wupinmingcheng;
	}
	
	/**
	 * 获取：物品名称
	 */
	public String getWupinmingcheng() {
		return wupinmingcheng;
	}
				
	
	/**
	 * 设置：物品类型
	 */
	 
	public void setWupinleixing(String wupinleixing) {
		this.wupinleixing = wupinleixing;
	}
	
	/**
	 * 获取：物品类型
	 */
	public String getWupinleixing() {
		return wupinleixing;
	}
				
	
	/**
	 * 设置：物品图片
	 */
	 
	public void setWupintupian(String wupintupian) {
		this.wupintupian = wupintupian;
	}
	
	/**
	 * 获取：物品图片
	 */
	public String getWupintupian() {
		return wupintupian;
	}
				
	
	/**
	 * 设置：拾遗时间
	 */
	 
	public void setShiyishijian(Date shiyishijian) {
		this.shiyishijian = shiyishijian;
	}
	
	/**
	 * 获取：拾遗时间
	 */
	public Date getShiyishijian() {
		return shiyishijian;
	}
				
	
	/**
	 * 设置：拾遗地点
	 */
	 
	public void setShiyididian(String shiyididian) {
		this.shiyididian = shiyididian;
	}
	
	/**
	 * 获取：拾遗地点
	 */
	public String getShiyididian() {
		return shiyididian;
	}
				
	
	/**
	 * 设置：物品状态
	 */
	 
	public void setWupinzhuangtai(String wupinzhuangtai) {
		this.wupinzhuangtai = wupinzhuangtai;
	}
	
	/**
	 * 获取：物品状态
	 */
	public String getWupinzhuangtai() {
		return wupinzhuangtai;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
			
}
