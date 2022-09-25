package app;

import java.util.LinkedList;

public class ej3 {

	
	public static int sumarListaEnteros(LinkedList<Integer> L, int total, int indice) {
		if(L.get(indice)!=null) {
			return 0;
		}
		else {
			total +=sumarListaEnteros(L,total,indice+1);
		}
		return total;
	}
}
