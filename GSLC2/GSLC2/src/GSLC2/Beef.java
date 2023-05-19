package GSLC2;

// As a type of protein is Beef, here is the subclass of AbstractProtein
// Beef inherits the abstract class AbstractProtein and has its own method in calculating Protein, Calories, and Fat

public class Beef extends AbstractProtein{
	public Beef() {
		proteinType = "Beef";
	}
	
	protected double calculateProtein (double weight) {
		return weight * 0.25;
	}
	
	protected double calculateCalories (double weight) {
		return weight * 2.50;
	}
	
	protected double calculateFat (double weight) {
		return weight * 0.1;
	}
}
