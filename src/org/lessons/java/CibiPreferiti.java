package org.lessons.java;

public class CibiPreferiti {

	public static void main(String[] args) {
		
		
		String[] favoriteFoods = {"Pizza", "Pollo", "Pasta", "Gelato", "Hamburger", "Patatine", "Verdura", "Broccoli" };
		
		int foodsLnt = favoriteFoods.length;
		
		System.out.println("Nella classifica ho inserito " + foodsLnt + " piatti.");
		System.out.println("Questo è il mio piatto top: " + favoriteFoods[0]);
		System.out.println("Questo è il piatto che preferisco meno: " + favoriteFoods[foodsLnt - 1]);
		
		int halfIndex = foodsLnt / 2;
		String result = favoriteFoods[halfIndex];
		System.out.println("Questo è il piatto di mezza classifica: " + result);
		
		if (foodsLnt % 2 == 0) {
			
			String result2 = favoriteFoods[halfIndex - 1];
			System.out.println("Questo è il piatto di mezza classifica: " + result2);
		}	
	}
}