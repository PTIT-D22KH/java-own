package composition_setup;

import composition_setup.laptop.Laptop;
import composition_setup.laptop.components.Processor;

public class Main {

	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		System.out.println(laptop.getProcessor().getBrand());


	}

}