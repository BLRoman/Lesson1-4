package cars;

import home.BaseHome;
import home.ConcreteHome;
import home.TreeHouse;
import home.WoodenHome;

public class Hello2 {

	public static void main(String[] args) {

		BaseHome[] bh = { new ConcreteHome(), new TreeHouse(),
				new WoodenHome(), new BaseHome() };
		System.out.println(BaseHome.value);
		BaseHome.value = 34;

		for (BaseHome home : bh) {
			home.build();
			System.out.println(home.homeNumber);
			System.out.println(home.value);
			BaseHome.value = 334;
		}
		BaseHome.value = 33334;
		BaseHome aaa = new BaseHome();
		System.out.println(aaa.homeNumber);
		System.out.println(BaseHome.value);

		for (BaseHome home : bh) {

			System.out.println(home.homeNumber);
			System.out.println(home.value);

		}

		Car hondaCivic = new Car("HondaCivic");
		Car vaz2109 = new Car("Red", 4);

		Train vl3210 = new Train();

		hondaCivic.engineStart();
		hondaCivic.engineStop();
		hondaCivic.moveForward(500.32);
		vaz2109.engineStart(2000);

		vl3210.engineStart();
		vl3210.performTicketsCheck();

		hondaCivic.enginePower = -123.43;

		int a = hondaCivic.setWhelsNumber(43);

		System.out.println(hondaCivic.colour);
		System.out.println(vaz2109.colour);
		System.out.println(a);

	}

}
