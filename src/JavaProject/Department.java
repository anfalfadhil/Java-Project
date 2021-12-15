package JavaProject;

import java.util.ArrayList;
import java.util.List;

public class Department {
 
	public String name;
	public int employeesNumber;
	
	enum departments {
		SALES,
		HUMAN_RESOURCES,
		PRODUCTION,
		FINANCE_DEPARTMENT,
		IT	
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List<Employee> employees = new ArrayList<Employee>();
	
}
