package app;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		int choice = -1 ;
		do {
			System.out.println("Ingrese numero de ejercicio, o 0 para salir");
			try {
				choice = Integer.parseInt(ScannerSingleton.getInstance().nextLine());
			
			switch(choice) {
			case 1: 
					List<Integer> lista = new LinkedList<>(); // Utilizo arraylist que es el equivalente en java a las listas
					//list es una interface que extiende a todos los tipos de estructuras de datos que pueden tener multiples
					//datos cargados en simultaneo
					cargarLista(lista);
					System.out.println("Ingrese numero a retirar de la lista");
					int n = Integer.parseInt(ScannerSingleton.getInstance().nextLine());
					ej1.modificarLista(lista, n);
				break;
			case 2:
					Stack<Integer> pila = new Stack<>();
					cargarLista(pila); // ya que la pila extiende de List pueden aplicarse los mismos metodos
					//ademas, por la ley de sustitucion de Liskov puede comportarse como el padre sin problemas (en este caso List)
					System.out.println("Ingrese el valor viejo");
					int viejo = Integer.parseInt(ScannerSingleton.getInstance().nextLine());
					System.out.println("Ingrese el valor nuevo");
					int nuevo = Integer.parseInt(ScannerSingleton.getInstance().nextLine());
					ej2.valoresPila(pila, nuevo, viejo);
				break;
			case 3:
					LinkedList<Integer> lista2 = new LinkedList<>();
					cargarLista(lista2);
					System.out.println(ej3.sumarListaEnteros(lista2, 0, 0));
				break;
			case 0 : break;
			default: System.out.println("Valor no valido");
			}
			} catch (Exception e) {
				System.out.println("Valor no valido");
			}
		}while(choice != 0);
		
	}
	
	
	public static void cargarLista(List<Integer> L) {
		int ciclo = -1, nAdd;
		do {
			System.out.println("Ingresar otro valor? 1.Si 0.No");
			ciclo = Integer.parseInt(ScannerSingleton.getInstance().nextLine());
			if(ciclo==1) {
				System.out.println("Valor a ingresar");
				nAdd = Integer.parseInt(ScannerSingleton.getInstance().nextLine());
				L.add(nAdd);
			}
		}while(ciclo!=0);
	}
	
}
