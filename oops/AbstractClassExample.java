package oops;


abstract class Vehicle { 
 abstract void start();

 void stop() {
     System.out.println("The vehicle has stopped.");
 }
}

class Car extends Vehicle {

 void start() {
     System.out.println("The car starts with a key.");
 }
}

public class AbstractClassExample {
 public static void main(String[] args) {
     
     Car myCar = new Car();
     myCar.start(); 
     myCar.stop();  
 }
}
