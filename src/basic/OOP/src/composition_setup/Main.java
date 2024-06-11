package composition_setup;

import composition_setup.laptop.Laptop;
import composition_setup.laptop.components.GraphicsCard;
import composition_setup.laptop.components.Processor;

public class Main {

	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		System.out.println(laptop.getGraphicsCard().getBrand());


		Processor p1 = new Processor();
		GraphicsCard g1 = new GraphicsCard();

		Laptop l1  = new Laptop(24.0f,p1 , "DDR5", "1TB", g1,  "Single Layer", "backLed");
		System.out.println(l1);
	}

}