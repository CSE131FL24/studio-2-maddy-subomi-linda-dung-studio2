package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("What is your starting amount?");
		double currentAmount = in.nextDouble(); 
		System.out.println("What is the win chance?");
		double winChance = in.nextDouble(); 
		System.out.println("What is the win limit?");
		double winLimit = in.nextDouble(); 
		System.out.println("How many days do you want to play?");
		double daysPlay = in.nextDouble(); 

		int successCount = 0;
		int ruinCount = 0;


		int totalSimulations = 0;
		int rounds= 0;
		
		//day loop 
		while (totalSimulations < daysPlay) {	
			//round loop
			while(currentAmount < winLimit && currentAmount > 0) {

				double chance = Math.random(); 
				
				if (chance <= winChance) {
					currentAmount++;
					System.out.println("Simulation " + totalSimulations + ": " + rounds + " WIN");
					successCount ++;
					rounds++;
				}

				if (chance > winChance) {
					currentAmount--;
					System.out.println("Simulation "+ totalSimulations + ": " + rounds + " LOSE");
					ruinCount ++;
					rounds++;

				}
				totalSimulations ++;

			
		
				//if (currentAmount == winLimit) {
				//	System.out.println("Simulation " + totalSimulations + ": " + rounds + " WIN");
				//	successCount ++;
			//	}
			//	if (currentAmount == 0) {
			//		System.out.println("Simulation "+ totalSimulations + ": " + rounds + " LOSE");
			//		ruinCount ++;

				//}
				

			
			}

		}
			


		System.out.println("Simulations Total: " + totalSimulations);
		System.out.println("Total Wins: " + successCount);
		System.out.println("Total Losts: " + ruinCount);
		
		}
}







