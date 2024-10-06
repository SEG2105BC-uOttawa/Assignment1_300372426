package edu.seg2105.assignment1.exercise2.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * The Administrator class represents an administrative employee with specific
 * tasks.
 * Extends the Employee class.
 * 
 * @autor Hussein Al Osman
 */
public class Administrator extends Employee {

	// List of tasks assigned to the administrator
	List<String> tasks;

	/**
	 * Constructs a new Administrator with the given details.
	 * 
	 * @param firstName the first name of the administrator
	 * @param lastName  the last name of the administrator
	 * @param id        the ID of the administrator
	 * @param salary    the salary of the administrator
	 */
	public Administrator(String firstName, String lastName, String id, double salary) {
		super(firstName, lastName, id, salary);
		tasks = new ArrayList<String>();
	}

	// adds tasks to the administrator
	public void addTask(String task) {
		tasks.add(task);
	}

	public String getTasksList() {
		String tasksToString = "";
		for (int i = 0; i < this.tasks.size(); i++) {
			tasksToString += String.format("Task%s : %s", i, this.tasks);
		}

		return tasksToString;
	}

	public String toString() {
		return "Administrator information:\n"
				+ "\tFirst name: " + getFirstName() + "\n"
				+ "\tLast name: " + getLastName() + "\n"
				+ "\tEmployee ID: " + getId() + "\n"
				+ "\tSalary: " + getSalary() + "\n"
				+ getTasksList();
	}

}
