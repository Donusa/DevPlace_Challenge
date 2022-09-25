package app;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
	private int longitud = 8;
	private String contraseña;
	
	public Password() {
		this.contraseña = passGen();
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = passGen();
	}
	
	public String passGen() {
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String pass = "";
		for(int i = 0 ; i < this.longitud; i++) {
			Random r = new Random();
			int index = r.nextInt(caracteres.length());
			pass = pass+caracteres.charAt(index);
		}
		
		return pass;
	}
	
	public boolean esFuerte() {
		long mayusculas = this.contraseña.chars()
				        	.map(i -> (char) i)
				        	.filter(c -> Character.isUpperCase(c))
				        	.count();
		long minusculas = this.contraseña.chars()
				        	.map(i -> (char) i)
				        	.filter(c -> Character.isLowerCase(c))
				        	.count();
		int nums = 0;
		Pattern regDigitos = Pattern.compile("\\d");
		Matcher countNumMatcher = regDigitos.matcher(this.contraseña);
		
		while(countNumMatcher.find()) {
			nums++;
		}
		if(mayusculas>2 
				&&	minusculas >1
				&&	nums>3) {
			return true;
		}
		return false;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	

}
