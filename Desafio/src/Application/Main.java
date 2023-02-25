package Application;
import entities.Studant;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Studant[] quartos = new Studant[10];
		System.out.println("QUANTOS QUARTOS: ");
		int n = sc.nextInt();
		
		for(int i =0; i< n; i++)
		{
			System.out.println("Nome;");
			String nome = sc.next();
			System.out.println("email: ");
			String email = sc.next();
			System.out.println("NUMERO DO QUARTO");
			int quarto = sc.nextInt();
			
			quartos[quarto] = new Studant(nome, quarto, email);
			
			
		}
		
		for(int i=0; i<10; i++)
		{
			if(quartos[i] != null)
			{
				System.out.println("Quarto: " + quartos[i].getQuarto() + "\n " + "Nome: " + quartos[i].getName() + "\n"+ "Email: " + quartos[i].getEmail() + "\n ------------------------");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
