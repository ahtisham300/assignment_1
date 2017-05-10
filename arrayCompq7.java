//Q7

import java.util.Scanner;

public class arrayCompq7 {
	
	public static void main(String[] args) {
		
		int x=1;int y=1;
		
		
		
		Scanner user_input = new Scanner( System.in );
	    System.out.print("Size or array 1 ? ");
	    x= user_input.nextInt( );
	    int array1[]=new int[x];
	    for(int i=0;i<x;i++){
	    	System.out.print("data in array 1 value "+i+1 +": ");
	    	
	    	
	    	Scanner user_inputarary1 = new Scanner( System.in );
		    array1[i]= user_inputarary1.nextInt( );
	    	
	    }
	    
	    
	    
	    
	    Scanner user_input2 = new Scanner( System.in );
	    System.out.print("Size or array 1 ? ");
	    y= user_input2.nextInt( );
	    int array2[]=new int[y];
	    
	    for(int i=0;i<y;i++){
	    	System.out.print("data in array 1 value "+i+1 +": ");
	    	
	    	
	    	Scanner user_inputarary2 = new Scanner( System.in );
		    array2[i]= user_inputarary2.nextInt( );
	    	
	    }
	    
	    
	    if(test(array1,array2)== true);
	    System.out.print("there is a match ");
	     	
		
		
	}
	
	public static boolean test(int array1[],int array2[]){ 
	int val1, val2;
	val1=array1[0];
	val2=array1[array1.length-1];
    
    
	int val3, val4;
	val3=array2[0];
	val4=array2[array2.length-1];

	
	
	if (val1==val3 || val2==val4){
		

		return true;
		
	}
			
	else{
		
		return false;	
		
		
	}
	}
}
