package entity;


public class GameSell   {
	
	private int  price;
	private double discount;
	private double discountedPrice;
	
	public GameSell (int price , double discount , double discountedPrice ) {
		super();
		this.price = price;
		this.discount = discount;
		this.discountedPrice = discountedPrice;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getDiscountedPrice() {
		return price-(price*discount/100);
	}

	
	
	

}
