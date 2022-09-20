package se283.a1.t3;

/**
 * This class is the entry point for Task 3. 
 * 
 * The refactorings performed must not change the output of the main method. 
 * This can happen due to incorrect refactorings.
 * 
 * @author Author Name: [YOUR NAME] Author UPI: [YOUR UPI]
 * @version Date: [CURRENT DATE] 
 * 
 * You MUST NOT change this code.
 * 
 * Note: You may create new classes, methods or fields in this package
 *
 */

public class T3Main {

	public static void main(String[] args) {
		// define a floor
		Floor floor = new Floor();
		
		//Calculate the cleaning rent
		CleaningMachine cleaner = new CleaningMachine();
		CleaningJob cJob = new CleaningJob();
		System.out.println(cJob.cleaningRent(floor, cleaner));		
		
		//Calculate polishing rent
		PolishingMachine polisher = new PolishingMachine();
		PolishingJob pJob = new PolishingJob();
		System.out.println(pJob.polishingRent(floor, polisher));		
		
	}
}
