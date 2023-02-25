package entities;

public class Employee {
	public String name;
	public double slr;
	public double tax;
	
	public double netsalary()
	{
		return slr - tax;
	}
	public void increaseSalary(double percentage)
	{
		percentage = percentage/100;
		slr += (slr * percentage); 
	}
}
