package heightBMI;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		System.out.println("Enter your height in inches");
		Scanner sc = new Scanner (System.in);
		double height = sc.nextInt();
		System.out.println("You have enter your weight in pounds");
		int weight = sc.nextInt();
		double heightMeters = height * 0.0254;
		double weightKilos = weight * 0.454;
		double heightSqr = Math.pow(heightMeters, 2);
		double BMIS =( weightKilos / heightSqr);
		if (BMIS <= 18.5) {
			System.out.println ("You are under weight");
		}else if ( BMIS <= 19.50) {
			System.out.println ("You are normal");
		} else if (BMIS <= 24.99 ) {
			System.out.println ("You are overweight");
		} else if (BMIS > 30) {
			System.out.println ("Yoour are obese");
			
		}
		System.out.println("Your height is :"+ heightMeters);
		

	}

}
