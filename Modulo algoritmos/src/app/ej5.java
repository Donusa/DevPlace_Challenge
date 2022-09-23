package app;

public class ej5 {
	
	public static void cargaNumeros() {
		int total = 0, mayor = 0, menor = 2147483647/*maximo numero posible para un integer*/
			, num = 0;
		
		do {
			System.out.println("Ingrese numero");
			num = Integer.parseInt(ScannerSingleton.getInstance().nextLine());
			if(num!=-1) {
				if(num>mayor) {
					mayor = num;
				}
				if(num<menor) {
					menor = num;
				}
				total+=num;
			}
		}while(num!=-1);
		//en el challenge 5-d) parecia identico al 5-c) por eso decidi realizar 
		//un total entre el min y max por la falta de info en el mismo
		System.out.println("Mayor: "+mayor+"\nMenor: "+menor+"\nTotal: "+total+"\nTotal entre min y max : "+(menor+mayor));
	}
}
