
public class CarClass {

	private String Make;
	private String Color;
	private double HorsePower;
	private double EngineSize;
	private int Count;
	
	public CarClass(){
		
	}
	
	public CarClass(String make, String color, double horsepower, double enginesize){
		this.Make = make;
		this.Color = color;

		
	}
	
	public String getMake() {
		return this.Make;
		
	}
	
	public void setMake(String make){
		this.Make = make;
	}
	
	public String getColor() {
		return this.Color;
	}
	
	public void setColor(String color) {
		this.Color = color;
	}
	
	public double getHorsePower(){
		return this.HorsePower;
	}
	
	public void setHorsePower(double horsepower){
		this.HorsePower = horsepower;
	}
	
	public double getEngineSize(){
		return this.EngineSize;
	}
	
	public void setEngineSize(double enginesize){
		this.EngineSize = enginesize;
	}

	
	public String toString(){
		return "The make of the car is: " + this.Make + "\nThe color of the car is: " + this.Color + "\nThe car has " +this.HorsePower + " horsepower." + "\nThe engine size is " + this.EngineSize + " liters";
	}
}

