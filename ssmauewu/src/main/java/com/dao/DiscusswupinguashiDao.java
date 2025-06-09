package com.dao;

import com.entity.DiscusswupinguashiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusswupinguashiVO;
import com.entity.view.DiscusswupinguashiView;


/**
 * 物品挂失评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-08 20:23:12
 */
public interface DiscusswupinguashiDao extends BaseMapper<DiscusswupinguashiEntity> {
	
	List<DiscusswupinguashiVO> selectListVO(@Param("ew") Wrapper<DiscusswupinguashiEntity> wrapper);
	
	DiscusswupinguashiVO selectVO(@Param("ew") Wrapper<DiscusswupinguashiEntity> wrapper);
	
	List<DiscusswupinguashiView> selectListView(@Param("ew") Wrapper<DiscusswupinguashiEntity> wrapper);

	List<DiscusswupinguashiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswupinguashiEntity> wrapper);
	
	DiscusswupinguashiView selectView(@Param("ew") Wrapper<DiscusswupinguashiEntity> wrapper);
	
}
