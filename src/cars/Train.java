package cars;

public class Train extends Car {

	int vagonsNumber;
	String trainType;
	boolean isDisel;
	int maxSpeed;

	Train() {
		log("I'm Train");
	}

	void performTicketsCheck() {
		log("Tickets done");
	}

}
