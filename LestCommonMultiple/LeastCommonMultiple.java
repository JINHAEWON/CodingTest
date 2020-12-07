package it_is_for_the_codingtest;
import java.util.*;


public class codingtest {
	public static void main(String args[]) {
		int[] arr = {1,2,3};
		int chk = solution(arr);
		System.out.println(chk);
	}
	
	  public static int solution(int[] arr) {
	        int answer = 1;
	        int x=2;
	        
	        while(chekcing_while(arr)==true) {
	        	boolean check = false;
	        	
	        	while(check == false) {
	        		check = checking_divide(arr,x);
	        		if(check == false) 
	        			answer*=x;
	        	}
	        	x=next_number(x);
	        }
	        return answer;
	    }
	  
	  public static boolean chekcing_while(int[] arr) {
		  boolean check = false;
		  
		  for(int i=0;i<arr.length;i++) {
			  if(arr[i]!=1) {
				  check = true; // 하나라도 1이 아닐경우에는 계속 돌 수 있는 것 
				  break;
			  }
		  }
		  
		  return check;
	  }
	  
	  public static boolean checking_divide(int[] arr,int x) {
		  boolean check = true;
		  
		  for(int i=0;i<arr.length;i++) {
			  if(arr[i]%x==0) {
				  check = false;
				  arr[i]=arr[i]/x;
			  }
		  }
		  return check;
	  }

	  public static int next_number(int x) {
		  int answer=x;
		  boolean check = true;
		  
		  while(check) {
			  answer++;
			  for(int i=2; i<answer;i++) {
				  if(answer%i==0) break;
				  if(i==answer-1) check=false;
			  }
		  }
		  
		  return answer;
	  }
	  
}
