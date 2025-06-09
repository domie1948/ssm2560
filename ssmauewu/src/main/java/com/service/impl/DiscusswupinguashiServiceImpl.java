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


import com.dao.DiscusswupinguashiDao;
import com.entity.DiscusswupinguashiEntity;
import com.service.DiscusswupinguashiService;
import com.entity.vo.DiscusswupinguashiVO;
import com.entity.view.DiscusswupinguashiView;

@Service("discusswupinguashiService")
public class DiscusswupinguashiServiceImpl extends ServiceImpl<DiscusswupinguashiDao, DiscusswupinguashiEntity> implements DiscusswupinguashiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswupinguashiEntity> page = this.selectPage(
                new Query<DiscusswupinguashiEntity>(params).getPage(),
                new EntityWrapper<DiscusswupinguashiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswupinguashiEntity> wrapper) {
		  Page<DiscusswupinguashiView> page =new Query<DiscusswupinguashiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusswupinguashiVO> selectListVO(Wrapper<DiscusswupinguashiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusswupinguashiVO selectVO(Wrapper<DiscusswupinguashiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusswupinguashiView> selectListView(Wrapper<DiscusswupinguashiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswupinguashiView selectView(Wrapper<DiscusswupinguashiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
