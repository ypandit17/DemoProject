package Shivani_Birthday;

import java.time.LocalDate;
import java.time.Month;

public class Shivani_BirhDay {
	  public static void main(String args[]) {

		    
		    int birthDate = 29;
		    Month birthMonth = Month.JUNE;

		   
		    LocalDate currentDate = LocalDate.now();
		    System.out.println("Todays Date: " + currentDate);

		    
		    int date = currentDate.getDayOfMonth();
		    Month month = currentDate.getMonth();

		    if(date == birthDate && month == birthMonth) {
		      System.out.println("HAPPY BIRTHDAY SCHOLAR SHIVANI (CHOTE NAWAB)!!");
		    }
		    else {
		      System.out.println("Today is not my birthday.");
		    }
		   }

}
