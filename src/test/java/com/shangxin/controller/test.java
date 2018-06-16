package com.shangxin.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();    
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");  
	    String dateNowStr = sdf.format(d);
	    System.out.println("格式化后的日期：" + dateNowStr);  
	}

}
