package Application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		System.out.println("How many employees?");
		int qtd = sc.nextInt();
		for(int i=0; i<qtd; i++)
		{
			System.out.println("ID DO TRABALHADOR: ");
			Integer id = sc.nextInt();
			System.out.println("Nome: ");
			String name = sc.next();
			System.out.println("Salario: ");
			Double salary = sc.nextDouble();
			
			Employee func = new Employee(id,name,salary);
			
			list.add(func);
		}
		
		for(Employee x : list)
		{
			System.out.println("Nome: " + x.getNAME() + "\n" + "ID: " + x.getID() + "\n" + "Salario: " + x.getSalary());
			System.out.println("-------------------");
		}
		
		System.out.println("-------------------");
		
		System.out.println("Qual id vc quer aumentar o salario? ");
		
		int idProcurado = sc.nextInt();		
		
		System.out.println("Ente com o diabo da porcentagem");
		double percentage = sc.nextDouble();
		
		for(Employee x : list)
		{			
	

			if(idProcurado == x.getID())
			{
				x.Percentage(percentage);								
			}	
			
			System.out.println("Nome: " + x.getNAME() + "\n" + "ID: " + x.getID() + "\n" + "Salario: " + x.getSalary());
		
		}
		
		System.out.println("-------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
