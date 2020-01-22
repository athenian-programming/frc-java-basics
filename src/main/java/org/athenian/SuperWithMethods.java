package org.athenian;

public class SuperWithMethods {
  public static void main(String... args) {
    Apple apple = new Apple();
    apple.fruitColor();
  }
}

class Fruit {
  public void fruitColor() {
    System.out.println("The fruit has a color");
  }
}

class Apple extends Fruit {
  public void fruitColor() {
    super.fruitColor();
    System.out.println("Apple is Red");
  }
}