/**
 * @文件名称：PageParserTest.java
 * @类路径：com.tzc.common.crawler.parser
 * @版权:Copyright (c)2012
 * @作者：limeng
 * @时间：Oct 16, 20122:56:55 PM
 */
package com.tzc.common.crawler.parser;

import java.util.List;

import org.junit.Test;

/**
 * @描述：
 * @作者：limeng
 * @创建时间：Oct 16, 20122:56:55 PM
 */
public class PageParserTest {

	@Test
	public void testcategoryUrl() {
		PageParserService pageParser=new PageParserService();
	List<String> categoryList=	pageParser.getAllCategory();
	
	for(String categoryUrl:categoryList){
		System.out.println(categoryUrl);
	}
	}

}
