package com.singletonPattern;

import java.io.Serializable;

public class StudentSingletonDemo implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5934831891573461494L;

	// To create global variable which is made static in order to be
	// accessible without creating class' object
	// only declaration, initialization will happen inside getStudentObject method
	private static StudentSingletonDemo studentSingletonDemo;

	// Creating a private constructor to override default in order to restrict
	// creating the singleton class object
	private StudentSingletonDemo() {
		System.out.println("Instance Created");
	}

	// creating a method which will initialize Singleton class object during
	// runtime.
	// the logic makes sure, only one instance is created irrespective of the number
	// of times this
	// method is called
	public static StudentSingletonDemo getStudentObject() {

		// in case of multi-threading environment, this critical code will be accessible
		// to only single thread at time
		// fulfilling our singleton class objective and avoiding creation of multiple
		// objects in that environment
		synchronized (StudentSingletonDemo.class) {
			if (studentSingletonDemo == null) {
				//lazy initialization technique
				studentSingletonDemo = new StudentSingletonDemo();
				return studentSingletonDemo;
			}else {
				return studentSingletonDemo;
			}
		}
		//return studentSingletonDemo;
	}

	// To avoid cloning the object, overriding the clone method and
	// returning a custom exception.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException("Student is a Singleton class, Cloning not allowed");
	}

	// To avoid serialization, overriding the readResolve method and returning
	// globally declared singleton class instance
	protected Object readResolve() {
		return studentSingletonDemo;
	}

}
