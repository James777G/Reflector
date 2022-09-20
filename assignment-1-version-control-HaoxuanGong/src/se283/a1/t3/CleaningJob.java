package se283.a1.t3;

/**
 * [ADD COMMENTS] Describe the class
 * 
 * @author Author Name: [YOUR NAME] Author UPI: [YOUR UPI]
 * @version Date: [CURRENT DATE]
 *
 *          Changed Performed: [Explain the changes made and their rationale.
 *          This description may overlap with the contents of commit messages]
 *          Duplicate code detected in this class in comparison to CleaningJob
 *          class that both have the calculation of floor area, and thus, in my
 *          opinion, is considered as feature envy. Moved the calculation of
 *          floor area into the floor class.
 * 
 *          Note: You may create new classes, methods or fields in this package
 *
 */

public class CleaningJob {
	// The method inputs the floor and cleaner objects and
	// calculates the energy consumption cost for cleaning the floor area
	double cleaningRent(Floor floor, CleaningMachine cleaner) {

		double electricityPerUnitArea = floor.getCondition() * cleaner.getCapability();
		double energyConsumption = electricityPerUnitArea * floor.getFloorArea();

		return energyConsumption * cleaner.costPerUnitElectricity();
	}
}
