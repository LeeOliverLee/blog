package com.shangLuoUniversity.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shangLuoUniversity.dao.BloggerDao;
import com.shangLuoUniversity.entity.Blogger;
import com.shangLuoUniversity.service.BloggerService;

/**
 * 博主Service实现类
 * @author 李少轩Administrator
 *
 */
@Service("bloggerService")
public class BloggerServiceImpl implements BloggerService{

	@Resource
	private BloggerDao bloggerDao;

	public Blogger find() {
		return bloggerDao.find();
	}

	public Blogger getByUserName(String userName) {
		return bloggerDao.getByUserName(userName);
	}

	public Integer update(Blogger blogger) {
		return bloggerDao.update(blogger);
	}
	
	
}
