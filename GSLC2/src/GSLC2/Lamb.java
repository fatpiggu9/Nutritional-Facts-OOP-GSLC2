package GSLC2;

// As a type of protein is Lamb, here is the subclass of AbstractProtein
// Lamb inherits the abstract class AbstractProtein and has its own method in calculating Protein, Calories, and Fat

public class Lamb extends AbstractProtein{
	public Lamb() {
		proteinType = "Rack of Lamb";
	}
	
	protected double calculateProtein (double weight) {
		return calculateProteinBase(weight, 0.256);
	}
	
	protected double calculateCalories (double weight) {
		return calculateCaloriesBase(weight, 2.58);
	}
	
	protected double calculateFat (double weight) {
		return calculateFatBase(weight, 0.19);
	}
}