package com.app.stringcalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/*
 * public class StringCalculator {
 * 
 * public int Add(String input) { String [] arr = input.split(",");
 * if(input.isEmpty()) { return 0; }else if(input.length()==1){ return
 * convertStringToInteger(input); }else { return getSum(arr[0],arr[1]); } }
 * 
 * public int convertStringToInteger(String input) { return
 * Integer.parseInt(input); }
 * 
 * public int getSum(String value1,String value2) { return
 * convertStringToInteger(value1)+convertStringToInteger(value2); } }
 */
class StringCalculator  {
	 public static void main(String args[]) {
		// TODO Auto-generated method stub
		 String test = "{Test{Test2}{Test3{test4}}}";
		 List<String> t = data(test,2);
	}
	
	
	public static List<String> data(String l,int k){
		Stack<Character> s = new Stack<>();
		String[] arr = l.split("\\{");
		List<String> st = new ArrayList<>();
		int count=0;
		int v = 0;
		for(int i=0;i<l.length();i++) {
			char ch = l.charAt(i);
			if(ch=='{') {
				s.push(ch);
				count++;
				v++;
			}
			if(ch=='}') {
				s.pop();
			}
			if(count==k) {
				System.out.println(arr[v]);
				st.add(arr[v]);
				count--;
			}
		}
		
		return st;
	}
}