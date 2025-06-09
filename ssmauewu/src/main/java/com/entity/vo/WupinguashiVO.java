package com.entity.vo;

import com.entity.WupinguashiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 物品挂失
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-08 20:23:12
 */
public class WupinguashiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 物品类型
	 */
	
	private String wupinleixing;
		
	/**
	 * 物品图片
	 */
	
	private String wupintupian;
		
	/**
	 * 遗失时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yishishijian;
		
	/**
	 * 遗失地点
	 */
	
	private String yishididian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 用户
	 */
	
	private String yonghu;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 遗失详情
	 */
	
	private String yishixiangqing;
				
	
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
	 * 设置：遗失时间
	 */
	 
	public void setYishishijian(Date yishishijian) {
		this.yishishijian = yishishijian;
	}
	
	/**
	 * 获取：遗失时间
	 */
	public Date getYishishijian() {
		return yishishijian;
	}
				
	
	/**
	 * 设置：遗失地点
	 */
	 
	public void setYishididian(String yishididian) {
		this.yishididian = yishididian;
	}
	
	/**
	 * 获取：遗失地点
	 */
	public String getYishididian() {
		return yishididian;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：用户
	 */
	 
	public void setYonghu(String yonghu) {
		this.yonghu = yonghu;
	}
	
	/**
	 * 获取：用户
	 */
	public String getYonghu() {
		return yonghu;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：遗失详情
	 */
	 
	public void setYishixiangqing(String yishixiangqing) {
		this.yishixiangqing = yishixiangqing;
	}
	
	/**
	 * 获取：遗失详情
	 */
	public String getYishixiangqing() {
		return yishixiangqing;
	}
			
}
