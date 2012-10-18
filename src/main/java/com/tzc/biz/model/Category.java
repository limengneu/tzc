/**
 * @文件名称：Category.java
 * @类路径：com.tzc.biz.model
 * @版权:Copyright (c)2012
 * @作者：limeng
 * @时间：Oct 18, 20129:37:54 AM
 */
package com.tzc.biz.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @描述：
 * @作者：limeng
 * @创建时间：Oct 18, 20129:37:54 AM
 */
@Entity
public class Category extends BaseModel {
	
	@Column
	private String productCategory;//产品类目
	
	@Column(length = 1000)
	private String productCategoryName;//产品类目名称
	
	@Column(length = 1000)
	private String productDescription;//产品类目名称

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

	/**
	 * @return the productCategoryName
	 */
	public String getProductCategoryName() {
		return productCategoryName;
	}

	/**
	 * @param productCategoryName the productCategoryName to set
	 */
	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}

	/**
	 * @return the productDescription
	 */
	public String getProductDescription() {
		return productDescription;
	}

	/**
	 * @param productDescription the productDescription to set
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	
	
}
