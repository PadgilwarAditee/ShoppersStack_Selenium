package com.shopperStack.generalUtility;

import java.time.LocalDate;
import java.util.Random;

public class JavaUtility {
	
		public int randomNo() {
			
			Random r= new Random();
			int num= r.nextInt(1000);
			return num;
		}
		
		public String localdate() {
			String date=LocalDate.now().toString().replace("_","");
			return date;
		}
		
		public String localdateTime() {
			String dateTime=LocalDate.now().toString().replace("_","");
			return dateTime;
		}
}
