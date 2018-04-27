package Entity;

import HW_OOP2.Tovar;

public class Program {

	public static void main(String[] args) {
		Tovar[] goods = new Tovar[]{
				new Tovar("Phone" , 40 , "USA"),
				new Tovar("Microwave" , 50 , "China"),
				new Tovar("Fridge" , 30 , "Ukraine"),
				new Tovar("Car" , 1500 , "Poland"),
				new Tovar("Phone" , 70 , "Japan"),
				new Tovar("Butter" , 5 , "Ukraine"),
				new Tovar("Phone" , 50 , "USA")
		};
		
		Shop shop = new Shop(goods);
		shop.ShowGoods();
		
		
		
		
		
	
	}
}
