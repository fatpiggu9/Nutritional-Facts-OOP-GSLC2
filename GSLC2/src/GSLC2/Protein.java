package GSLC2;

// Interface
// Definition = A contract or set of rules which a class must obey. 
// Usually contains a set of methods or functions representing each functionality

// In my code, the interface contains 2 activities, such as 
// Displaying nutritional facts of a certain weight of protein
// and checking daily protein intake based on user's gender

interface Protein {
	void calculateNutrients(double weight);
	void checkProteinRequirement(double proteinAmount, String gender);
}
