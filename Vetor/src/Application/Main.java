package Application;
import entities.Altura;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		String nome;
		int idade;
		double altura;
		
		System.out.println("Quantas pessoas serão digitadas? ");
		 n = sc.nextInt();
		 Altura[] pessoa = new Altura[n];
		 double contador = 0;
		 double contador2 = 0;
		 for(int i=0; i<pessoa.length; i++)
		{
			System.out.println("Dados da " + (i+1) + "ª pessoa: ");
			
			System.out.print("Nome: ");
			nome = sc.next();
			
			System.out.print("Idade: ");
			idade = sc.nextInt(); 
			
			System.out.print("Altura: ");
			altura = sc.nextDouble(); 
			contador = contador + altura;
			
			pessoa[i] = new Altura(nome, idade, altura);
			
			
		}

		double media;
		media = contador/n;
		
		
		
		System.out.println("nome dos novin: ");
		for(int i=0; i<pessoa.length; i++)
		{
			if(pessoa[i].getIdade() < 17) {
			System.out.println("Nome: " + pessoa[i].getNome() + "\n" + "idade:" + pessoa[i].getIdade() + "\n" + "Altura: " + pessoa[i].getAltura() + "\n "+ "--------------------------------" );
				contador2++;
			}
			
		}
		System.out.println("Porcentagem de novim é : " + (contador2/n)*100 + "%");
		System.out.println("Media das pessoas: " + media);
		sc.close();
		}
	}


