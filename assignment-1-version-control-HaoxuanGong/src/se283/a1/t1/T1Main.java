package se283.a1.t1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * SE283 Assignment 1 Task 1 Main - Instructions
 * 
 * This class should be implemented to accept the user input through args[] and
 * delegate the reflection functionality to class Reflector.
 * 
 * You may implement additional classes if you wish, but this class should be
 * the main program entry point.
 * 
 * You must STAGE, COMMIT and PUSH your changes every time you are "done" (see
 * the "definition of done" in Agile/Scrum/XP) with writing/changing this class,
 * i.e. after successfully completing Task 1, Task 2 and Task 3, respectively
 * You may COMMIT and PUSH prematurely too i.e. before each task is completed,
 * but you "must" COMMIT and PUSH to the remote repo after finishing each of the
 * A1 tasks.
 * 
 * @author Author Name: [Haoxuan Gong] Author UPI: [hgon777]
 * @version Date: [7/30/2022]
 */

public class T1Main {
	public static void main(String[] args) {
		Object instance;
		// for the creation of instances from a certain class
		Field allFields[];
		Method allMethods[];
		Method methodToExecute;
		String input;
		Scanner scan = new Scanner(System.in);
		// imported scanner library to scan for the inputs

		System.out.println("Enter the Class Name:");
		String userInput = scan.nextLine();
		instance = Reflector.createInstance(userInput);
		// create an instance of the userInput class

		allFields = Reflector.getObjectFields(instance);
		// get all the fields of the instance
		System.out.println("FIELDS: ");
		for (Field field : allFields) {
			if (Modifier.isPublic(field.getModifiers())) {
				// if the field is public then print it out
				try {
					System.out.println(field + "\r\n" + "The value of this field is " + field.get(instance));
				} catch (IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		allMethods = Reflector.getObjectMethods(instance);
		System.out.println("METHODS:");
		for (Method method : allMethods) {
			if (Modifier.isPublic(method.getModifiers())) {
				// only print it out if the method is declared as public
				if (method.getParameterCount() == 0) {
					// only print it out if there is no input parameters
					System.out.println(method);
				}

			}
		}

		Scanner scanTwo = new Scanner(System.in);
		System.out.println("Choose a method to execute: ");
		String methodInput = scanTwo.nextLine();
		methodToExecute = Reflector.getParticularMethod(instance, methodInput);
		// access to the particular method to be executed
		try {
			methodToExecute.invoke(instance);
			// invoke the method on the instance
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		allFields = Reflector.getObjectFields(instance);
		System.out.println("FIELDS: ");
		for (Field field : allFields) {
			if (Modifier.isPublic(field.getModifiers())) {
				try {
					System.out.println(field + "\r\n" + "The value of this field is " + field.get(instance));
					// update on the values of the fields and display them to users
				} catch (IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			// TODO Assignment 1, Question 1-2.

		}
		System.out.println("Choose a method to execute again: ");
		input = scan.nextLine();
		while (input != "STOP") {
			// as long as the input is not stop, then the execution will be recuring

			methodToExecute = Reflector.getParticularMethod(instance, input);
			try {
				methodToExecute.invoke(instance);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			allFields = Reflector.getObjectFields(instance);
			System.out.println("FIELDS: ");
			for (Field field : allFields) {
				if (Modifier.isPublic(field.getModifiers())) {
					try {
						System.out.println(field + "\r\n" + "The value of this field is " + field.get(instance));
						// update again the values of fields and display them to users
					} catch (IllegalArgumentException | IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			}
			input = scan.nextLine();
			// update on the value of input for the next loop

		}

	}
}
