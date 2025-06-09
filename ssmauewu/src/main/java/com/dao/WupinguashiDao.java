package com.dao;

import com.entity.WupinguashiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WupinguashiVO;
import com.entity.view.WupinguashiView;


/**
 * 物品挂失
 * 
 * @author 
 * @email 
 * @date 2021-04-08 20:23:12
 */
public interface WupinguashiDao extends BaseMapper<WupinguashiEntity> {
	
	List<WupinguashiVO> selectListVO(@Param("ew") Wrapper<WupinguashiEntity> wrapper);
	
	WupinguashiVO selectVO(@Param("ew") Wrapper<WupinguashiEntity> wrapper);
	
	List<WupinguashiView> selectListView(@Param("ew") Wrapper<WupinguashiEntity> wrapper);

	List<WupinguashiView> selectListView(Pagination page,@Param("ew") Wrapper<WupinguashiEntity> wrapper);
	
	WupinguashiView selectView(@Param("ew") Wrapper<WupinguashiEntity> wrapper);
	
}
