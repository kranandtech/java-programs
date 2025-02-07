package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AveragingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, "ajay", 2000));
		employeeList.add(new Employee(2, "Raju", 3000));
		employeeList.add(new Employee(1, "ganesh", 4000));
		double avg = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println(avg);

	}

}
