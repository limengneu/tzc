/**
 * @文件名称：LocalAddressUtil.java
 * @类路径：com.tzc.common.crawler.util
 * @版权:Copyright (c)2012
 * @作者：limeng
 * @时间：Oct 16, 20122:47:07 PM
 */
package com.tzc.common.crawler.util;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

import sun.net.util.IPAddressUtil;

/**
 * @描述：
 * @作者：limeng
 * @创建时间：Oct 16, 20122:47:07 PM
 */
public class LocalAddressUtil {

	public static String getLoaclAddressIP(){
		try {
            Enumeration<NetworkInterface> netInterfaces = NetworkInterface.getNetworkInterfaces();
            while (netInterfaces.hasMoreElements()) {
                NetworkInterface ni = netInterfaces.nextElement();
                Enumeration<InetAddress> ips = ni.getInetAddresses();
                while (ips.hasMoreElements()) {
                    String address = ips.nextElement().getHostAddress();
                    if (!"127.0.0.1".equals(address) && IPAddressUtil.isIPv4LiteralAddress(address)) {
                        return   address;
                        
                    }
                }
            }
        } catch (SocketException ignore) {
        }
		return null;
	}
}
