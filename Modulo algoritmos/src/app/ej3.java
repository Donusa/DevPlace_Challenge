package app;

public class ej3 {

	
		public static void cobros(double valorPorHora, String nombreEmpleado, int horasMensuales) {
			double total = 0;
			total+= (valorPorHora*horasMensuales);
			System.out.println("Ingrese su antiguedad");
			int antiguedad = Integer.parseInt(ScannerSingleton.getInstance().nextLine());
			if(antiguedad>10) {
				total += (antiguedad*30);
			}
			System.out.println("Nombre : "+nombreEmpleado+"\nAntiguedad : "+antiguedad+"\nMonto a cobrar : "+total);
		}
}
