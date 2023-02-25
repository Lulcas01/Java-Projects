package entities;
import entities.Calcular;

public class Banco {
	private int Numero;
	private String Titular;
	private double Deposito;
	private double Saldo;
	private double Saque;
	private static double Tax = 5;
public Banco(int Numero, String Titular, double Deposito)
{
	this.Numero = Numero;
	this.Titular = Titular;
	this.Deposito = Deposito;
}

public int getNumero() {
		return Numero;
	}

public String getTitular() {
	return Titular;
}



public String setTitular(String Titular)
{
this.Titular = Titular;
return Titular;
}

public double getDeposito() {
		
	return Deposito;
	}



public void setDeposito(double Deposito) {
		this.Deposito = Deposito;
		
	}
	
public double getSaldo () {
	
	Saldo = Deposito - Saque;
	return Saldo;
}

public double getSaque() {
return Saque;
}

public void setSaque(double saque) {
	
	if(saque == 0)
	{
		Saque = saque;
	}
	else
	{
		Saque = saque + Tax;
	}
	
}




}

