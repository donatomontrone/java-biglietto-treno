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
				float result = ( ticketPrice - (ticketPrice * 0.2f));
				System.out.println("Essendo minorenne hai diritto ad uno sconto del 20% quindi il tuo biglietto costa " + String.format("%.2f", result) + "€, invece che " + String.format("%.2f", ticketPrice) + "€");
			} else if(userAge > 65) {
				float result = ( ticketPrice - (ticketPrice * 0.4f));
				System.out.println("Essendo over65 hai diritto ad uno sconto del 40% quindi il tuo biglietto costa " + String.format("%.2f", result) + "€, invece che " + String.format("%.2f", ticketPrice) + "€");

			} else {
				float result = (userKm * ticketPrice);
				System.out.println("Il tuo biglietto costa " + String.format("%.2f", result) + "€");
			}
		}
		
	}
}
