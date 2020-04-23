package itFloristeriaJava;

public class Decoration {
	
	private String material;

	public Decoration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Decoration(String material) {
		super();
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	@Override
	public String toString() {
		return "Decoration [material=" + material + "]";
	}
	
}
