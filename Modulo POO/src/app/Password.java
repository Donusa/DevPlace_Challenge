package app;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
	private int longitud = 8;
	private String contrase�a;
	
	public Password() {
		this.contrase�a = passGen();
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrase�a = passGen();
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
		long mayusculas = this.contrase�a.chars()
				        	.map(i -> (char) i)
				        	.filter(c -> Character.isUpperCase(c))
				        	.count();
		long minusculas = this.contrase�a.chars()
				        	.map(i -> (char) i)
				        	.filter(c -> Character.isLowerCase(c))
				        	.count();
		int nums = 0;
		Pattern regDigitos = Pattern.compile("\\d");
		Matcher countNumMatcher = regDigitos.matcher(this.contrase�a);
		
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

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	

}
