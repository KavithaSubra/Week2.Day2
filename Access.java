package Week2.Day2;

import Week3.Day1.Car;

public class Access extends Car {
	
	

	private static String carColor;

	public static void main(String[] args) {
		Access access=new Access();
		carColor = access.color;
		access.fuelType();
	}
}
