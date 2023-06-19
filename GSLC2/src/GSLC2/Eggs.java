package GSLC2;

// As a type of protein is Eggs, here is the subclass of AbstractProtein
// Eggs inherits the abstract class AbstractProtein and has its own method in calculating Protein, Calories, and Fat

public class Eggs extends AbstractProtein{
	public Eggs() {
		proteinType = "Eggs";
	}
	
	protected double calculateProtein (double weight) {
		return calculateProteinBase(weight, 0.13);
	}
	
	protected double calculateCalories (double weight) {
		return calculateCaloriesBase(weight, 1.31);
	}
	
	protected double calculateFat (double weight) {
		return calculateFatBase(weight, 0.09);
	}
}
