package app;

public class ej2 {
	
	public static void contrase�as(String pass) {
		String intento = "";
		int i = 0;
		do {
			i++;
			System.out.println("\nIngrese contrase�a : ");
			intento  = ScannerSingleton.getInstance().nextLine();
			if(!intento.equals(pass)) {
				System.out.println("Contrase�a incorrecta");
			}
		}while(i!=3 && !intento.equals(pass));
		if(intento.equals(pass)) {
			System.out.println("Felicitaciones recordas tu contrase�a");
		}
		else {
			System.out.println("Tenes que ejercitar la memoria");
		}
	}
}
