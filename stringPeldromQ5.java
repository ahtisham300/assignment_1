//q8

import java.util.Scanner;

public class stringPeldromQ5 {
	
	public static void main (String[] args){
		
		String one ;
		int copies;
		
		
	    Scanner user_input = new Scanner( System.in );
	    System.out.println("Please enter String: ");
	    one=user_input.next(); 
		
		 Scanner user_input1 = new Scanner( System.in );
		    System.out.println("Please enter number of  Copies to print  : ");
		    copies=user_input1.nextInt(); 
		
		
		 String input=one;// reverser form stack overflow
		  StringBuilder input1 = new StringBuilder();
		  input1.append(input);
		  input1=input1.reverse(); 
		  for (int i=0;i<input1.length();i++)
		  System.out.print(input1.charAt(i));  
		;
		
if(input1.toString()==one){
	
	for(int i=0;i<=copies;i++){
		
		System.out.print(one);
	} 


	
}else{
	
	for(int i=0;i<=copies;i++){
		
		System.out.print(input1);
	} 

	
	
}		
		
	}
	
	
	

}
