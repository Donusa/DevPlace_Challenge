package app;

public class ej2 {
	
	public static void contraseņas(String pass) {
		String intento = "";
		int i = 0;
		do {
			i++;
			System.out.println("\nIngrese contraseņa : ");
			intento  = ScannerSingleton.getInstance().nextLine();
			if(!intento.equals(pass)) {
				System.out.println("Contraseņa incorrecta");
			}
		}while(i!=3 && !intento.equals(pass));
		if(intento.equals(pass)) {
			System.out.println("Felicitaciones recordas tu contraseņa");
		}
		else {
			System.out.println("Tenes que ejercitar la memoria");
		}
	}
}
