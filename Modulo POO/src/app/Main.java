package app;

public class Main {

	public static void main(String[] args) {
		Password pass = new Password();
		System.out.println("Ingrese contraseña");
		pass.setContraseña(ScannerSingleton.getInstance().nextLine());
		System.out.println("Es fuerte: "+pass.esFuerte());
	}

}
