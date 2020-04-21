package com.config;

import java.text.SimpleDateFormat;
import java.util.Date;

public class baseclass {
	public static String Get_ImageFilePath() {
		  SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");  
		    Date date = new Date();  
		// String imagefilepath="C:\\screenshots\\Idea_Reports\\img\\" + formatter.format(date)+".png";
	// String imagefilepath="C:\\screenshots\\SIT_reports\\img\\" + formatter.format(date)+".png";
		   
		   
		    String imagefilepath="img2/" + formatter.format(date)+".png";

		   return imagefilepath;
	}  
}
