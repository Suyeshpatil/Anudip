package beautyproduct;

import java.util.Scanner;

public class DiscountRate {
	static float findFinalPricePremieme(float price) {
		int discount = 20;
		float discountprice = (price * discount) / 100;       //calculates the discount
		return price - discountprice;				//returns price after discount
	}

	static float findFinalPriceGold(float price) {
		int discount = 15;
		float discountprice = (price * discount) / 100;
		return price - discountprice;
	}

	static float findFinalPriceSilver(float price) {
		int discount = 10;
		float discountprice = (price * discount) / 100;
		return price - discountprice;
	}

	public static void main(String[] args) {
		int price;
		int discount;

		Scanner sc = new Scanner(System.in);
		//input by user
		System.out.println("Enter price of the product :");
		price = sc.nextInt();
		//printing the values after discount on original price
		System.out.println("Final price premieme after 20% Discount is" + findFinalPricePremieme(price));
		System.out.println("Final price Gold after 15% Discount is " + findFinalPriceGold(price));
		System.out.println("Final price Silver after 10% Discount is " + findFinalPriceSilver(price));
	}

} 


//Output:-
//Enter price of the product :
//900
//Final price premieme after 20% Discount is720.0
//Final price Gold after 15% Discount is 765.0
//Final price Silver after 10% Discount is 810.0
