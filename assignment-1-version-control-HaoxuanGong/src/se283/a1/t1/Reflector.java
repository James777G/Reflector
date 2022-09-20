package se283.a1.t1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * SE283 Assignment 1 Task 1 Reflector - Instructions
 * 
 * This class should be implemented to contain the reflection functionality
 * described in the assignment hand-out. This class must be called by T1Main for
 * executing the desired reflection for a given class e.g. class Counter. * All
 * changes required for Task 1 must be performed on a new branch named
 * "T1Branch". You can create this new branch from our IDE.
 * 
 * @author Author Name: [YOUR NAME] Author UPI: [YOUR UPI]
 * @version Date: [CURRENT DATE]
 */

public class Reflector {

	/**
	 * This method will look for the class if already imported that has the same
	 * name with input parameter
	 * 
	 * @param s of type String
	 * @return Class which is the class imported with same name
	 */
	public static Class findClass(String s) {
		Class c;
		try {
			c = Class.forName(s);
			// java reflection api methods that initialise a class
			return c;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	/**
	 * This method will create an instance of the class imported that has the same
	 * name as your input String
	 * 
	 * @param s Input String
	 * @return an object which is the instance created.
	 */
	public static Object createInstance(String s) {
		Class c;
		try {
			c = Reflector.findClass(s);
			// java reflection api method that look for the class in the same package
			return c.newInstance();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * This method will return an array of methods that is declared in the imported
	 * class with name s; Inherited methods will not be returned
	 * 
	 * @param s input String
	 * @return an array of methods
	 */
	public static Method[] getMethods(String s) {
		Method methodList[];
		Class c;
		try {
			c = Reflector.findClass(s);
			methodList = c.getDeclaredMethods();
			// java reflection api method that returns methods declared in this class
			return methodList;
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * This method will return an array of fields that is declared in the imported
	 * class with name s; Inherited fields will not be returned
	 * 
	 * @param s input String
	 * @return an array of fields
	 */
	public static Field[] getFields(String s) {
		Field fieldList[];
		Class c;
		try {
			c = Reflector.findClass(s);
			fieldList = c.getDeclaredFields();
			// java reflection api method that returns fields declared in this class
			return fieldList;
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * This method works similarly to getFields(String s) but the fields returned
	 * are specific to this particular instance input
	 * 
	 * @param instance which you want to get the fields from
	 * @return an array of fields that are contained in this instance
	 */
	public static Field[] getObjectFields(Object instance) {
		return instance.getClass().getDeclaredFields();
		// get the class of the instance to link to java reflection api methods in the
		// library

	}

	/**
	 * This method works identically to getMethods(String s), but we can use object
	 * to achieve the same results to preserve integrity
	 * 
	 * @param instance of type object which your class created
	 * @return an array of methods declared in this instance
	 */
	public static Method[] getObjectMethods(Object instance) {
		return instance.getClass().getDeclaredMethods();
	}

	/**
	 * This method will look for the particular method declared in the class that
	 * the instance belongs to with the signature s
	 * 
	 * @param instance of type object that the class created
	 * @param s        name of method signature
	 * @return a single method that satisfies the conditions
	 */
	public static Method getParticularMethod(Object instance, String s) {
		Method method;
		try {
			method = instance.getClass().getDeclaredMethod(s);
			// java reflection api method that return method with same signature
			return method;
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
