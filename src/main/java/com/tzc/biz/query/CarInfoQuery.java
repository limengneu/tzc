/**
 * @文件名称：CarInfoQuery.java
 * @类路径：com.tzc.biz.query
 * @版权:Copyright (c)2012
 * @作者：limeng
 * @时间：Oct 16, 20128:35:07 PM
 */
package com.tzc.biz.query;

import java.util.List;

import com.tzc.biz.model.CarInfo;

/**
 * @描述：
 * @作者：limeng
 * @创建时间：Oct 16, 20128:35:07 PM
 */
public class CarInfoQuery {

	public static int DEFAULT_PAGE_SIZE=6;
	
	private int pageCount;
	private int itemCount;
	
	private int currentPage;
	
	private List<CarInfo> carInfos;

	/**
	 * @return the pageCount
	 */
	public int getPageCount() {
		return pageCount;
	}

	/**
	 * @param pageCount the pageCount to set
	 */
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	/**
	 * @return the carInfos
	 */
	public List<CarInfo> getCarInfos() {
		return carInfos;
	}

	/**
	 * @param carInfos the carInfos to set
	 */
	public void setCarInfos(List<CarInfo> carInfos) {
		this.carInfos = carInfos;
	}

	/**
	 * @return the currentPage
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/**
	 * @param currentPage the currentPage to set
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * @return the itemCount
	 */
	public int getItemCount() {
		return itemCount;
	}

	/**
	 * @param itemCount the itemCount to set
	 */
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	
	
	
}
