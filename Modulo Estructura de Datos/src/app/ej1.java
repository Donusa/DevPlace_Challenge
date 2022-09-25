package app;

import java.util.List;

public class ej1 {

	public static void modificarLista(List<Integer> L, int n) {
		if(L.contains(n)) {
			L.remove(Integer.valueOf(n));
		}
	}
	
}
