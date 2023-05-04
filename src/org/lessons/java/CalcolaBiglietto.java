package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

	 public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci il numero di Km che vuoi percorrere");
		int userKm = in.nextInt();
		
		System.out.println("Bene, adesso inserisci la tua età");
		
		int userAge = in.nextInt();	
		
		in.close();
		
		float ticketPrice = userKm * 0.21f;
		
		if (userAge > 0 && userAge < 105) {
			if(userAge < 18) {
				float result =(float) ( ticketPrice - (ticketPrice * 0.2));
				System.out.println("Essendo minorenne hai diritto ad uno sconto del 20% quindi il tuo biglietto costa " + result + "euro, invece che " + ticketPrice + "euro");
			} else if(userAge > 65) {
				float result = (float) ( ticketPrice - (ticketPrice * 0.4));
				System.out.println("Essendo over65 hai diritto ad uno sconto del 40% quindi il tuo biglietto costa " + result + "euro, invece che " + ticketPrice + "euro");

			} else {
				float result = (userKm * ticketPrice);
				System.out.println("Il tuo biglietto costa " + result + "euro");
			}
		}
		
	}
}
