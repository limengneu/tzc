/**
 * @文件名称：UrlPatternConsts.java
 * @类路径：com.school.teacher.utils
 * @版权:Copyright (c)2012
 * @公司名称：杭州商友全球网信息技术有限公司
 * @作者：limeng
 * @时间：Aug 16, 20128:15:56 PM
 */
package com.tzc.teacher.utils;

/**
 * @描述：
 * @部门：研发部
 * @作者：limeng
 * @创建时间：Aug 16, 20128:15:56 PM
 */
public class UrlPatternConsts {
	
	public static final String CARINFO_DETAIL = "/car/{carid}";
	
	public static final String CARINFO_FLOW = "/car/flow"; 
	
	public static final String CARINFO_CONTACT = "/car/contact"; 
	
	public static final String CARINFO_PRICE = "/car/price"; 
	
	public static final String CARINFO_INTRODUCE = "/car/introduce";
	
	public static final String CARINFO_SERVICE = "/car/service";
	
	public static final String CARINFO_LIST = "/category/{cateid}/{page}";
	public static final String CARINFO_CATEGORY = "/category";
	
	public static final String CARINFO_LIST_NOPAGE = "/category/{cateid}";
	
	public static final String ADD_CARINFO = "/admin/add";

	
	public static final String INIT_CARINFO = "/admin/init";
	
	public static final String INIT_CATEGORY = "/admin/initcategory";
	
	public static final String ADD_CARINFO_VIEW = "/admin/view";

}
