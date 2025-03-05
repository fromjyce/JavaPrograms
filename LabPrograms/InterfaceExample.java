/*Write a java program to create an interface Flyable with a method called fly_obj(). Create three classes Spacecraft, Airplane and Helicopter that implement the Flyable interface. Implement the fly_obj() method for each of the three classes.*/

interface Flyable {
	public void fly_obj();
}

class Spacecraft implements Flyable{
	
	 public void fly_obj() {
		System.out.println("Spacecraft Class - Method is called");
	}
}

class Airplane implements Flyable{
	 public void fly_obj() {
		System.out.println("Airplane Class - Method is called");
	}
}

class Helicopter implements Flyable{
	public void fly_obj() {
		System.out.println("Helicopter Class - Method is called");
	}
}

public class InterfaceExample {
	public static void main(String[] args) {
		Spacecraft spc = new Spacecraft();
		Airplane air = new Airplane();
		Helicopter heli = new Helicopter();
		spc.fly_obj();
		air.fly_obj();
		heli.fly_obj();
	}
}
