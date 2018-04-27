package Entity;

import HW_OOP2.Tovar;

public class Shop {
	public Tovar[] goods ;

	public Shop(){
		
	}
	public Shop(Tovar[] goods) {
		
		this.goods = goods;
	}
	
	public Tovar[] getGoods() {
		return goods;
	}
	public void setGoods(Tovar[] goods) {
		this.goods = goods;
	}
	public int Count(){
		
		return goods.length;
	}
	
	public double Sum(){
		double ToReturn = 0;
		for (int i = 0; i < goods.length; i++) {
			ToReturn += goods[i].price;
		}
		return ToReturn;
	}
	public void ShowGoods(){
		for (int i = 0; i < goods.length; i++) {
			goods[i].Output();
		}
		System.out.println("Total sum: "+ Sum() );
	}
	

}
