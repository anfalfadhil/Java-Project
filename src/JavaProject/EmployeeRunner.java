package JavaProject;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class EmployeeRunner {

	
	
	
	
	
	public static List<Employee> employees = new ArrayList<Employee>();

	
	
	public static void adding() {
		employees.add(new Employee("Orquidia","Smith",1 , new Date(), 100000, "Human resources"));
		employees.add(new Employee("John","Doe",2 , new Date(), 110000, "IT"));
		employees.add(new Employee("Jane","Doe",3 , new Date(), 120000, "IT"));
		
	}

	
	
	
	
	public static Employee createEmployee() {
		
		creatingFile();
		
		Employee emp = new Employee();
		System.out.println("Enter Employee's first name:");
		Scanner scan = new Scanner(System.in);
		String firstName = scan.nextLine();
		emp.setFirstName(firstName);
		
		System.out.println("Enter Employee's last name:");
		String lastName = scan.nextLine();
		emp.setLastName(lastName);
		
		System.out.println("Enter Employee's Department:");
		String dep = scan.nextLine();
		emp.setDepartment(dep);
		
		System.out.println("Enter Employee's salary:");
		int salary = scan.nextInt();
		emp.setSalary(salary);
	
		emp.setDateOfEmployment(new Date());

		employees.add(emp);
		writeEmployeeToFile(emp);
		employeesList();
		return emp;
		
	}
	
	
	
	
	public static void employeesList() {

		employees.forEach(employee -> {System.out.println(employee);
		});
		
	}
	

	
	
	public static void deleteEmployee() {
		
		Scanner scan = new Scanner(System.in);
		employeesList();
		System.out.println("Enter the employee's ID number that you wish to delete: ");
		int employeesId = scan.nextInt();
		employees.remove(employeesId);
		System.out.println(employees.get(employeesId));
		
	}
	
	
	
	
	
	public static Employee updateEmployee() {
		employeesList();
		System.out.println("Enter the employee's ID number that you wish to update: ");
		Scanner scan = new Scanner(System.in);
		int employeesId = scan.nextInt();
		System.out.println("what do you want to update?");
		System.out.println("1 --> First Name");
		System.out.println("2 --> Last Name");
		System.out.println("3 --> Department");
		System.out.println("4 --> Salary");
		
		int prop = scan.nextInt();
		scan.nextLine();
		
		switch (prop) {
		case 1 :
			System.out.println("Enter new First Name: ");
			
			String newFirstName = scan.nextLine();
			employees.get(employeesId).setFirstName(newFirstName);
			System.out.println(employees.get(employeesId));
			return employees.get(employeesId);
			
		case 2: 
			System.out.println("Enter new Last Name: ");
			String newLastName = scan.nextLine();
			employees.get(employeesId).setLastName(newLastName);
			System.out.println(employees.get(employeesId));
			return employees.get(employeesId);
			
		case 3 :
			System.out.println("Enter new Department Name: ");
			String newDep = scan.nextLine();
			employees.get(employeesId).setDepartment(newDep);
			System.out.println(employees.get(employeesId));
			return employees.get(employeesId);
			
		case 4 :
			System.out.println("Enter new Salary: ");
			System.out.println(employees.get(employeesId));
			int newSalary = scan.nextInt();
			employees.get(employeesId).setSalary(newSalary);
			System.out.println(employees.get(employeesId));
			return employees.get(employeesId);
		}
		
		return employees.get(employeesId);
		
		
	}
	
	
	
	
	
	
	
	public static void writeEmployeeToFile( Employee emp) {
		
		File file = new File("resources/employees.txt");
		
		if (!file.exists()) {
			try {
				file.createNewFile();

			} catch (IOException e) {
				System.out.println("FAIL: Could not create " + file.getAbsolutePath());
			}
		}
		
		try(ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(file)))  {
			
			writer.writeObject(emp);
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	
	public static void creatingFile() {


		File file = new File("resources/employees.txt");
		
			if (!file.exists()) {
				try {
					file.createNewFile();

				} catch (IOException e) {
					System.out.println("FAIL: Could not create " + file.getAbsolutePath());
				}
			}
	}
	
	
	
	public static void main(String[] args) {
		
		
		creatingFile();
		
//		writeEmployeeToFile(file);
//		readEmployeeFromFile(file);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		adding();
		System.out.println("What would you like to do?");
		System.out.println("Enter 1 to add an Employee");
		System.out.println("Enter 2 to get a list of the Employees");
		System.out.println("Enter 3 to Delete the Employee, Please Enter their ID number!!");
		System.out.println("Enter 4 to Update the Employee, Please Enter their ID number!!");
		
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		try {
			
			if ( input == 1 ) {
				createEmployee();
			} else if (input == 2 ) {
				employeesList();
			} else if (input == 3 ) {
				deleteEmployee();
			} else if ( input == 4) {
				updateEmployee();
			
			}
		} catch (Exception e) {
			 System.out.println("ERROR, Something went wrong :(");
		}

	}

}
