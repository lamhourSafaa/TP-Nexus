package com.ncrm.formation;

public class StringUtils {

	String usingSubstringMethod(String text, int length) {
	    if (text.length() <= length) {
	        return text;
	    } else {
	        return text.substring(0, length);
	    }
	}
	
	
}
