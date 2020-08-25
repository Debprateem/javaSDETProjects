package sdetFramework;

public class Car {
    //Class Member Variables
    String color;
    int make;
    String transmission;
    int tyres;
    int doors;
	
    //Constructor
    Car() {
	tyres = 4;
	doors = 4;
    }

    //Class Methods
    public void displayCharacterstics(){
	System.out.println("Car Color: " + color);
	System.out.println("Car Make: " + make);
	System.out.println("Car Transmission: " + transmission);
	System.out.println("Number of doors on the car: " + doors);
    	System.out.println("Number of tyres on the car: " + tyres);
    }

    public void accelerate() {
	System.out.println("Car is moving forward.");
    }
	
    public void brake() {
	System.out.println("Car has stopped.");
    }
}