package com.bit_etland.web.proxy;

import java.io.File;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.bit_etland.web.domain.ImageDTO;
import com.bit_etland.web.enums.Props;

public class ImageProxy implements Proxy{
	ImageDTO img = null;
	
	@Override
	public void carryOut(Object o) {
		
		/*
		 * System.out.println("?��미�??��록시 --------- 1 ------- "); HttpServletRequest request
		 * = (HttpServletRequest)o; if(!ServletFileUpload.isMultipartContent(request)){
		 * System.out.println("�??��?��?�� 리�?�스?���? ?��?��?��?��."); return; } FileItemFactory factory =
		 * new DiskFileItemFactory(); ServletFileUpload upload = new
		 * ServletFileUpload(factory); upload.setFileSizeMax(1024 * 1024 * 40); // 40 MB
		 * upload.setFileSizeMax(1024 * 1024 * 50); // 50 MB List<FileItem> items =
		 * null; try { File file = null; items = upload.parseRequest(new
		 * ServletRequestContext(request)); Iterator<FileItem> iter = items.iterator();
		 * while(iter.hasNext()){ FileItem item = iter.next(); if(!item.isFormField()){
		 * String fileName = item.getName(); file = new
		 * File(Props.IMAGE.getValue()+fileName); item.write(file); img = new
		 * ImageDTO(); img.setImgName(fileName.substring(0,fileName.indexOf(".")));
		 * System.out.println("?��?���? : " + fileName.substring(0,fileName.indexOf(".")));
		 * img.setImgExtention(fileName.substring(fileName.indexOf(".")+1));
		 * System.out.println("?��?��?�� : "+ fileName.substring(fileName.indexOf(".")+1));
		 * img.setOwner(request.getParameter("customer_Id"));
		 * System.out.println("?��미�? 주인�? : "+request.getParameter("customer_Id")); } } }
		 * catch (Exception e) { // TODO Auto-generated catch block e.printStackTrace();
		 * }
		 */
	}
}
