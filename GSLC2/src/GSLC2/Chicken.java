package GSLC2;

// For instance, as a type of protein is Chicken, here is the subclass of AbstractProtein
// Chicken inherits the abstract class AbstractProtein and has its own method in calculating Protein, Calories, and Fat

public class Chicken extends AbstractProtein{
	public Chicken() {
		proteinType = "Chicken";
	}
	
	protected double calculateProtein (double weight) {
		return calculateProteinBase(weight, 0.31);
	}
	
	protected double calculateCalories (double weight) {
		return calculateCaloriesBase(weight, 2.84);
	}
	
	protected double calculateFat (double weight) {
		return calculateFatBase(weight, 0.062);
	}
}
