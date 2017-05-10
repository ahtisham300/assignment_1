//Q3 100%

import java.util.Arrays;
import java.util.Scanner;


public class vowelsAddition {
	public static void main(String[] args) {
	
	char  array1[]= new char[5]; 
	char  array2[]= new char[5];
	char  array3[]= new char[12];
	
	String input;
    
    for(int i=0;i<5;i++){
    char s1;
    Scanner user_input = new Scanner( System.in );
    System.out.println("Please enter char "+ i +" in array 1: ");
    s1=user_input.next().charAt(0); 
      
    array1[i]=s1;
	
    
    }
    
    
    for(int i=0;i<5;i++){
    char s1;
    Scanner user2_input = new Scanner( System.in );
    System.out.println("Please enter char "+ i +" in array 2: ");
    s1=user2_input.next().charAt(0); //as error control
    
    
    array2[i]=s1;
	
    
    }

    merge(array1,array2,array3);
    
    
    
    System.out.println("array 1");
    printMe(array1);
    System.out.println("array 1");
    printMe(array2);
    
    Arrays.sort(array3);
    System.out.println();
    
	
    char array4[]= new char[12];
    
   for(int k=0;k<12;k++){
	   if(array3[k]=='a'||array3[k]=='i'||array3[k]=='o'||array3[k]=='u'||array3[k]=='e'){
		   
		   array4[k]=array3[k];
		   
		   
		   
	   }
	   
	   
   }
   System.out.println("sorted with vowels");

   for (int i = 0; i < array4.length; i++) { 
	   for (int j = i + 1 ; j < array4.length; j++) { 
		   if (array4[i]==array4[j]) {
			   array4[i]='x';
		   }
		   
	   }
   }
  
   Arrays.sort(array4);
   printMe(array4);
    
	
	}

		
	
	 /** Printing array*/
	 public static void printMe(char array[]) {

	  for (int i = 0; i < array.length; i++) {
	    System.out.print(array[i] + " ");

	  }
	  System.out.println();
	 }
	  
	 
	 

		//merging method 

	 public static char[] merge(char[] a, char[] b, char[] c) {

		
		    int i = 0, j = 0, k = 0;

		    while (i < a.length && j < b.length)  
		    	
		    c[k++] = a[i] < b[j] ? a[i++] :  b[j++];

		       
		    while (i < a.length)  
		
		    	c[k++] = a[i++];
		   

		    while (j < b.length)    
		    	
		    	c[k++] = b[j++];
		    
		    return c;
		}

 


	





}