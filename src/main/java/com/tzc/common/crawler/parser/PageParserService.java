/**
 * @文件名称：PagePaseser.java
 * @类路径：com.tzc.common.crawler.parser
 * @版权:Copyright (c)2012
 * @作者：limeng
 * @时间：Oct 16, 20122:37:17 PM
 */
package com.tzc.common.crawler.parser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tzc.biz.dao.CarinfoDao;
import com.tzc.biz.model.CarInfo;
import com.tzc.biz.util.CategoryUtil;
import com.tzc.common.crawler.fetch.FetcherConfig;
import com.tzc.common.crawler.fetch.PageFetcher;
import com.tzc.common.crawler.util.LocalAddressUtil;

/**
 * @描述：
 * @作者：limeng
 * @创建时间：Oct 16, 20122:37:17 PM
 */
@Component
public class PageParserService {
	private String localAddress = LocalAddressUtil.getLoaclAddressIP();
	private String DEFAULT_URL = "http://hbszdfzyc.com";

	private static final Log logger = LogFactory
			.getLog(PageParserService.class);

	@Autowired
	private CarinfoDao carInfoDao;

	public List<String> getAllCategory() {
		List<String> categoryUrl = new ArrayList<String>();
		FetcherConfig config = new FetcherConfig();
		config.setIp(localAddress);
		config.setUrl(DEFAULT_URL);
		config.setRequestTimeout(10);
		Document doc = PageFetcher.fetchPageAsDOM(config);
		List<Node> nodes = doc.selectNodes(getCategoryXpath());
		for (Node node : nodes) {
			String jsStatement = node.getStringValue().trim();
			categoryUrl.add(DEFAULT_URL + jsStatement);
		}
		return categoryUrl;
	}

	public int saveProductInfo() {
		FetcherConfig config = new FetcherConfig();
		config.setIp(localAddress);
		config.setRequestTimeout(10);
		int count = 1;
		config.setUrl("http://hbszdfzyc.com/Products-All");
		Document doc = PageFetcher.fetchPageAsDOM(config);
		String jsStatement = doc.selectSingleNode(getALLProductXpath())
				.getStringValue()
				.substring("/*摆臂式垃圾车*/ var product_list=new Array();".length());

		String[] splits = StringUtils.split(jsStatement, ");");
		for (int i = 0; i < splits.length; i++) {
			CarInfo carInfo = new CarInfo();
			String item = splits[i];
			item = StringUtils.replace(item, "product_list.push(", "");
			item = StringUtils.trim(item);
			if (!StringUtils.contains(item, "{")) {
				break;
			}

			String detailUrl = null;
			try {
				JSONObject jSONObject = JSONObject.fromObject(item);
				carInfo.setProductOldId(jSONObject.get("ID").toString());
				carInfo.setProductListName(jSONObject.get("TITLE").toString());
				carInfo.setProductCategory(CategoryUtil
						.getCategoryValue(jSONObject.get("ClassName")
								.toString()));
				carInfo.setProductCategoryName(jSONObject.get("ClassName")
						.toString());
				carInfo.setProductListImage(jSONObject.get("IMAGE").toString());
				detailUrl = "http://hbszdfzyc.com/Product-"
						+ jSONObject.get("ID");
				//downLoadImage(config,jSONObject.get("IMAGE").toString(),detailUrl);

			} catch (Exception e) {
				logger.error(e.getMessage());
				System.out.println(e.getMessage());
			}
			if (detailUrl == null) {
				System.out.println("************* the item is :************"
						+ item);
				continue;
			}

			config.setUrl(detailUrl);
			logger.error("the detail url is : " + detailUrl);

			System.out.println("the detail url is : " + detailUrl);
			Document detailDoc = PageFetcher.fetchPageAsDOM(config);

			List<Node> nodes = detailDoc.selectNodes(getProductDetail1Xpath());

			for (int nodeindex = 0; nodeindex < nodes.size(); nodeindex++) {
				Node node = nodes.get(nodeindex);
				String detailStatement = node.getStringValue().trim();
				if (nodeindex == 1) {
					carInfo.setProductName(detailStatement);
				}
				if (nodeindex == 3) {
					carInfo.setNoticeNo(detailStatement);
				}

				if (nodeindex == 5) {
					carInfo.setChassisStyle(detailStatement);
				}
				if (nodeindex == 7) {
					carInfo.setEmission(detailStatement);
				}
				if (nodeindex == 9) {
					carInfo.setQuality(detailStatement);
				}
				if (nodeindex == 11) {
					carInfo.setCorner(detailStatement);
				}
				if (nodeindex == 13) {
					carInfo.setRealQuality(detailStatement);
				}
				if (nodeindex == 15) {
					carInfo.setSwing(detailStatement);
				}
				if (nodeindex == 17) {
					carInfo.setEquipQuality(detailStatement);
				}
				if (nodeindex == 19) {
					carInfo.setMaxSheep(detailStatement);
				}
				if (nodeindex == 21) {
					carInfo.setAxes(detailStatement);
				}
				if (nodeindex == 23) {
					carInfo.setBeforeWheelbase(detailStatement);
				}
				if (nodeindex == 25) {
					carInfo.setWheelbase(detailStatement);
				}
				if (nodeindex == 27) {
					carInfo.setAfterWheelbase(detailStatement);
				}
				if (nodeindex == 29) {
					carInfo.setTireNumbers(detailStatement);
				}
				if (nodeindex == 31) {
					carInfo.setTireStyle(detailStatement);
				}
				if (nodeindex == 33) {
					carInfo.setFuelStyle(detailStatement);
				}
				if (nodeindex == 35) {
					carInfo.setSprings(detailStatement);
				}
				if (nodeindex == 37) {
					carInfo.setAxleLoad(detailStatement);
				}
				if (nodeindex == 39) {
					carInfo.setPassenger(detailStatement);
				}
				if (nodeindex == 41) {
					carInfo.setDimensions(detailStatement);
				}
				if (nodeindex == 43) {
					carInfo.setCompartmentSize(detailStatement);
				}
			}

			List<Node> lnodes = detailDoc.selectNodes(getProductDetail2Xpath());
			for (int dnodeindex = 0; dnodeindex < lnodes.size(); dnodeindex++) {
				Node node = lnodes.get(dnodeindex);
				String detailStatement = node.getStringValue().trim();

				if (dnodeindex == 1) {
					carInfo.setVehicleNotes(detailStatement);
				}
				if (dnodeindex == 3) {
					carInfo.setSpecialPerformance(detailStatement);
				}
			}

			List<Node> powernodes = detailDoc
					.selectNodes(getProductDetail3Xpath());
			for (int dnodeindex = 0; dnodeindex < powernodes.size(); dnodeindex++) {
				Node node = powernodes.get(dnodeindex);
				String detailStatement = node.getStringValue().trim();
				detailStatement = StringUtils.replace(detailStatement, "\n\t",
						"<br>");
				detailStatement = StringUtils
						.replace(detailStatement, "\t", "");
				if (dnodeindex == 3) {
					carInfo.setEngineStyle(detailStatement);
				}
				if (dnodeindex == 4) {
					carInfo.setEngineDisplacement(detailStatement);
				}
				if (dnodeindex == 5) {
					carInfo.setEnginePower(detailStatement);
				}
			}
			String image1 =detailDoc.selectSingleNode("//IMG[@id='p1']//@src").getStringValue();
		//	downLoadImage(config,image1,detailUrl);
			carInfo.setProductDetailImage1(image1);
			  
			List<Node> imgnodes = detailDoc.selectNodes("//IMG[@title='后部照片']//@src");
		        for(int dnodeindex = 0; dnodeindex < imgnodes.size(); dnodeindex++){
		        	Node node = imgnodes.get(dnodeindex);
		        	if(dnodeindex==0){
		        	String image2 = node.getStringValue().trim();
		        //	downLoadImage(config,image2,detailUrl);
					carInfo.setProductDetailImage2(image2);
		        	}
		        	if(dnodeindex==1){
			        	String image3 = node.getStringValue().trim();
			        	//downLoadImage(config,image3,detailUrl);
						carInfo.setProductDetailImage3(image3);
			        }
		        }
			
			logger.error("save message is: " + carInfo.getProductName()
					+ " the count is: " + count);

			System.out.println("save message is: " + carInfo.getProductName()
					+ " the count is: " + count);
			carInfoDao.save(carInfo);
			count++;
		}

		return count;

	}

	/**
	 * 获取类目的url的xpath
	 * 
	 * @方法功能说明：
	 * @修改者名字: limeng
	 * @修改时间：Oct 16, 20122:50:01 PM
	 * @参数：@return
	 * @return:String
	 */
	private String getCategoryXpath() {
		return "//DIV[@id='ProductMenuDiv']//@href";
	}

	private String getALLProductXpath() {
		return "//DIV[@id='main']//SCRIPT";
	}

	private String getProductDetail1Xpath() {
		return "//DIV[@id='pdetail']//TBODY//TR[@align='left']//TD";
	}

	private String getProductDetail2Xpath() {
		return "//DIV[@id='pdetail']//TBODY//TR//TD[@valign='center']";
	}

	private String getProductDetail3Xpath() {
		return "//DIV[@id='pdetail']/CENTER/TABLE/TBODY/TR/TD/TABLE//TD";
	}

	public void downLoadImage(FetcherConfig config, String url,String detail) {
		
		
		String imageUrl = DEFAULT_URL + url;
		config.setUrl(imageUrl);

		byte[] iamge = PageFetcher.fetchPageAsByteArray(config);
		File storeFile = new File(
				"/home/limeng/work/tzc/src/main/webapp/statics/image" + url);
		try {
			FileUtils.touch(storeFile);
			FileUtils.writeByteArrayToFile(storeFile, iamge);
		} catch (Exception e) {
			logger.error(e.getMessage() + "downLoadImage error"+imageUrl, e);
			System.out.println("###### downLoadImage error ##### the detail id is: "+detail +"  the image is : "+imageUrl);
		}

	}

}
