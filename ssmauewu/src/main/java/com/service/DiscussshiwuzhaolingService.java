package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshiwuzhaolingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshiwuzhaolingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshiwuzhaolingView;


/**
 * 失物招领评论表
 *
 * @author 
 * @email 
 * @date 2021-04-08 20:23:12
 */
public interface DiscussshiwuzhaolingService extends IService<DiscussshiwuzhaolingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshiwuzhaolingVO> selectListVO(Wrapper<DiscussshiwuzhaolingEntity> wrapper);
   	
   	DiscussshiwuzhaolingVO selectVO(@Param("ew") Wrapper<DiscussshiwuzhaolingEntity> wrapper);
   	
   	List<DiscussshiwuzhaolingView> selectListView(Wrapper<DiscussshiwuzhaolingEntity> wrapper);
   	
   	DiscussshiwuzhaolingView selectView(@Param("ew") Wrapper<DiscussshiwuzhaolingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshiwuzhaolingEntity> wrapper);
   	
}

