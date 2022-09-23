package app;

public class ej1 {
	
	
	public static String esPrimo(int numero) {
		if(numero==0 || numero==1) return numero+" es primo"; 
		for(int i =  1 ; i < numero/2 ; i++) { //buscamos dentro de la mitad inferior todos los numeros posibles
				if(numero%i==0) {				//que sean divisibles ( ningun numero es divisible por mas que su mitad)
					return numero+" no es primo";
				}
		}
		
		return numero+" es primo";
		
	}

}