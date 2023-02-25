package Main;
import java.util.Scanner;

import entities.Banco;
import entities.Calcular;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com numero da conta: ");
		int Numero = sc.nextInt();
		System.out.print("Entre com nome do titular: ");
		String Titular = sc.next();		
		
		Calcular calc = new Calcular();
		double Deposito = calc.calcularDeposito();
	
		Banco cliente = new Banco(Numero, Titular, Deposito);
		cliente.setDeposito(Deposito);
		
	System.out.println("Account: "  + cliente.getNumero() + "\nHold: "  + cliente.getTitular() + " \nSaldo: "  + cliente.getSaldo());
		if(cliente.getSaldo() != 0)
		{
			double valor = calc.calculaSaque();
			cliente.setSaque(valor);
			System.out.print("Saldo atualizado para: "  + cliente.getSaldo());
		
		} 
		
		
		
		
		sc.close();
	}
	
}
