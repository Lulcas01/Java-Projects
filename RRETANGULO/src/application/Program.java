package application;
import java.util.Scanner;
import entities.Retangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangle retangle = new Retangle();
		System.out.println("ENTER RECTANGLE WIDHT AND HEIGHT: ");
		retangle.widht = sc.nextDouble();
		retangle.height = sc.nextDouble();
		
		System.out.println("AREA: " +  retangle.area());
		System.out.println("PERIMETRO: " + retangle.perimeter());
		System.out.printf("DIAGONAL: ", retangle.diagonal());
		sc.close();
	}

}
