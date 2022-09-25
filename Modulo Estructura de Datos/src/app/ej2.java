package app;

import java.util.Stack;

public class ej2 {
	
	public static void valoresPila(Stack<Integer> pila, int nuevo, int viejo) {
		if(pila.contains(viejo)) {
			int index = pila.indexOf(viejo);
			pila.set(index, nuevo);
		}
	}
}
