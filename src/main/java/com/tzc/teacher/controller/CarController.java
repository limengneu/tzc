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
public class CarController {

	@Autowired
	private CarInfoService carInfoService;

	@Autowired
	private CategoryService categoryService;

	/**
	 * 
	 * @方法功能说明：
	 * @修改者名字: limeng
	 * @修改时间：Aug 20, 20121:36:14 PM
	 * @参数：
	 * @return:void
	 */
	@RequestMapping(value = UrlPatternConsts.CARINFO_DETAIL, method = RequestMethod.GET)
	public ModelAndView detail(HttpServletRequest request, ModelAndView mav,
			@PathVariable Integer carid) {
		mav.setViewName("car/detail");
		CarInfo carInfo = carInfoService.findCarInfoById(carid);
		mav.addObject("carInfo", carInfo);
		return mav;
	}

	
	@RequestMapping(value = UrlPatternConsts.CARINFO_FLOW, method = RequestMethod.GET)
	public ModelAndView flow(HttpServletRequest request, ModelAndView mav) {
		mav.setViewName("car/flow");
		
		return mav;
	}
	
	@RequestMapping(value = UrlPatternConsts.CARINFO_CULTURE, method = RequestMethod.GET)
	public ModelAndView culture(HttpServletRequest request, ModelAndView mav) {
		mav.setViewName("car/culture");
		
		return mav;
	}
	@RequestMapping(value = UrlPatternConsts.CARINFO_HONOUR, method = RequestMethod.GET)
	public ModelAndView honour(HttpServletRequest request, ModelAndView mav) {
		mav.setViewName("car/honour");
		
		return mav;
	}
	@RequestMapping(value = UrlPatternConsts.CARINFO_CONTACT, method = RequestMethod.GET)
	public ModelAndView contact(HttpServletRequest request, ModelAndView mav) {
		mav.setViewName("car/contact");
		
		return mav;
	}
	
	@RequestMapping(value = UrlPatternConsts.CARINFO_PRICE, method = RequestMethod.GET)
	public ModelAndView price(HttpServletRequest request, ModelAndView mav) {
		mav.setViewName("car/price");
		
		return mav;
	}
	
	
	@RequestMapping(value = UrlPatternConsts.CARINFO_SERVICE, method = RequestMethod.GET)
	public ModelAndView service(HttpServletRequest request, ModelAndView mav) {
		mav.setViewName("car/service");
		
		return mav;
	}
	
	
	
	@RequestMapping(value = UrlPatternConsts.CARINFO_INTRODUCE, method = RequestMethod.GET)
	public ModelAndView introduce(HttpServletRequest request, ModelAndView mav) {
		mav.setViewName("car/introduce");
		
		return mav;
	}
	/**
	 * 
	 * @方法功能说明：
	 * @修改者名字: limeng
	 * @修改时间：Oct 16, 20127:40:38 PM
	 * @参数：@param request
	 * @参数：@param mav
	 * @参数：@param carid
	 * @return:void
	 */
	@RequestMapping(value = UrlPatternConsts.CARINFO_LIST_NOPAGE, method = RequestMethod.GET)
	public ModelAndView listnopage(HttpServletRequest request,
			ModelAndView mav, @PathVariable String cateid) {
		listinner(mav, cateid, 1);
		return mav;
	}

	@RequestMapping(value = UrlPatternConsts.CARINFO_LIST, method = RequestMethod.GET)
	public ModelAndView list(HttpServletRequest request, ModelAndView mav,
			@PathVariable String cateid, @PathVariable Integer page) {
		listinner(mav, cateid, page);
		return mav;
	}
	
	@RequestMapping(value = UrlPatternConsts.CARINFO_CATEGORY, method = RequestMethod.GET)
	public ModelAndView categorylist(HttpServletRequest request, ModelAndView mav) {
		listinner(mav, "xfc", 1);
		return mav;
	}

	/**
	 * @方法功能说明：
	 * @修改者名字: limeng
	 * @修改时间：Oct 18, 201211:26:34 AM
	 * @参数：@param mav
	 * @参数：@param cateid
	 * @参数：@param page
	 * @return:void
	 */
	private void listinner(ModelAndView mav, String cateid, Integer page) {
		mav.setViewName("car/list");
		CarInfoQuery carInfoQuery = carInfoService.findCarByPage(cateid, page,
				CarInfoQuery.DEFAULT_PAGE_SIZE);
		carInfoQuery.setCurrentPage(page);
		mav.addObject("carInfoQuery", carInfoQuery);
		Map<String, Object> optionalArgumentMap = new HashMap<String, Object>();
		optionalArgumentMap.put("cateid", cateid);
		Category category = categoryService.getCategoryById(cateid);
		mav.addObject("category", category);
		Paginator paginator = new Paginator(UrlPatternConsts.CARINFO_LIST,
				page, CarInfoQuery.DEFAULT_PAGE_SIZE,
				carInfoQuery.getItemCount(), carInfoQuery.getPageCount(),
				optionalArgumentMap);
		mav.addObject("paginator", paginator);
	}

}
