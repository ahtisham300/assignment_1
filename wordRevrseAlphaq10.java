import java.util.Arrays;
import java.util.Scanner;

public class wordRevrseAlphaq10 {
	public static void main(String [] args)
	{
		String string;
		
		Scanner user_input = new Scanner( System.in );
	    System.out.print("Please enter any string");
	    string= user_input.next( );
		
	    String arranged;
	    arranged=Alphabet(string);
	    
	    System.out.print(arranged);
	
		
		
	}
	
	public static String Alphabet (String S){
		char stArray[]=S.toCharArray();
		
		
		Arrays.sort(stArray);
		return Arrays.toString(stArray);
		
	}

}
