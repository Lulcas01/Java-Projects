package entities;

public class Studant {
	private String Name;
	private int Quarto;
	private String Email;
	
	
	public Studant(String nome, int quarto, String email)
	{
		this.Name = nome;
		this.Quarto = quarto;
		this.Email = email;
	}
	
	
	
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public int getQuarto() {
		return Quarto;
	}
	public void setQuarto(int quarto) {
		Quarto = quarto;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}



































}
