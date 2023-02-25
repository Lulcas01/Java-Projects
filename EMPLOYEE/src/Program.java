import java.util.Scanner;
import entities.Employee;
public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		System.out.println("Put the Name");
		employee.name = sc.next();
		System.out.println("Put the salary");
		employee.slr = sc.nextDouble();
		System.out.println("Put the Tax");
		employee.tax = sc.nextDouble();
	
		System.out.println("Employee: " + employee.name + ", " + "$" + employee.netsalary());
		System.out.println("Do u wanna increase your salary?" );
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.print("Employee: " + employee.name + ", " + "$" + employee.netsalary());

		
		
		
		sc.close();
	}

}
