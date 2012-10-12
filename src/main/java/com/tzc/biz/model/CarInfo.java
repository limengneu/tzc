/**
 * @文件名称：CarInfo.java
 * @类路径：com.tzc.biz.model
 * @版权:Copyright (c)2012
 * @作者：limeng
 * @时间：Oct 10, 20123:05:36 PM
 */
package com.tzc.biz.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @描述：
 * @作者：limeng
 * @创建时间：Oct 10, 20123:05:36 PM
 */
@Entity
public class CarInfo extends BaseModel{
	
	@Column
	private String productCategory;//产品名称
	@Column
	private String productName;//产品名称
	@Column
	private String noticeNo;//公告批次
	@Column
	private String chassisStyle;//底盘型号
	@Column
	private String emission; //排放标准
	@Column
	private String quality;//总质量
	@Column
	private String corner;//接近/离去角
	@Column
	private String realQuality;//额定质量
	@Column
	private String swing;//前悬后悬
	@Column
	private String equipQuality;//整备质量
	@Column
	private String maxSheep;//最高车速
	@Column
	private String axes;//轴数
	@Column
	private String beforeWheelbase;//前轮距
	@Column
	private String wheelbase;//轴距
	@Column
	private String afterWheelbase;//后轮距
	@Column
	private String tireNumbers;//轮胎数
	@Column
	private String tireStyle;//轮胎规格
	@Column
	private String fuelStyle;//燃料种类
	@Column
	private String springs;//弹簧片数
	@Column
	private String axleLoad;//轴荷
	@Column
	private String passenger;//前排乘客
	@Column
	private String dimensions;//外型尺寸
	@Column
	private String compartmentSize;//货厢尺寸
	@Column
	private String engineStyle;//发动机型号
	@Column
	private String engineDisplacement;//发动机排量(ML)
	@Column
	private String enginePower;//发动机功率(KW)
	@Column
	private String vehicleNotes;//整车备注
	@Column
	private String specialPerformance;//专用性能
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the noticeNo
	 */
	public String getNoticeNo() {
		return noticeNo;
	}
	/**
	 * @param noticeNo the noticeNo to set
	 */
	public void setNoticeNo(String noticeNo) {
		this.noticeNo = noticeNo;
	}
	/**
	 * @return the chassisStyle
	 */
	public String getChassisStyle() {
		return chassisStyle;
	}
	/**
	 * @param chassisStyle the chassisStyle to set
	 */
	public void setChassisStyle(String chassisStyle) {
		this.chassisStyle = chassisStyle;
	}
	/**
	 * @return the emission
	 */
	public String getEmission() {
		return emission;
	}
	/**
	 * @param emission the emission to set
	 */
	public void setEmission(String emission) {
		this.emission = emission;
	}
	/**
	 * @return the quality
	 */
	public String getQuality() {
		return quality;
	}
	/**
	 * @param quality the quality to set
	 */
	public void setQuality(String quality) {
		this.quality = quality;
	}
	/**
	 * @return the corner
	 */
	public String getCorner() {
		return corner;
	}
	/**
	 * @param corner the corner to set
	 */
	public void setCorner(String corner) {
		this.corner = corner;
	}
	/**
	 * @return the realQuality
	 */
	public String getRealQuality() {
		return realQuality;
	}
	/**
	 * @param realQuality the realQuality to set
	 */
	public void setRealQuality(String realQuality) {
		this.realQuality = realQuality;
	}
	/**
	 * @return the swing
	 */
	public String getSwing() {
		return swing;
	}
	/**
	 * @param swing the swing to set
	 */
	public void setSwing(String swing) {
		this.swing = swing;
	}
	/**
	 * @return the equipQuality
	 */
	public String getEquipQuality() {
		return equipQuality;
	}
	/**
	 * @param equipQuality the equipQuality to set
	 */
	public void setEquipQuality(String equipQuality) {
		this.equipQuality = equipQuality;
	}
	/**
	 * @return the maxSheep
	 */
	public String getMaxSheep() {
		return maxSheep;
	}
	/**
	 * @param maxSheep the maxSheep to set
	 */
	public void setMaxSheep(String maxSheep) {
		this.maxSheep = maxSheep;
	}
	/**
	 * @return the axes
	 */
	public String getAxes() {
		return axes;
	}
	/**
	 * @param axes the axes to set
	 */
	public void setAxes(String axes) {
		this.axes = axes;
	}
	/**
	 * @return the beforeWheelbase
	 */
	public String getBeforeWheelbase() {
		return beforeWheelbase;
	}
	/**
	 * @param beforeWheelbase the beforeWheelbase to set
	 */
	public void setBeforeWheelbase(String beforeWheelbase) {
		this.beforeWheelbase = beforeWheelbase;
	}
	/**
	 * @return the wheelbase
	 */
	public String getWheelbase() {
		return wheelbase;
	}
	/**
	 * @param wheelbase the wheelbase to set
	 */
	public void setWheelbase(String wheelbase) {
		this.wheelbase = wheelbase;
	}
	/**
	 * @return the afterWheelbase
	 */
	public String getAfterWheelbase() {
		return afterWheelbase;
	}
	/**
	 * @param afterWheelbase the afterWheelbase to set
	 */
	public void setAfterWheelbase(String afterWheelbase) {
		this.afterWheelbase = afterWheelbase;
	}
	/**
	 * @return the tireNumbers
	 */
	public String getTireNumbers() {
		return tireNumbers;
	}
	/**
	 * @param tireNumbers the tireNumbers to set
	 */
	public void setTireNumbers(String tireNumbers) {
		this.tireNumbers = tireNumbers;
	}
	/**
	 * @return the tireStyle
	 */
	public String getTireStyle() {
		return tireStyle;
	}
	/**
	 * @param tireStyle the tireStyle to set
	 */
	public void setTireStyle(String tireStyle) {
		this.tireStyle = tireStyle;
	}
	/**
	 * @return the fuelStyle
	 */
	public String getFuelStyle() {
		return fuelStyle;
	}
	/**
	 * @param fuelStyle the fuelStyle to set
	 */
	public void setFuelStyle(String fuelStyle) {
		this.fuelStyle = fuelStyle;
	}
	/**
	 * @return the springs
	 */
	public String getSprings() {
		return springs;
	}
	/**
	 * @param springs the springs to set
	 */
	public void setSprings(String springs) {
		this.springs = springs;
	}
	/**
	 * @return the axleLoad
	 */
	public String getAxleLoad() {
		return axleLoad;
	}
	/**
	 * @param axleLoad the axleLoad to set
	 */
	public void setAxleLoad(String axleLoad) {
		this.axleLoad = axleLoad;
	}
	/**
	 * @return the passenger
	 */
	public String getPassenger() {
		return passenger;
	}
	/**
	 * @param passenger the passenger to set
	 */
	public void setPassenger(String passenger) {
		this.passenger = passenger;
	}
	/**
	 * @return the dimensions
	 */
	public String getDimensions() {
		return dimensions;
	}
	/**
	 * @param dimensions the dimensions to set
	 */
	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}
	/**
	 * @return the compartmentSize
	 */
	public String getCompartmentSize() {
		return compartmentSize;
	}
	/**
	 * @param compartmentSize the compartmentSize to set
	 */
	public void setCompartmentSize(String compartmentSize) {
		this.compartmentSize = compartmentSize;
	}
	/**
	 * @return the engineStyle
	 */
	public String getEngineStyle() {
		return engineStyle;
	}
	/**
	 * @param engineStyle the engineStyle to set
	 */
	public void setEngineStyle(String engineStyle) {
		this.engineStyle = engineStyle;
	}
	/**
	 * @return the engineDisplacement
	 */
	public String getEngineDisplacement() {
		return engineDisplacement;
	}
	/**
	 * @param engineDisplacement the engineDisplacement to set
	 */
	public void setEngineDisplacement(String engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}
	/**
	 * @return the enginePower
	 */
	public String getEnginePower() {
		return enginePower;
	}
	/**
	 * @param enginePower the enginePower to set
	 */
	public void setEnginePower(String enginePower) {
		this.enginePower = enginePower;
	}
	/**
	 * @return the vehicleNotes
	 */
	public String getVehicleNotes() {
		return vehicleNotes;
	}
	/**
	 * @param vehicleNotes the vehicleNotes to set
	 */
	public void setVehicleNotes(String vehicleNotes) {
		this.vehicleNotes = vehicleNotes;
	}
	/**
	 * @return the specialPerformance
	 */
	public String getSpecialPerformance() {
		return specialPerformance;
	}
	/**
	 * @param specialPerformance the specialPerformance to set
	 */
	public void setSpecialPerformance(String specialPerformance) {
		this.specialPerformance = specialPerformance;
	}
	/**
	 * @return the productCategory
	 */
	public String getProductCategory() {
		return productCategory;
	}
	/**
	 * @param productCategory the productCategory to set
	 */
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	
	
	
}
