package app;

public class Main {

	public static void main(String[] args) {
		Password pass = new Password();
		System.out.println("Ingrese contrase�a");
		pass.setContrase�a(ScannerSingleton.getInstance().nextLine());
		System.out.println("Es fuerte: "+pass.esFuerte());
	}

}
