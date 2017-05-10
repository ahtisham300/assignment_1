//Q10

import java.util.Scanner;
import java.util.Arrays;

public class StingAlpaOrderq10{
	public static void main(String[] args) {
		
		 String s1;
		    
		    Scanner user_input = new Scanner( System.in );
		    System.out.print("Please enter any string");
		    s1= user_input.next( );
		    
		    
		    String s1lower=s1.toLowerCase();   
		    char ch[]=s1lower.toCharArray(); 
		    Arrays.sort(ch);
		    printMe(ch);	
	}

	 /** Printing array*/
	 public static void printMe(char array[]) {

	  for (int i = 0; i < array.length; i++) {
	    System.out.print(array[i] + " ");

	  }
	  System.out.println();
	 }
	  
}
