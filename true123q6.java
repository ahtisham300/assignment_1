//6

import java.util.Arrays;
import java.util.Scanner;

public class true123q6 {
	
	public static void main(String[] args) {
		
			
		int array1[]=new int[10];
		
		
		for(int i=0;i<10;i++){
			Scanner user_input = new Scanner( System.in );
		    System.out.print("Please enter number in array at position " +i + " :");
		    array1[i]= user_input.nextInt( );
		  
		}
		int counter = 0;
		for(int i=0;i<10;i++){
			
		
		if (i%2!=0 && array1[i]==1){
			counter=counter+1;
			
		}
		if(i%2!=0 && array1[i]==2){
			counter=counter+1;}
		
		
		if(i%2!=0 && array1[i]==3){
			counter=counter+1;}
		
		}
		if (counter>=3){
			System.out.print("true");
		}
		
		else{System.out.print("false");}
		
		}
}
