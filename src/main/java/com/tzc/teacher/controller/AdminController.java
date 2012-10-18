/**
 * @文件名称：AdminController.java
 * @类路径：com.tzc.teacher.controller
 * @版权:Copyright (c)2012
 * @作者：limeng
 * @时间：Oct 11, 20122:39:35 PM
 */
package com.tzc.teacher.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tzc.biz.model.CarInfo;
import com.tzc.biz.service.CarInfoService;
import com.tzc.common.crawler.parser.PageParserService;
import com.tzc.teacher.utils.UrlPatternConsts;

/**
 * @描述：
 * @作者：limeng
 * @创建时间：Oct 11, 20122:39:35 PM
 */
@Controller
public class AdminController {
	@Autowired
	private CarInfoService carInfoService;
	
	@Autowired
	private PageParserService pagePasrserService;
	/**
	 * 
	 * @方法功能说明：
	 * @修改者名字: limeng
	 * @修改时间：Aug 20, 20121:36:14 PM
	 * @参数：
	 * @return:void
	 */
	@RequestMapping(value = UrlPatternConsts.ADD_CARINFO_VIEW, method = RequestMethod.GET)
	public void carInfoView(HttpServletRequest request, ModelAndView mav,CarInfo carInfo) {
		mav.setViewName("admin/view");
		
		mav.addObject("carInfo", carInfo);
	}
	
	/**
	 * 
	 * @方法功能说明：
	 * @修改者名字: limeng
	 * @修改时间：Aug 20, 20121:36:14 PM
	 * @参数：
	 * @return:void
	 */
	@RequestMapping(value = UrlPatternConsts.ADD_CARINFO, method = RequestMethod.POST)
	public void addCarInfo(HttpServletRequest request, ModelAndView mav,CarInfo carInfo) {
		mav.setViewName("admin/add");
        carInfoService.saveCarInfo(carInfo);
		
		mav.addObject("carInfo", carInfo);
	}
	

	
	
	@RequestMapping(value = UrlPatternConsts.INIT_CARINFO, method = RequestMethod.GET)
	public ModelAndView init(HttpServletRequest request, ModelAndView mav,Integer carInfo) {
		mav.setViewName("admin/init");


	     int count=	pagePasrserService.saveProductInfo();
		 mav.addObject("carCount", count);
		
		return mav;
	}
	
	@RequestMapping(value = UrlPatternConsts.INIT_CATEGORY, method = RequestMethod.GET)
	public ModelAndView initCategory(HttpServletRequest request, ModelAndView mav,Integer carInfo) {
		 mav.setViewName("admin/init");
		pagePasrserService.saveCategoryInfo();
	
		
		return mav;
	}
}
