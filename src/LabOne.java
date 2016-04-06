import java.util.Scanner;//import the scanner class

public class LabOne {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		String choice = "y";
		Scanner rl = new Scanner (System.in);	
		Scanner rw = new Scanner (System.in);
	while (choice.equalsIgnoreCase("y"))
		{
		//Prompt user to enter length
	   System.out.print ("Enter Length:");
		//get text entered by the user
	String lengthRoom = rl.nextLine();
		//convert string object to double value
	double length = Double.parseDouble (lengthRoom);
		//Prompt user to enter width
	   System.out.print ("Enter Width:");
		//get text entered by the user
	String widthRoom = rw.nextLine();
		//convert string object to double value
	double width = Double.parseDouble (widthRoom);
	
		//perform calculations for area and perimeter (calls the getArea and getPerimeter methods)
	getArea(length, width);
	getPerimeter(length, width);
		//ask user if they want to continue
	   System.out.print ("Continue? (y/n):");
		//if the choice is "y" the program will restart by requesting length input
	choice = rl.nextLine();
	   System.out.println();
	}
	rl.close();
	   System.out.println("Bye!");
}

	/**
	 * @param length
	 * @param width
	 * method for perimeter
	 */
	public static void getPerimeter(double length, double width) {
		double roomperimeter = length + length + width + width;
		   System.out.println ("Perimeter:" +roomperimeter);
	}

	/**
	 * @param length
	 * @param width
	 * method for area
	 */
	private static void getArea(double length, double width) {
		double roomarea = length * width;
		   System.out.println("Area:" +roomarea);
	}
}