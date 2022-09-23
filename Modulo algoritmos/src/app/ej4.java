package app;


public class ej4 {

	
	public static void adivinador() {
		int num = (int) (Math.random() * (1001));
		int guess = -1;
		do {
			System.out.println("Intente adivinar el numero");
			guess  = Integer.parseInt(ScannerSingleton.getInstance().nextLine());
			if(guess>num) {
				System.out.println("El numero objetivo es mas bajo");
			}
			if(guess<num) {
				System.out.println("El numero objetivo es mas grande");
			}
		}while (guess!= num);
		System.out.println("Adivinaste, el numero es "+num);
	}
}
