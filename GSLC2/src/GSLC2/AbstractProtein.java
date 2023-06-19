package GSLC2;

// Abstract class
// Definition = A class that is not able to be instantiated on its own, by means that we cannot create objects directly from it
// To put in perspective, abstract class is a partially completed blueprint for a class, where it can contain regular methods with implementations or abstract methods without implementations

// In my code, the abstract class, named "AbstractProtein" is responsible for displaying the template for table of nutritional facts and daily protein intake for both gender

abstract class AbstractProtein implements Protein{
	protected String proteinType;
	
	public void calculateNutrients(double weight) {
		System.out.println();
		System.out.println("Nutritional facts for " + weight + " grams of " + proteinType + " are :");
		System.out.println("Protein  : " + calculateProtein(weight) + " g");
		System.out.println("Calories : " + calculateCalories(weight) + " kcal");
		System.out.println("Fat      : " + calculateFat(weight) + " g");
	}
	
	public void checkProteinRequirement(double proteinAmount, String gender) {
		double avgProteinRequirement = getAvgProteinRequirement(gender);
		
		if(proteinAmount > avgProteinRequirement) {
			System.out.println("You have fulfilled your daily protein intake!");
		}
		else {
			System.out.println("You have NOT fulfilled your daily protein intake!");
		}
	}
	
	// Method to determine average protein intake for both adult male and female
	private double getAvgProteinRequirement(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			return 56.0;
		}
		else if(gender.equalsIgnoreCase("female")) {
			return 46.0;
		}
		return 0.0;
	}
	
	protected abstract double calculateProtein(double weight);
	protected abstract double calculateCalories(double weight);
	protected abstract double calculateFat(double weight);
	
	
	protected double calculateProteinBase(double weight, double multiplier) {
		return weight * multiplier;
	}
	
	protected double calculateCaloriesBase(double weight, double multiplier) {
		return weight * multiplier;
	}
	
	protected double calculateFatBase(double weight, double multiplier) {
		return weight * multiplier;
	}

}
