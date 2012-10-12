/**
 * @文件名称：VedioService.java
 * @类路径：com.school.biz.service
 * @版权:Copyright (c)2012
 * @公司名称：杭州商友全球网信息技术有限公司
 * @作者：limeng
 * @时间：Aug 16, 20124:07:17 PM
 */
package com.tzc.biz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tzc.biz.dao.CarinfoDao;
import com.tzc.biz.model.CarInfo;

/**
 * @描述：
 * @部门：研发部
 * @作者：limeng
 * @创建时间：Aug 16, 20124:07:17 PM
 */
@Component
public class CarInfoService {

	@Autowired
	private CarinfoDao carInfoDao;

	public CarInfo saveCarInfo(CarInfo carInfo) {
		return carInfoDao.save(carInfo);
	}

	public CarInfo updateCarInfo(CarInfo carInfo) {
		return carInfoDao.save(carInfo);
	}

	public CarInfo findCarInfo(String column, String value) {
		return carInfoDao.findByValue(column, value);
	}

	public CarInfo findCarInfoById(Integer vedioId) {
		return carInfoDao.find(vedioId);
	}

	public List<CarInfo> findCarInfos(String column, String value) {
		return carInfoDao.findListByValue(column, value);
	}

}