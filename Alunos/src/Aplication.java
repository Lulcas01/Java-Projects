import java.util.Scanner;
import enitities.Notas;

public class Aplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Notas student = new Notas();
		student.nota = new double[3];
		System.out.println("Digite o nome: ");
		student.name = sc.next();
		System.out.println("Digite as notas do cidadão: ");
		for(int i=0; i<3; i++)
		{
			student.nota[i] = sc.nextDouble();
		}
		
		

		if(!(student.notaFinal() > student.notaBase() && student.nota[0] <= 30))
		{
			if(student.notaFinal() < student.notaBase())
			{			
				student.situacao = "FAILED";
				System.out.println("FINAL GRADE: " +  student.notaFinal() + "\n" + student.situacao);
				double diferenca = student.notaBase()-student.notaFinal();
				System.out.printf("MISSING: " + diferenca);
			}
			else
			{
				student.situacao = "PASS";
				System.out.println("FINAL GRADE: " +  student.notaFinal() + "\n" + student.situacao);
			}
		}
		else
		{
			System.out.print("ERRO, NOTA MAIOR QUE O PERIMITIDO");
		}
		
		
		
		
		
		
		sc.close();
	}

}
