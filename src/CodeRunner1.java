
public class CodeRunner1 {

	public static void main(String[] args) {
		
		
		Car car1 = new Car();
		
		car1.brand = "Kia";
		car1.model = "Rio";
		car1.amountOfFuel = 2;
		
		
		car1.brake();
		car1.accelerate();
		car1.printData();
		
	}

} 

class Car {
	
	public int amountOfFuel;
	public String model;
	public String brand;
	
	public void brake()
	{
	    System.out.println("Car is accelerating");
	    System.out.println("Car is accelerating");
		System.out.println("Car is breaking");
	}
	
	public void accelerate()
	{
		amountOfFuel=amountOfFuel-1;
	}
	
	public void printData()
	{
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Fuel: " + amountOfFuel);
		
	}
	
}
