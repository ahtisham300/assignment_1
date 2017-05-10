//Q4

import java.util.Scanner;
import java.util.Arrays;
public class arraylargNumQ4 {
	public static void main(String[] args) {

		int array []= {90,30,25,69,81,125,22,36,20,56,15};

    
		Arrays.sort(array);
		System.out.println("sorted array");
		printMe(array);
		
		
		
		if (array[9]+(array[9]*0.20)<array[10]){
			System.out.println("Third largest");
			System.out.println(array[8]);
			System.out.println("Second largest");
			System.out.println(array[9]);
		
		}
    
   
    

	}
	 /** Printing array*/
	 public static void printMe(int array[]) {

	  for (int i = 0; i < array.length; i++) {
	    System.out.print(array[i] + " ");

	  }
	  System.out.println();
	 }
	  




}	