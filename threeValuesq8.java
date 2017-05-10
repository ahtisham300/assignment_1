//q 08 50%



import java.util.Scanner;

public class threeValuesq8 {
	public static void main(String[] args) {
	int array[]=new int [3];
	int array2[]=new int [3];	
	for(int i=0;i<3;i++){
		
		Scanner user_input = new Scanner( System.in );
	    System.out.print("Please enter int "+i);
	    array[i]= user_input.nextInt( );
		
		
		
	}
    
	boolean x=check_duplicate(array);
	int sum;
	
    if (x=true){
    	
    	sum=Sum(array);
    	System.out.print(sum);	
    }if (x=false){
    	int m=SumOfDoubles(array);
    	if (m>Sum(array)){
    		
    		for(int i=0;i<3;i++){
    		array2[0]=array[0]-getMinValue(array);
    		} //minus min from each valuse of array
    		
    		for( int i = 0; i < array2.length/2; ++i ) 
    		{ 
    		  int temp;			//for decending
    			temp = array2[i]; 
    		  array2[i] = array2[array2.length - i - 1]; 
    		  array2[array2.length - i - 1] = temp; 
    		
    		}
    	}
    	printMe(array2);
    }
    
    
    
    
	
	}
	
	public static boolean check_duplicate(int array[]){
	int a,b,c;
	
	
	a=array[0];
	b=array[1];
	c=array[2];
	
	
		if(a==b||b==c||a==c){	
		
	return true;
	
	}else{
		
		
		return false;
	}	
	
	}
	
	
	//sum
	public static int Sum (int array[]){
		
		int sum;
		
		
		sum=array[0]+array[1]+array[2];	
				
	return sum;	
	}
	
	public static int SumOfDoubles(int array[]) {
		
		int sumOfDobles=0;
		
		if(array[1]==array[2]){
			sumOfDobles=array[1]+array[2];
		}
		if(array[0]==array[2]){
			
			sumOfDobles=array[0]+array[2];
		}
		if(array[0]==array[1]){
			
			sumOfDobles=array[0]+array[1];
		}
		
		
		return sumOfDobles;
	}
	
	// getting the minimum value
	public static int getMinValue(int[] array) {
	    int minValue = array[0];
	    for (int i = 1; i < array.length; i++) {
	        if (array[i] < minValue) {
	            minValue = array[i];
	        }
	    }
	    return minValue;
	}

	 /** Printing array*/
	 public static void printMe(int  array[]) {

	  for (int i = 0; i < array.length; i++) {
	    System.out.print(array[i] + " ");

	  }
	  System.out.println();
	 }

}
	
