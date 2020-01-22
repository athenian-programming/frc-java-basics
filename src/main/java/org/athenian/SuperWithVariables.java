package org.athenian;

public class SuperWithVariables {
  public static void main(String... args) {
    Bike bike = new Bike();
    bike.printWheels();
  }
}

class Vehicle {
  int wheelCount = 4;
}

class Bike extends Vehicle {
  int wheelCount2 = 2;

  public void printWheels() {
    System.out.println("Number of wheels in Bike : " + wheelCount2);
    System.out.println("Number of wheels in Vehicle : " + super.wheelCount);
  }
}