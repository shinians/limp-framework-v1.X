package com.chinasofti.db;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class ZipUtil {

	// 压缩   
	 public static String compress(String str) throws IOException {   
	    if (str == null || str.length() == 0) {   
	     return str;   
	   }   
	    ByteArrayOutputStream out = new ByteArrayOutputStream();   
	   GZIPOutputStream gzip = new GZIPOutputStream(out);   
	    gzip.write(str.getBytes("UTF-8"));   
	    gzip.close();   
	   return out.toString("ISO-8859-1");   
	  }   
	  
	  // 解压缩   
	 public static String uncompress(String str) throws IOException {   
	    if (str == null || str.length() == 0) {   
	      return str;   
	  }   
	   ByteArrayOutputStream out = new ByteArrayOutputStream();   
	   ByteArrayInputStream in = new ByteArrayInputStream(str   
	        .getBytes("ISO-8859-1"));
	    GZIPInputStream gunzip = new GZIPInputStream(in);   
	    byte[] buffer = new byte[256];   
	    int n;   
	   while ((n = gunzip.read(buffer))>= 0) {   
	    out.write(buffer, 0, n);
	    }   
	    return out.toString("ISO-8859-1");
	  }   
	  
	  // 测试方法   
	  public static void main(String[] args) throws IOException {   
	         
	      //测试字符串   
		  String str="[{'shipName':'鲁荣远渔838'},{'shipName':'鲁荣远渔829'},{'shipName':'鲁荣远渔839'},{'shipName':'鲁荣远渔819'},{'shipName':'鲁荣渔0819'},{'shipName':'鲁荣远渔818'},{'shipName':'鲁荣渔0820'}]";   
	         
	      System.out.println("原长度："+str.length());     
	         
	      System.out.println("压缩后："+ZipUtil.compress(str));
	         
	      System.out.println("解压缩："+ZipUtil.uncompress(ZipUtil.compress(str)));
	      
	  }   
}
