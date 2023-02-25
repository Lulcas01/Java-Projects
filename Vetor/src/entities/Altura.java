package entities;

public class Altura {
	private String Nome;
	private int Idade;
	private double Altura;
	
	public Altura(String nome, int idade, double altura)
	{
		this.Nome = nome;
		this.Idade = idade;
		this.Altura = altura;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double altura) {
		Altura = altura;
	}
	
	
	
	
	
	
	
	
	
}
