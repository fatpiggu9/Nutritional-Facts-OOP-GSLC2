package GSLC2;

import java.util.Scanner;

// The purpose of this code is to display a table of nutritional facts from one of the 5 selected protein sources, namely Chicken, Beef, Lamb, Fish and Eggs
// Users are to input type of protein and select gender of either male or female
// Given the input, the code will calculate the amount of protein, calories, and fats of the corresponding protein sources based on the weight in grams
// Moreover, either male or female will have different minimum average protein intake daily, therefore, the code also determines whether the consumed grams of protein is enough to fulfill daily protein intake.

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int option = 0;
		
		// Each index corresponds to each protein, with 1 for Chicken, 2 for Beef, 3 for Lamb, 4 for Fish, 5 for Eggs, and 6 to Exit the code.
		do {
			System.out.println();
			System.out.println("Nutrirional Facts Calculator (Adult Use Only): ");
			System.out.println("===============================================");
			System.out.println("Please select the type of protein you are consuming:");
			System.out.println("1. Chicken Breast");
			System.out.println("2. Beef");
			System.out.println("3. Rack of Lamb");
			System.out.println("4. Fish");
			System.out.println("5. Eggs");
			System.out.println("6. Exit");
			System.out.print(">> ");
			option = sc.nextInt();
			
			if(option == 1) {
				System.out.print("Input weight of protein consumption (in grams): ");
				double weight = sc.nextDouble();
				sc.nextLine();
				
				System.out.print("Are you a male or female? ");
				String gender = sc.nextLine();
				
				AbstractProtein protein = new Chicken();
				double proteinAmount = protein.calculateProtein(weight);
				protein.calculateNutrients(weight);
				protein.checkProteinRequirement(proteinAmount, gender);
			}
			
			else if(option == 2) {
				System.out.print("Input weight of protein consumption (in grams): ");
				double weight = sc.nextDouble();
				sc.nextLine();
				
				System.out.print("Are you a male or female? ");
				String gender = sc.nextLine();
				
//				Beef beef = new Beef();
//				double proteinAmount = beef.calculateProtein(weight);				
//				beef.calculateNutrients(weight);
//				beef.checkProteinRequirement(proteinAmount, gender);
				
				AbstractProtein protein = new Beef();
				double proteinAmount = protein.calculateProtein(weight);
				protein.calculateNutrients(weight);
				protein.checkProteinRequirement(proteinAmount, gender);
			}
			
			else if(option == 3) {
				System.out.print("Input weight of protein consumption (in grams): ");
				double weight = sc.nextDouble();
				sc.nextLine();
				
				System.out.print("Are you a male or female? ");
				String gender = sc.nextLine();
				
				//Lamb lamb = new Lamb();
				//double proteinAmount = lamb.calculateProtein(weight);
				//lamb.calculateNutrients(weight);
				//lamb.checkProteinRequirement(proteinAmount, gender);
				
				AbstractProtein lamb = new Lamb();
				double proteinAmount = lamb.calculateProtein(weight);
				lamb.calculateNutrients(weight);
				lamb.checkProteinRequirement(proteinAmount, gender);
			}
			
			else if(option == 4) {
				System.out.print("Input weight of protein consumption (in grams): ");
				double weight = sc.nextDouble();
				sc.nextLine();
				
				System.out.print("Are you a male or female? ");
				String gender = sc.nextLine();
				
				AbstractProtein protein = new Fish();
				double proteinAmount = protein.calculateProtein(weight);
				protein.calculateNutrients(weight);
				protein.checkProteinRequirement(proteinAmount, gender);
			}
			
			else if(option == 5) {
				System.out.print("Input weight of protein consumption (in grams): ");
				double weight = sc.nextDouble();
				sc.nextLine();
				
				System.out.print("Are you a male or female? ");
				String gender = sc.nextLine();
				
				AbstractProtein protein = new Eggs();
				double proteinAmount = protein.calculateProtein(weight);
				protein.calculateNutrients(weight);
				protein.checkProteinRequirement(proteinAmount, gender);
			}
			
		}while(option != 6);
	}
}
