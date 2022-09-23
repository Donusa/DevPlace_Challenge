package app;

public class Main {

	public static void main(String[] args) {
		int choice = -1 ;
		do {
			System.out.println("Ingrese numero de ejercicio, o 0 para salir");
			try {
				choice = Integer.parseInt(ScannerSingleton.getInstance().nextLine());
			
			switch(choice) {
			case 1: 
					System.out.println("\n ingrese numero para evaluar si es primo");
					int num = Integer.parseInt(ScannerSingleton.getInstance().nextLine());
					System.out.println(ej1.esPrimo(num));
				break;
			case 2: 
					System.out.println("\nIngrese la contraseña que intentara adivinar");
					String pass = ScannerSingleton.getInstance().nextLine();
					ej2.contraseñas(pass);
				break;
			case 3:
					System.out.println("Ingrese nombre del empleado");
					String nombre = ScannerSingleton.getInstance().nextLine();
					System.out.println("Ingrese el valor de la hora trabajada");
					double valorHora = Integer.parseInt(ScannerSingleton.getInstance().nextLine());
					System.out.println("Ingrese cantidad de horas trabajdas en el mes");
					int horasTrabajadas = Integer.parseInt(ScannerSingleton.getInstance().nextLine());
					ej3.cobros(valorHora, nombre, horasTrabajadas);
				break;
			case 4:
					ej4.adivinador();
				break;
			case 5:
					ej5.cargaNumeros();
				break;
			case 0 : break;
			default: System.out.println("Valor no valido");
			}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Valor no valido");
			}
		}while(choice != 0);
		
		
	}

}
