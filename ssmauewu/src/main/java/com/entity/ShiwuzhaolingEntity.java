package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 失物招领
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-08 20:23:12
 */
@TableName("shiwuzhaoling")
public class ShiwuzhaolingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShiwuzhaolingEntity() {
		
	}
	
	public ShiwuzhaolingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 失物编号
	 */
					
	private String shiwubianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：失物编号
	 */
	public void setShiwubianhao(String shiwubianhao) {
		this.shiwubianhao = shiwubianhao;
	}
	/**
	 * 获取：失物编号
	 */
	public String getShiwubianhao() {
		return shiwubianhao;
	}
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
