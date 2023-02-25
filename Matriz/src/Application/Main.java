package Application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int mat[][] = new int[n][m];
		
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal Principal");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				if(i == j)
				{
					System.out.println(mat[i][j]);
				}
			}
		}
		int cont = 0;
		System.out.println("--------------------------");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				if(mat[i][j] < 0)
				{
					cont++;
				}
			}
		}
		System.out.println(cont);
		
		System.out.println("--------------------------");
		System.out.println("QUAL NUMERO VC QUER ACHAR>>>> ");
		int choquei = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				
				if(choquei == mat[i][j])
				{
					System.out.println("--------------");
					System.out.println("Position " + i + "," + j);
					if((j-1)>=0)
					{
						System.out.println("Left: " + mat[i][j-1]);
					}
					
					if((j+1)<m) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					
					if((i-1)>=0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					
					if((i+1)<n)
					{
						System.out.println("Down: " + mat[i+1][j]);
					}
					System.out.println("--------------");
				}
			}
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
