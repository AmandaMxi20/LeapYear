// this code checks if the year entered is a leap year or not
import java.util.Scanner;

public class LeapYear {
 
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a year: ");
        int year = in.nextInt();

        System.out.println("You have entered:"+(year));
        
       boolean leapYear = false;
       
        if (year%4==0 )
       {
    	  leapYear = true;	
       } 

        else if (year%100==0) {
		
          leapYear = false;
       }
        else if (year%400==0) {
		leapYear = true;
	} 
      
		
	  else {
	leapYear = false;	
	} 
	
       if (leapYear) {
		System.out.println("Year" +year+ " is a leap year");
	}
       else {
		System.out.println("year" + year + " is not a leap year");
	}
		
	}
    	         
      }
    
  
