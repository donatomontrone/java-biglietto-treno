package org.lessons.java;

public class CibiPreferiti {

	public static void main(String[] args) {
		
		
		String[] favoriteFoods = {"Pizza", "Pollo", "Pasta", "Gelato", "Hamburger", "Patatine", "Verdura" };
		
		int foodsLnt = favoriteFoods.length;
		
		System.out.println("Nella classifica ho inserito " + foodsLnt + " piatti.");
		System.out.println("Questo è il mio piatto top: " + favoriteFoods[0]);
		System.out.println("Questo è il mio piatto che preferisco meno: " + favoriteFoods[foodsLnt - 1]);
		
		if (foodsLnt % 2 == 0) {
			
			String result = favoriteFoods[(foodsLnt - 1) / 2];
			System.out.println("Questo è il mio piatto di mezza classifica: " + result);
		} else {
			String result = favoriteFoods[foodsLnt / 2];
			System.out.println("Questo è il mio piatto di mezza classifica: " + result);
		}
		
	}
}