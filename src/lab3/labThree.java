package lab3;
import java.util.Scanner;


public class labThree{
	public static void main(String[] args) {

       
    
        char option;
     do {
    	 Scanner sc=new Scanner(System.in);
    	    int input=sc.nextInt();
        if((input%2==1)&&(input>=1)&&(input<60)){
  System.out.println("odd");//condion-1
        }
             
        else if((input%2==0)&&(input>=2)&&(input>25))
        {
        System.out.println("even and less than 25");
        }//-condition2
             
        else  if((input%2==0) &&(input>=26)&&(input<=60))//condition-3
        {
         System.out.println("even");
        }
        
        else if ((input%2==0)&&(input>=60)&&(input<100))
        {
             
            	 System.out.println("even");//condition4
             }
        
     
         
             else if((input%2==1)&&(input>60)&&(input<=100))
            	 
             {
            	 System.out.println("odd and over 60");//condition5
             }
  
        System.out.println("Do you want to continue(Y/N)?");
        option=sc.next().charAt(0);
        
     }
     while((option!='n')&&(option!='N'));
 
     System.out.println("bye");  
        }
  
	
        
	}

	
	



