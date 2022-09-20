package se283.a1.t3;

/**
 * [ADD COMMENTS] Describe the class
 * 
 * @author Author Name: [YOUR NAME] Author UPI: [YOUR UPI]
 * @version Date: [CURRENT DATE]
 * 
 *          [Explain the changes made and their rationale. This description may
 *          overlap with the contents of commit messages] Duplicate code
 *          detected in this class in comparison to PolishingJob class that both
 *          have the calculation of floor area, and thus, in my opinion, is
 *          considered as feature envy. Moved the calculation of floor area to
 *          the floor class
 *
 *          Note: You may create new classes, methods or fields in this package
 *
 */

public class PolishingJob {
	double polishingRent(Floor floor, PolishingMachine polisher) {
		double electricityPerUnitArea = floor.getCondition() * polisher.getCapability();
		double energyConsumption = electricityPerUnitArea * floor.getFloorArea();
		return energyConsumption * polisher.costPerUnitElectricity();
	}
}