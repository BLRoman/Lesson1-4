package home;

import java.util.Random;

public class BaseHome {

	final public int homeNumber;
	public static int value = 10;

	public BaseHome() {
		Random rd = new Random();
		this.homeNumber = rd.nextInt(100);

	}

	public void build()

	{
		// homeNumber=232;

		System.out.println("can't build. no money");
	}

}
