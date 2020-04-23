package itFloristeriaJava;

public class Flower {
	
	private String color;
	private int price;
	
	public Flower() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Flower(String color, int price) {
		super();
		this.color = color;
		this.price = price;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Flower [color=" + color + ", price=" + price + "]";
	}


}
