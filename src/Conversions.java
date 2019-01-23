import java.util.Scanner;

public class Conversions 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("How many feet? ");
		double feet = input.nextDouble();
	}
	public static double feetToInches(double feet)
	{
		double inch = feet * 12;
		return inch;
	}
	public static double milesToFeet(double miles)
	{
		double feet = miles * 5280;
		return feet;
	}
	public static double yardsToMeters(double yards)
	{
		double meters = yards/1.094;
		return meters;
	}
	public static double poundsToKilograms(double pounds)
	{
		double kilograms = pounds/2.205;
		return kilograms;
	}
}
