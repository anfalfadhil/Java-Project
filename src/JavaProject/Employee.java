package JavaProject;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
	private String firstName;
	private String lastName;
//	private static final AtomicInteger counter = new AtomicInteger();
//	private int id = counter.intValue();
	private int id = 0;
	private Date dateOfEmployment;
	private int salary;
	private String department;
	
	
	
	
	public Employee() {
		super();
		this.id = ++id;
		}




	public Employee(String firstName, String lastName, int id, Date dateOfEmployment, int salary, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = ++id;
		this.dateOfEmployment = dateOfEmployment;
		this.salary = salary;
		this.department = department;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public int getId() {
		return id;
	}





	public Date getDateOfEmployment() {
		return dateOfEmployment;
	}




	public void setDateOfEmployment(Date dateOfEmployment) {
		this.dateOfEmployment = dateOfEmployment;
	}




	public int getSalary() {
		return salary;
	}




	public void setSalary(int salary) {
		this.salary = salary;
	}




	public String getDepartment() {
		return department;
	}




	public void setDepartment(String department) {
		this.department = department;
	}




	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + ", dateOfEmployment="
				+ dateOfEmployment + ", salary=" + salary + ", Department=" + department + "]";
	}
	
	
	
	
	

}
