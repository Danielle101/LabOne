//This program calculates perimeter and area based on user input
import java.util.Scanner;//import the scanner class

public class LabOne {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		String choice = "y";
		Scanner rl = new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {
			// Prompt user to enter length
			System.out.print("Enter Length:");
			// input from user
			int length = Validator.readValidInt();
			// Prompt user to enter width
			System.out.print("Enter Width:");
			// get text entered by the user
			int width = Validator.readValidInt();
			
			// perform calculations for area and perimeter (calls the getArea
			// and getPerimeter methods)
			getArea(length, width);
			getPerimeter(length, width);
			// ask user if they want to continue
			// if the choice is "y" the program will restart by requesting
			// length input
			choice = Validator.getString("Continue? (y/n):");
			System.out.println();
		}
		rl.close();
		System.out.println("Bye!");
	}

	/**
	 * @param length
	 * @param width
	 *            method for perimeter
	 */
	public static void getPerimeter(int length, int width) {
		int roomperimeter = length + length + width + width;
		System.out.println("Perimeter:" + roomperimeter);
	}

	/**
	 * @param length
	 * @param width
	 *            method for area
	 */
	private static void getArea(int length, int width) {
		int roomarea = length * width;
		System.out.println("Area:" + roomarea);
	}
}