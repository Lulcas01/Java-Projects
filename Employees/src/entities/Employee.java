package entities;

public class Employee {
	private int ID;
	private String NAME;
	private double Salary;


	public Employee(int id, String name, double salary)
	{
		this.ID = id;
		this.NAME = name;
		this.Salary = salary;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getNAME() {
		return NAME;
	}


	public void setNAME(String nAME) {
		NAME = nAME;
	}


	public double getSalary() {
		return Salary;
	}


	public void setSalary(double salary) {
		Salary = salary;
	}

	public double Percentage(double per)
	{
		this.Salary = this.Salary + (per/100)*Salary;
		return Salary;
	}












}

