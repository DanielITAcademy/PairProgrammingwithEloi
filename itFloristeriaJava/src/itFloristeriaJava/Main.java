package itFloristeriaJava;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		List<FlowerShop> flowerShops = new ArrayList();
		FlowerShop fs = new FlowerShop ("Floristeria Fernandez");
		flowerShops.add(fs);
		
		//llamamos a función crear floristería
		createFlowerShop(flowerShops);
		
		//llamamos a función añadir arbol
		addTree();
		
		// llamamos a funcion añadir decoración
		addDecoration();
		
		// llamamos a funcion producto
		addProduct();
		// llamamos a funcion stock
		showStock();
	}

	private static void showStock() {
		// TODO Auto-generated method stub
		
	}

	private static void addProduct() {
		// TODO Auto-generated method stub
		
	}

	private static void addDecoration() {
		// TODO Auto-generated method stub
		
		
	}

	private static void addTree() {
		// TODO Auto-generated method stub
		
	}

	private static void createFlowerShop(List<FlowerShop> flowerShops) {
		Scanner sc = new Scanner(System.in);
		FlowerShop flowershop;
		System.out.println("Introduce el nombre de la empresa: ");
		String name = sc.next();
		flowershop = new FlowerShop(name);
		flowerShops.add(flowershop);		
	}
	

}
