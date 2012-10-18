/**
 * @文件名称：CoursesController.java
 * @类路径：com.school.teacher.controller
 * @版权:Copyright (c)2012
 * @公司名称：杭州商友全球网信息技术有限公司
 * @作者：limeng
 * @时间：Aug 20, 20121:34:00 PM
 */
package com.tzc.teacher.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tzc.biz.model.CarInfo;
import com.tzc.biz.model.Category;
import com.tzc.biz.query.CarInfoQuery;
import com.tzc.biz.service.CarInfoService;
import com.tzc.biz.service.CategoryService;
import com.tzc.common.paginator.Paginator;
import com.tzc.teacher.utils.UrlPatternConsts;

/**
 * @描述：
 * @部门：研发部
 * @作者：limeng
 * @创建时间：Aug 20, 20121:34:00 PM
 */
@Controller
public class PriceController {


	@RequestMapping(value = "/price/flwl", method = RequestMethod.GET)
	public ModelAndView flow(HttpServletRequest request, ModelAndView mav) {
		mav.setViewName("/price/flwl");
		
		return mav;
	}
	@RequestMapping(value = "/price/fyqx", method = RequestMethod.GET)
	public ModelAndView contact(HttpServletRequest request, ModelAndView mav) {
		mav.setViewName("/price/fyqx");
		
		return mav;
	}
	
	@RequestMapping(value = "/price/jbc", method = RequestMethod.GET)
	public ModelAndView jbc(HttpServletRequest request, ModelAndView mav) {
		mav.setViewName("/price/jbc");
		
		return mav;
	}
	
	
	@RequestMapping(value ="/price/scqzc", method = RequestMethod.GET)
	public ModelAndView scqzc(HttpServletRequest request, ModelAndView mav) {
		mav.setViewName("/price/scqzc");
		
		return mav;
	}
	
	
	
	@RequestMapping(value = "/price/ljc", method = RequestMethod.GET)
	public ModelAndView ljc(HttpServletRequest request, ModelAndView mav) {
		mav.setViewName("/price/ljc");
		
		return mav;
	}
	
	@RequestMapping(value = "/price/zxc", method = RequestMethod.GET)
	public ModelAndView zxc(HttpServletRequest request, ModelAndView mav) {
		mav.setViewName("/price/zxc");
		
		return mav;
	}
	
	
	@RequestMapping(value ="/price/xwc", method = RequestMethod.GET)
	public ModelAndView xwc(HttpServletRequest request, ModelAndView mav) {
		mav.setViewName("/price/xwc");
		
		return mav;
	}
	
	@RequestMapping(value ="/price/xfc", method = RequestMethod.GET)
	public ModelAndView xfc(HttpServletRequest request, ModelAndView mav) {
		mav.setViewName("/price/xfc");
		
		return mav;
	}
	
	
	
	@RequestMapping(value = "/price/xfengc", method = RequestMethod.GET)
	public ModelAndView xfengc(HttpServletRequest request, ModelAndView mav) {
		mav.setViewName("/price/xfengc");
		
		return mav;
	}
	@RequestMapping(value = "/price/gtsljc", method = RequestMethod.GET)
	public ModelAndView gtsljc(HttpServletRequest request, ModelAndView mav) {
		mav.setViewName("/price/gtsljc");
		
		return mav;
	}
	
	
	@RequestMapping(value ="/price/bbljc", method = RequestMethod.GET)
	public ModelAndView bbljc(HttpServletRequest request, ModelAndView mav) {
		mav.setViewName("/price/bbljc");
		
		return mav;
	}
	
	
	
	@RequestMapping(value = "/price/ssc", method = RequestMethod.GET)
	public ModelAndView ssc(HttpServletRequest request, ModelAndView mav) {
		mav.setViewName("/price/ssc");
		
		return mav;
	}

	@RequestMapping(value = "/price/ygc", method = RequestMethod.GET)
	public ModelAndView ygc(HttpServletRequest request, ModelAndView mav) {
		mav.setViewName("/price/ygc");
		
		return mav;
	}
	
}


