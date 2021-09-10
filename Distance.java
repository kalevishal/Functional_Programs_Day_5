/*
Write a program Distance.java that takes two integer command-line arguments x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
*/


import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		double x = 0, y = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x condinate");
		double x1 = scan.nextDouble();
		System.out.println("Enter y condinate");
		double y1 = scan.nextDouble();
		//calulating distance
		double distance = Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2));
		System.out.println(distance);

	}

}


/*
OutPut
Enter value for x
2
Enter value for y 
2
Distance is 2.8284271247461903
*/