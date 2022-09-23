package app;

public class ej2 {
	
	public static void contraseñas(String pass) {
		String intento = "";
		int i = 0;
		do {
			i++;
			System.out.println("\nIngrese contraseña : ");
			intento  = ScannerSingleton.getInstance().nextLine();
			if(!intento.equals(pass)) {
				System.out.println("Contraseña incorrecta");
			}
		}while(i!=3 && !intento.equals(pass));
		if(intento.equals(pass)) {
			System.out.println("Felicitaciones recordas tu contraseña");
		}
		else {
			System.out.println("Tenes que ejercitar la memoria");
		}
	}
}
