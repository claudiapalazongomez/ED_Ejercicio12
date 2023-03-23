package es.studium.ejercicio12;

public class Cuenta
{
	private int numCuenta;
	private double saldo;
	private Cliente cliente;
	
	public Cuenta(int numCuenta, double saldo, Cliente cliente)
	{
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public int getNumCuenta()
	{
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta)
	{
		this.numCuenta = numCuenta;
	}

	public double getSaldo()
	{
		return saldo;
	}

	public void setSaldo(double saldo)
	{
		this.saldo = saldo;
	}

	public Cliente getCliente()
	{
		return cliente;
	}

	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}
	
	
	
}
