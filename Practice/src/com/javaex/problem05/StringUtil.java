package com.javaex.problem05;

public class StringUtil {
    
    public static String concatString(String[] arr){
       
    	String temp = "";
    	
    	 //String temp = arr[0] + arr[1] + arr[2];
//        String returnString = "";
//        for(String temp : arr) {
//          returnString += temp;
//        }

    	for (int i = 0; i<arr.length; i++) {
    		temp = temp + arr[i];
    	}
        //메소드 내용작성
        return temp;
//        return returnString;
	}


}
