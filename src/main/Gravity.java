/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

// import java.util.Scanner;
// uncomment the above line to use input in your program.

import java.util.Scanner;

public class Gravity {
	// TODO 1: Create the main method
	public static void main(String[] args) {
		double speed;
		double distance;
		double g=9.8;
		Scanner obj = new Scanner(System.in);
		System.out.println();
		double time = obj.nextDouble();
		speed = g*time;
		distance = 0.5*g*time*time;
		System.out.printf("The speed of the object at %f seconds after it's release is %f and the distance the object has travelled in the %f seconds after the release is %f",time,speed,time,distance);
		/* TODO 2:
		 *   a. Declare all your necessary variables inside main method.
		 *   b. Declare a constant for 'gravity', assume the value to be 9.8
		 *   c. Calculate the result and print it to the screen.
		 * */
	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
