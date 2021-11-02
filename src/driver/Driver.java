package driver;

import java.util.Scanner;

import services.ProbServices;

public class Driver {

	public static void main(String args[]) {
		// Test
		int starforce;
		ProbServices ps = new ProbServices();
		System.out.println("Input the current star force of the item");
		Scanner in = new Scanner(System.in);
		starforce = in.nextInt();
		ps.startStarForce(starforce);
		in.close();
	}
}
