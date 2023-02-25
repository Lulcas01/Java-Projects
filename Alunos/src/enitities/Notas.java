package enitities;

public class Notas {
	public String name;
	public double nota[];
	public String situacao;
	
	public double notaFinal()
	{
		double somatorio = 0;
		for (int i = 0; i<3; i++)
		{
			somatorio += nota[i];
		}
		return somatorio;
	}
	public double notaBase()
	{
		double primeiro = 30;
		double segundo = 35;
		double terceiro = 35;
		double notabase = (primeiro + segundo + terceiro) * 0.6;
		return notabase;
	}
	
}
