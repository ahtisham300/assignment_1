//q2

import java.util.Scanner;

public class VowelsDetection {
	
	
    public static void main(String args[]){  
    	int a = 0,e = 0,i = 0,o = 0,u=0,other =0;
    String s1;
    
    Scanner user_input = new Scanner( System.in );
    System.out.print("Please enter any string");
    s1= user_input.next( );
    
    
    String s1lower=s1.toLowerCase();   
    char ch[]=s1lower.toCharArray();  
    
      
    for(int m=0;m<ch.length;m++){
    	
    	switch(ch[m]) {
    		case 'a' :
    			a=a+1;
    			break; 
    
    		case 'e' :
    			e=e+1;;
    			break;     
    
    		case 'i' :
    			i=i+1;
    		break; 
        
    		case 'o' :
    			o=o+1;
    			break; 
        
    		case 'u' :
    			u=u+1;
    			break; 
        
   
    		default :
    			other = other+1; 
    		break;
      
    	} 
  
    }
    
    int ae=0,ei=0,io=0,ou=0;
    for(int n=0;n<ch.length;n++){
    	if (ch[n]=='a'&&ch[n+1]=='e'){
    	ae=1; 		
    	}
    }
    	for(int p=0;p<ch.length;p++){
        	if (ch[p]=='e'&&ch[p+1]=='i'){
        	ei=1; 		
        	}
    	}
        	for(int q=0;q<ch.length;q++){
            	if (ch[q]=='i'&&ch[q+1]=='o'){
            	io=1; 		
            	}
        	}
            	for(int r=0;r<ch.length;r++){
                	if (ch[r]=='o'&&ch[r+1]=='u'){
                	ou=1; 		
                	}
            	}	
                
            	if (a>0 && e>0 && i> 0 && o>0 && u>0 && ae>0 && ei>0 && io>0 && ou>0 ){
            		
            		
            			
            			 System.out.println("u "+u);
            			 System.out.println("o "+o);
            			 System.out.println("i "+i);
            			 System.out.println("e "+e);
            			 System.out.println("a "+a);
            			 System.out.println("ae "+ae);
            			 System.out.println("ei "+ei);
            			 System.out.println("io "+io);
            			 System.out.println("ou "+ou);
            		
            		
            		
            	}
            	else{
            		System.out.println("no vowel");
            	}
    }


}




