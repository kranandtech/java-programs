package streamdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomSortedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, "ajay", 2000));
		employeeList.add(new Employee(2, "Raju", 1000));
		employeeList.add(new Employee(1, "ganesh", 4000));
		employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(e->System.out.print(e.getSalary()+" "));
		System.out.println();
		employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(e->System.out.print(e.getSalary()+" "));

	}

}
