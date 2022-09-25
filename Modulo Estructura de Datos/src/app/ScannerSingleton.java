package app;
import java.util.Scanner;

public class ScannerSingleton{
    private static Scanner sc = null;

    //utilizo el scanner a modo de singleton para evitar problemas con el garbage collector de Java

    private ScannerSingleton() {
    	
    }

    public static synchronized Scanner getInstance() {
        if (sc == null) {
        	sc = new Scanner(System.in);
        }
        return sc;
    }
}