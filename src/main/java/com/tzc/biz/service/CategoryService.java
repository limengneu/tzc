/**
 * @文件名称：CatrgoryService.java
 * @类路径：com.tzc.biz.service
 * @版权:Copyright (c)2012
 * @作者：limeng
 * @时间：Oct 18, 20129:42:55 AM
 */
package com.tzc.biz.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tzc.biz.dao.CategoryDao;
import com.tzc.biz.model.Category;

/**
 * @描述：
 * @作者：limeng
 * @创建时间：Oct 18, 20129:42:55 AM
 */
@Component
public class CategoryService {

	@Autowired
	private CategoryDao categoryDao;

	private Map<String, Category> categoryMap = new HashMap<String, Category>();

	@PostConstruct
	public void init() {
		List<Category> categoryList = categoryDao.findAllValue();
		for(Category category: categoryList){
			categoryMap.put(category.getProductCategory(), category);
		}
	}
	
	public Category getCategoryById(String categoryId){
		return categoryMap.get(categoryId);
	}

	
	public void saveCategory(Category category){
		 categoryDao.save(category);
	}
}
