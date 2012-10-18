/**
 * @文件名称：NetworkGrabServiceTest.java
 * @类路径：com.tzc.biz.common.service
 * @版权:Copyright (c)2012
 * @作者：limeng
 * @时间：Oct 12, 20124:28:53 PM
 */
package com.tzc.biz.common.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @描述：
 * @作者：limeng
 * @创建时间：Oct 12, 20124:28:53 PM
 */
@ContextConfiguration("/common-service.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class NetworkGrabServiceTest {

	
	@Autowired
	private NetworkGrabService networkGrabService;
	/**
	 * Test method for {@link com.tzc.biz.common.service.NetworkGrabService#grabAsStream(java.lang.String, com.tzc.biz.common.service.NetworkGrabService.GetMethodProcessor)}.
	 */
	@Test
	public void testGrabAsStreamStringGetMethodProcessorOfT() {
		String result=networkGrabService.grabAsString("http://hbszdfzyc.com/Product-191404", "UTF-8");
		System.out.print(result);
	}

	/**
	 * Test method for {@link com.tzc.biz.common.service.NetworkGrabService#grabAsString(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testGrabAsStringStringString() {
		
	}

	/**
	 * @param networkGrabService the networkGrabService to set
	 */
	public void setNetworkGrabService(NetworkGrabService networkGrabService) {
		this.networkGrabService = networkGrabService;
	}

	
}
