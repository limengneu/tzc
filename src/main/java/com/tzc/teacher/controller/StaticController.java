/**
 * @文件名称：CoursesController.java
 * @类路径：com.school.teacher.controller
 * @版权:Copyright (c)2012
 * @公司名称：杭州商友全球网信息技术有限公司
 * @作者：limeng
 * @时间：Aug 20, 20121:34:00 PM
 */
package com.tzc.teacher.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tzc.teacher.utils.UrlPatternConsts;

/**
 * @描述：
 * @部门：研发部
 * @作者：limeng
 * @创建时间：Aug 20, 20121:34:00 PM
 */
@Controller
public class StaticController {


	@RequestMapping(value =UrlPatternConsts.PRICE_STATIC, method = RequestMethod.GET)
	public ModelAndView price(HttpServletRequest request, ModelAndView mav,@PathVariable String pageName) {
		mav.setViewName("/price/"+pageName);
		return mav;
	}
	
	@RequestMapping(value =UrlPatternConsts.NEWS_STATIC, method = RequestMethod.GET)
	public ModelAndView news(HttpServletRequest request, ModelAndView mav,@PathVariable String pageName) {
		mav.setViewName("/news/"+pageName);
		return mav;
	}

	
}


