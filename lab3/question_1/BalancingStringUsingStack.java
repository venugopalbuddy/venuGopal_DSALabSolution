package com.lab3.question_1;

import java.util.Stack;

public class BalancingStringUsingStack {
	
	

	public boolean isStringBalanced(String data) {
		Stack<Character>stack=new Stack<Character>();
		char arr[]=data.toCharArray();
		int len = arr.length;
		if (len%2!=0) {
			return false;
		}
		else {
			for(int i=0;i<(len/2);i++) {
				char a= arr[i];
				stack.push(a);
			}
		}
		
		//System.out.println(stack.peek());
		boolean flag=false;
		for (int i=len/2;i<len;i++) {
			 char x= stack.pop();
			 //System.out.print(x+","+arr[i]);
			 if(x==arr[i]) {
				 flag=true;
			 }
			 else {
				 flag=false;
			 }
			 
		}
		if (flag==true) {
			return false;
		}
		else {
			return true;
		}
		/*for(int i=0;i<data.length();i++) {
			char ch = data.charAt(i);
			System.out.println(ch);
			if (ch=='('|| ch=='['||ch=='{') {
				stack.push(ch);
				continue; 
			}
			
			char c;
			switch(ch) {
			case'(':c = stack.pop();
			      if(c=='{' || c=='[') {
			    	  System.out.println("a");
			    	  return false;
			      }
			break;
			case'[':c = stack.pop();
		      if(c=='(' || c=='{') {
		    	  System.out.println("b");
		    	  return false; 
		      }
		      break;
			case'{': c = stack.pop();
		      if(c=='(' || c=='[') {
		    	  System.out.println("c");
		    	  return false;
		    	  
		      }
		      break;
			}
			
		}
		
		return stack.isEmpty();*/
		
}
}