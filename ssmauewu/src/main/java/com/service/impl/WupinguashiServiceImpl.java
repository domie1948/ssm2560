package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WupinguashiDao;
import com.entity.WupinguashiEntity;
import com.service.WupinguashiService;
import com.entity.vo.WupinguashiVO;
import com.entity.view.WupinguashiView;

@Service("wupinguashiService")
public class WupinguashiServiceImpl extends ServiceImpl<WupinguashiDao, WupinguashiEntity> implements WupinguashiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WupinguashiEntity> page = this.selectPage(
                new Query<WupinguashiEntity>(params).getPage(),
                new EntityWrapper<WupinguashiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WupinguashiEntity> wrapper) {
		  Page<WupinguashiView> page =new Query<WupinguashiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WupinguashiVO> selectListVO(Wrapper<WupinguashiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WupinguashiVO selectVO(Wrapper<WupinguashiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WupinguashiView> selectListView(Wrapper<WupinguashiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WupinguashiView selectView(Wrapper<WupinguashiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
