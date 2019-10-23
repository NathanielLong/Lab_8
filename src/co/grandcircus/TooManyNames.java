package co.grandcircus;
import java.util.Random;
import java.util.Scanner;
public class TooManyNames {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] classNames = {" ","Alicia Allison", "Broederick Bronson", "Cathy Clemens", "Derick Dromes", "Ericka Embers",
							   "Francis Frank", "Gordy Gordon", "Harrison Heckles", "Ignacio Ignoramus", "Julia Jameson"};
		String[] homeTown = {" ", "Detroit", "Troy", "Bloomfield", "Orchard Lake", "Clinton Township", "Outer-Space"};
		String[] hobby = {" ", "Playing video-games", "Reading", "Sports", "Sleeping", "Coding", "Eating pickles"};
		char tryAgain = 'y';
		
		do {
			try { 
		System.out.println("Welcome to our Java Class! \nWho would you like to learn about? (Enter a number 1-10): ");
		int classNumber = scan.nextInt();
		String classmateName = classNames[classNumber];

		System.out.println("That would be " + classmateName + ". What would you like to know about " + classmateName + "? (hometown or hobby): " );
		String userChoices = scan.next().toLowerCase();
		switch(userChoices) {
		case "hometown":
			System.out.println("He/She lives in " + randomizeHomeTown(userChoices) + ".");
			break;
		case "hobby":
			System.out.println("He/She likes to " + randomizeHobby(userChoices) + ".");
			break;
		default: 
			System.out.println("Please enter 'hometown' or 'hobby'...");
		} 
			}catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
			 System.out.println("Please enter a number between 1 - 10!");
			 System.out.println("Error message: " + e.getMessage());
		}
		System.out.println("Would you like to learn more and/or try again? (y/n): ");
		tryAgain = scan.next().charAt(0);
		} while(tryAgain == 'y');
		System.out.println("Good-bye!");
		
	}
	private static String randomizeHomeTown(String userChoices) {
		String[] homeTown = {"Detroit", "Troy", "Bloomfield", "Orchard Lake", "Clinton Township", "Outer-Space"};
		Random rand = new Random();
		int randHome = rand.nextInt(5);
		String hometownLocation = homeTown[randHome];
		return hometownLocation;
	}
	
	private static String randomizeHobby(String userChoices) {
		String[] hobby = {"Playing video-games", "Reading", "Sports", "Sleeping", "Coding", "Eating pickles"};
		Random rand = new Random();
		int randHobby = rand.nextInt(5);
		String favoriteHobby = hobby[randHobby];
		return favoriteHobby;
	}

	
}







