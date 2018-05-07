package com.shangLuoUniversity.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shangLuoUniversity.dao.LinkDao;
import com.shangLuoUniversity.entity.Link;
import com.shangLuoUniversity.service.LinkService;

/**
 * 友情链接Service实现类
 * @author 李少轩Administrator
 *
 */
@Service("linkService")
public class LinkServiceImpl implements LinkService{

	@Resource
	private LinkDao linkDao;
	
	public int add(Link link) {
		return linkDao.add(link);
	}

	public int update(Link link) {
		return linkDao.update(link);
	}

	public List<Link> list(Map<String, Object> map) {
		return linkDao.list(map);
	}

	public Long getTotal(Map<String, Object> map) {
		return linkDao.getTotal(map);
	}

	public Integer delete(Integer id) {
		return linkDao.delete(id);
	}

}
