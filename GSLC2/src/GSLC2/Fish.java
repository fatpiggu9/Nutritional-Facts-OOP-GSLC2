package GSLC2;

// As a type of protein is Fish, here is the subclass of AbstractProtein
// Fish inherits the abstract class AbstractProtein and has its own method in calculating Protein, Calories, and Fat

public class Fish extends AbstractProtein{
	public Fish() {
		proteinType = "Fish";
	}
	
	protected double calculateProtein (double weight) {
		return weight * 0.172;
	}
	
	protected double calculateCalories (double weight) {
		return weight * 0.84;
	}
	
	protected double calculateFat (double weight) {
		return weight * 0.012;
	}
}