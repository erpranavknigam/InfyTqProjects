package infyTqProjectOne;

import java.util.Scanner;

public class ProgramOne {
	public static void main(String[] args) {
		// Implement your code here 
		Scanner sc = new Scanner(System.in);
		String typeOfFood;
		int quantity;
		int distance;
		int priceForNonVeg = 15;
		int priceForVeg = 12;
		int totalPrice = 0;
		
		System.out.print("Enter type of food(N or V): ");
		typeOfFood = sc.nextLine();
		System.out.print("Enter Quantity: ");
		quantity = sc.nextInt();
		System.out.print("Enter Distance: ");
		distance = sc.nextInt();
		
        try{
		if(typeOfFood.equals("N")){
		    totalPrice += priceForNonVeg * quantity;
		} else if(typeOfFood.equals("V")){
		    totalPrice += priceForVeg * quantity;
		} else {
			System.out.println("-1");
			return;
		}
		if(distance < 3){
		    totalPrice += 0;
		} else if(distance > 3 && distance <= 6){
		    totalPrice += 3;
		} else {
			totalPrice += ((distance - 6) * 2) + 3;
		}
		System.out.println(totalPrice);
		} catch(Exception e){
		    System.out.println(-1);
		}
		
		

	}
}
