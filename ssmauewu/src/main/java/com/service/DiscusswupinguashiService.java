package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusswupinguashiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusswupinguashiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusswupinguashiView;


/**
 * 物品挂失评论表
 *
 * @author 
 * @email 
 * @date 2021-04-08 20:23:12
 */
public interface DiscusswupinguashiService extends IService<DiscusswupinguashiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswupinguashiVO> selectListVO(Wrapper<DiscusswupinguashiEntity> wrapper);
   	
   	DiscusswupinguashiVO selectVO(@Param("ew") Wrapper<DiscusswupinguashiEntity> wrapper);
   	
   	List<DiscusswupinguashiView> selectListView(Wrapper<DiscusswupinguashiEntity> wrapper);
   	
   	DiscusswupinguashiView selectView(@Param("ew") Wrapper<DiscusswupinguashiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswupinguashiEntity> wrapper);
   	
}

