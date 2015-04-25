package cars;

public class Car {

	int whelsNumber;
	int seatsNumber;
	int doorsNumber;
	double enginePower;
	String colour;
	String fuelType;
	String modelName;

	Car() {
		this.modelName = "Unknown name";
	}

	Car(String name) {
		this.modelName = name;
		log("I'm Car: " + this.modelName);

	}

	Car(String name, String color) {

		this.colour = color;
	}

	Car(String color, int whelsNumber) {
		this.whelsNumber = whelsNumber;
		this.colour = color;
	}

	void engineStart() {
		engineStart(0);
	}

	void engineStart(int initialSpeed) {
		log(modelName + ": Engine started at " + initialSpeed);
	}

	void engineStop() {
		log(modelName + ": Engine stoped");
	}

	void moveForward(double distance) {
		log(modelName + ": Moving forward on " + distance + " meters");
	}

	void moveBackward(double distance) {
		log(modelName + ": Moving backward on " + distance + " meters");
	}

	void turn(double angle) {
		log(modelName + ": Turned on " + angle + " degrees");
	}

	protected void log(String message) {
		System.out.println(message);
	}

	public int getWhelsNumber() {
		return whelsNumber;
	}

	public int setWhelsNumber(int whelsNumber) {

		if (whelsNumber <= 0)
			whelsNumber = 2;

		this.whelsNumber = whelsNumber;

		return whelsNumber;
	}

}
