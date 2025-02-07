package streamdemo;

import java.util.ArrayList;
import java.util.List;

public class FilterEmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, "Ak", 12000));
		employeeList.add(new Employee(2, "ganesh", 14000));
		employeeList.add(new Employee(3, "Raju", 19000));
		employeeList.stream().filter(e -> e.getSalary()>15000).forEach(e->System.out.println(e.getName()));
        
	}

}
