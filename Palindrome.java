package main.java.javabeginner.arrray;
import java.util.*;
import java.util.Arrays;
Class Palindrome{
    public static String longestPalindrome(String s) {
    	int n = s.length();
    	int index  = -1;
    	int maxlength = 0;
    	
    	for(int i = 0; i < n; i++) {
    		for (int j = i; j < n; j++) {
    			int isPalindrome = 1;
    		
    			for (int k = i; k <= j; k++) {
    				if (s.charAt(k) != s.charAt(j - (k - i))) {
    					isPalindrome = 0;
    				}
    			}
    			if (isPalindrome == 1 && j - i + 1 > maxlength) {
    				in1dex = i;
   				maxlength = j - i + 1;
    			}
    		}
    	} 
    	String ans = "";
    	for (int i = index; i < index + maxlength; i++) {
    		ans += s.charAt(i);
}
    	return ans;
    }
     
    public static void main(String[] args){
    	String word = new String("findnitianhere");
    	System.out.println(longestPalindrome(word));
    }
}
