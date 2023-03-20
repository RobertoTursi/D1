package esercizio2;

import java.util.Scanner;

public class Main {
	static Scanner s = new Scanner(System.in);	
	
	public static void main(String[] args) {
		
		System.out.println("Inserisci il numero di kilometri percorsi");
		double km = s.nextDouble(); 
		System.out.println("Inserisci il numero di litri consumati");
		double lt = s.nextDouble();
		try {	
			literPerKm(km, lt);
		}catch(Exception e) {
			e.printStackTrace();
		}
		

		
		
	}
	
	static void literPerKm(double km, double lt) throws Exception {
		if(lt == 0) {
			throw new Exception("un numero diviso 0 da infinito, prova con un numero diverso da 0");
		}
		System.out.println(km/lt);
	}
}
