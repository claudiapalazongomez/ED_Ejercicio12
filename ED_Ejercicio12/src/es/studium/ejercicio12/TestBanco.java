package es.studium.ejercicio12;

public class TestBanco
{

	public static void main(String[] args)
	{
		Cliente cliente1 = new Cliente("86754523D", "Antonio Alonso", "Calle Tarifa, 5");
		Cliente cliente2 = new Cliente("13457689F", "Beatriz Benítez", "Avenida Luis Montoto, 14");
		
		Cuenta cuenta1 = new Cuenta(12345, 100.0, cliente1);
		Cuenta cuenta2 = new Cuenta(67891, 200.0, cliente2);
		
		System.out.println("La cuenta de "+ cliente1.getNombre() + " tiene " + cuenta1.getSaldo() + " euros");
		System.out.println("La cuenta de "+ cliente2.getNombre() + " tiene " + cuenta2.getSaldo() + " euros");
		
		cuenta2.setSaldo(cuenta2.getSaldo()-50);
		cuenta1.setSaldo(cuenta1.getSaldo()+50);
		
		System.out.println("La cuenta de "+ cliente1.getNombre() + " tiene " + cuenta1.getSaldo() + " euros");
		System.out.println("La cuenta de "+ cliente2.getNombre() + " tiene " + cuenta2.getSaldo() + " euros");		
	}

}
