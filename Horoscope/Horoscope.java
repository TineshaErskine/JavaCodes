import java.util.Scanner;

public class Horoscope {
	
	public static void main(String[] args) {
		
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		// Declare boolean to activate loop
		int correct_date = 1;
		
		//start a loop
		do {
			
			// Prompt the user to input month
			System.out.print("\nEnter the month you were born MM: ");
			
			// Declare a variable for the user input day
			int month = input.nextInt();
			
			// Prompt the user to input day
			System.out.print("Enter the day you were born DD: ");
			
			// Declare a variable for the user input month
			int day = input.nextInt();
			
			//If date is higher than 31 days and 12 months
			if ( day >31 || month > 12)
				correct_date = 2;
			else
				correct_date = 1;
			
			
			// Switch statement for choosing the correct zodiac sign
			switch(correct_date) {
				case 1:
					switch(month) {
						case 1:
							if(day <= 19) {
								System.out.print("Your zodiac sign is a Capricorn");
							}
							else if(day >= 20 ) {
								System.out.print("Your zodiac sign is a Aquarius");
							}	
							break;
			
						case 2: 
							if(day <= 19) {
								System.out.print("Your zodiac sign is a Aquarius");
							}
							else if(day >= 20 ) {
								System.out.print("Your zodiac sign is a Pisces");
							}	
							break;
							
						case 3:
							if(day <= 20) {
								System.out.print("Your zodiac sign is a Pisces");
							}
							else if(day >= 21 ) {
								System.out.print("Your zodiac sign is a Aries");
							}	
							break;
						case 4:
							if(day <= 20) {
								System.out.print("Your zodiac sign is a Aries");
							}
							else if(day >= 21 ) {
								System.out.print("Your zodiac sign is a Taurus");
							}	
							break;
							
						case 5:
							if(day <= 20) {
								System.out.print("Your zodiac sign is a Taurus");
							}
							else if(day >= 21 ) {
								System.out.print("Your zodiac sign is a Gemini");
							}	
							break;
							
						case 6: 
							if(day <= 20) {
								System.out.print("Your zodiac sign is a Gemini");
							}
							else if(day >= 21 ) {
								System.out.print("Your zodiac sign is a Cancer");
							}	
							break;
							
						case 7:
							if(day <= 21) {
								System.out.print("Your zodiac sign is a Cancer.");
							}
							else if(day >= 22 ) {
								System.out.print("Your zodiac sign is a Leo.");
							}	
							break;
							
						case 8:
							if(day <= 22) {
								System.out.print("Your zodiac sign is a Leo.");
							}
							else if(day >= 23 ) {
								System.out.print("Your zodiac sign is a Virgo.");
							}	
							break;
							
						case 9: 
							if(day <= 21) {
								System.out.print("Your zodiac sign is a Virgo.");
							}
							else if(day >= 22 ) {
								System.out.print("Your zodiac sign is a Libra.");
							}	
							break;
							
						case 10:
							if(day <= 21) {
								System.out.print("Your zodiac sign is a Libra.");
							}
							else if(day >= 22 ) {
								System.out.print("Your zodiac sign is a Scorpio.");
							}	
							break;
							
						case 11:
							if(day <= 21) {
								System.out.print("Your zodiac sign is a Scorpio.");
							}
							else if(day >= 22 ) {
								System.out.print("Your zodiac sign is a Sagittarius.");
							}	
							break;
							
						case 12:
							if(day <= 21) {
								System.out.print("Your zodiac sign is a Sagittarius.");
							}
							else if(day >= 22 ) {
								System.out.print("Your zodiac sign is a Capricorn.");
							}	
							break;
							
						//default: System.out.print("Hmm it seems as if I couldn't find your sign. ");
					}
					break;
				case 2: System.out.print("Hmm it seems as if I couldn't find your sign. ");	
				}
			
		}while(correct_date == 2);
		
	}
}
