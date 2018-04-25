package lab3;
import java.util.Scanner;


public class labThree{
	public static void main(String[] args) {
       
       String userName;
       Scanner name=new Scanner(System.in);
      System.out.println("Enter your name: ");
       userName=name.nextLine();
		
        char option;
     do {
    	 System.out.println("Hello "+userName+" enter a number between 1 and 100: ");
    	 Scanner sc=new Scanner(System.in);
 	    int input=sc.nextInt();
 	    System.out.println();
 	   System.out.print("hey "+userName+" your number "+input+" is ");
    	 
        if((input%2==1)&&(input>=1)&&(input<60)){
  System.out.println("odd");//condion-1
        }
             
        else if((input%2==0)&&(input>=2)&&(input<25))
        {
        System.out.println("even and less than 25.");
        
     
        }//-condition2
             
        else  if((input%2==0) &&(input>=26)&&(input<=60))//condition-3
        {
         System.out.println("even.");
        }
        
        else if ((input%2==0)&&(input>=60)&&(input<100))
        {
             
            	 System.out.println("even.");//condition4
             }
        
     
         
             else if((input%2==1)&&(input>60)&&(input<=100))
            	 
             {
            	 System.out.println("odd and over 60.");//condition5
             }
        
  
        System.out.println(userName+" would you like to continue(Y/N)?");
        option=sc.next().charAt(0);
        
     }
     while((option!='n')&&(option!='N'));
 
     System.out.println("Bye "+userName+"!");  
        }
  
	
        
	}

	
	



