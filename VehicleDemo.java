package firstProject;

public class VehicleDemo {
	
	    public static void main(String[] args) {
	    	System.out.println("Made By Muhammad Kaif Shamim!");

	        Vehicle car = new Vehicle();
	        car.no_of_seats = 5;
	        car.no_of_wheels = 4;

	        Vehicle motorcycle = new Vehicle();
	        motorcycle.no_of_seats = 2;
	        motorcycle.no_of_wheels = 2;

	        car.displayDetails("Car");
	        motorcycle.displayDetails("Motorcycle");
	    }
	

}
