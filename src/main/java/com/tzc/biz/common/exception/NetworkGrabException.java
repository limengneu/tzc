/**
 * @文件名称：NetworkGrabException.java
 * @类路径：com.tzc.biz.common.exception
 * @版权:Copyright (c)2012
 * @作者：limeng
 * @时间：Oct 12, 20124:25:39 PM
 */
package com.tzc.biz.common.exception;

/**
 * @描述：
 * @作者：limeng
 * @创建时间：Oct 12, 20124:25:39 PM
 */
public class NetworkGrabException extends RuntimeException{

	/**
	 * @FieldsserialVersionUID:TODO
	 */
	
	private static final long serialVersionUID = 1L;

	public NetworkGrabException() {
		super();
	}

	public NetworkGrabException(String message) {
		super(message);
	}

	public NetworkGrabException(String message, Throwable cause) {
		super(message, cause);
	}

	public NetworkGrabException(Throwable e) {
		this(e.getMessage(), e);
	}
}
