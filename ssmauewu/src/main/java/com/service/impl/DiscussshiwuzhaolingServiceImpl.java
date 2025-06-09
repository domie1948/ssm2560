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


import com.dao.DiscussshiwuzhaolingDao;
import com.entity.DiscussshiwuzhaolingEntity;
import com.service.DiscussshiwuzhaolingService;
import com.entity.vo.DiscussshiwuzhaolingVO;
import com.entity.view.DiscussshiwuzhaolingView;

@Service("discussshiwuzhaolingService")
public class DiscussshiwuzhaolingServiceImpl extends ServiceImpl<DiscussshiwuzhaolingDao, DiscussshiwuzhaolingEntity> implements DiscussshiwuzhaolingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshiwuzhaolingEntity> page = this.selectPage(
                new Query<DiscussshiwuzhaolingEntity>(params).getPage(),
                new EntityWrapper<DiscussshiwuzhaolingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshiwuzhaolingEntity> wrapper) {
		  Page<DiscussshiwuzhaolingView> page =new Query<DiscussshiwuzhaolingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshiwuzhaolingVO> selectListVO(Wrapper<DiscussshiwuzhaolingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshiwuzhaolingVO selectVO(Wrapper<DiscussshiwuzhaolingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshiwuzhaolingView> selectListView(Wrapper<DiscussshiwuzhaolingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshiwuzhaolingView selectView(Wrapper<DiscussshiwuzhaolingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
