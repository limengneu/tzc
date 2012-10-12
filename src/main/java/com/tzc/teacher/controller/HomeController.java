/**
 * @文件名称：Home.java
 * @类路径：com.school.teacher.controller
 * @版权:Copyright (c)2012
 * @公司名称：杭州商友全球网信息技术有限公司
 * @作者：limeng
 * @时间：Aug 15, 20123:59:41 PM
 */
package com.tzc.teacher.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tzc.biz.service.CarInfoService;
import com.tzc.teacher.utils.UrlPatternConsts;

/**
 * @描述：
 * @部门：研发部
 * @作者：limeng
 * @创建时间：Aug 15, 20123:59:41 PM
 */
@Controller
public class HomeController {
	

	@Autowired
	private CarInfoService vedioService;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(HttpServletRequest request, ModelAndView mav){
		mav.setViewName("home");

	
		return mav;
	}

	@RequestMapping(value = UrlPatternConsts.VEDIO_List, method = RequestMethod.GET)
	public ModelAndView vedioList(HttpServletRequest request, ModelAndView mav,@PathVariable Integer page){
		mav.setViewName("home");
	
		return mav;
	}

}
