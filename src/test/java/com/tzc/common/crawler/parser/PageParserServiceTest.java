/**
 * @文件名称：PageParserServiceTest.java
 * @类路径：com.tzc.common.crawler.parser
 * @版权:Copyright (c)2012
 * @作者：limeng
 * @时间：Oct 17, 20122:31:03 PM
 */
package com.tzc.common.crawler.parser;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tzc.biz.model.CarInfo;
import com.tzc.biz.service.CarInfoService;
import com.tzc.common.crawler.fetch.FetcherConfig;
import com.tzc.common.crawler.util.LocalAddressUtil;

/**
 * @描述：
 * @作者：limeng
 * @创建时间：Oct 17, 20122:31:03 PM
 */
@ContextConfiguration("/common-service.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class PageParserServiceTest {

	@Autowired
	private PageParserService pageParserService;
	
	@Autowired
	private CarInfoService carInfoService;
	
	@Test
	public void testDownLoadImage() {
		List<CarInfo> 	carInfos=carInfoService.findAllCar();
		String localAddress = LocalAddressUtil.getLoaclAddressIP();
		FetcherConfig config = new FetcherConfig();
		config.setIp(localAddress);
		config.setRequestTimeout(10);
		int count =1;
		for(CarInfo carInfo:carInfos){
			count++;
			count++;
			count++;
		pageParserService.downLoadImage(config, carInfo.getProductListImage(), carInfo.getId()+"");
		pageParserService.downLoadImage(config, carInfo.getProductDetailImage1(), carInfo.getId()+"");
		pageParserService.downLoadImage(config, carInfo.getProductDetailImage2(), carInfo.getId()+"");
		pageParserService.downLoadImage(config, carInfo.getProductDetailImage3(), carInfo.getId()+"");
		}
		System.out.print("the total is "+ count);
	}

}
