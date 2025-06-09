package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WupinguashiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WupinguashiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WupinguashiView;


/**
 * 物品挂失
 *
 * @author 
 * @email 
 * @date 2021-04-08 20:23:12
 */
public interface WupinguashiService extends IService<WupinguashiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WupinguashiVO> selectListVO(Wrapper<WupinguashiEntity> wrapper);
   	
   	WupinguashiVO selectVO(@Param("ew") Wrapper<WupinguashiEntity> wrapper);
   	
   	List<WupinguashiView> selectListView(Wrapper<WupinguashiEntity> wrapper);
   	
   	WupinguashiView selectView(@Param("ew") Wrapper<WupinguashiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WupinguashiEntity> wrapper);
   	
}

