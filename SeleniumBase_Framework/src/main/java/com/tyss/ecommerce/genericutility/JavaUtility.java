package com.tyss.ecommerce.genericutility;

import java.time.LocalDateTime;

/**
 * @author abhijith
 */
public class JavaUtility {
	
	/**
	 * 
	 * @return String
	 * This method returns current system date and time in String format
	 */
	public String getSystemTime() {
		return LocalDateTime.now().toString();
	}
}
