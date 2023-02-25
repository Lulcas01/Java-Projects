package entities;

import java.util.Scanner;

public class  Calcular {

    public static double calcularDeposito() {
        Scanner sc = new Scanner(System.in);
        double Deposito = 0.0;

        System.out.println("Deseja fazer um depósito? (y/n)");
        String VI = sc.next();

        switch (VI) {
            case "y":
                System.out.println("Digite o valor do depósito");
                Deposito = sc.nextDouble();
                break;
            case "n":
                Deposito = 0;
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

     
        return Deposito;
    }
    public static double calculaSaque()
    {
    	Scanner b = new Scanner(System.in);
        double Valor = 0.0;

        System.out.println("Deseja fazer um saque? (y/n)");
        String VI = b.next();

        switch (VI) {
            case "y":
                System.out.println("Digite o valor do saque");
                Valor = b.nextDouble();
                break;
            case "n":
                Valor = 0;
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        b.close();
        return Valor;
    }

}