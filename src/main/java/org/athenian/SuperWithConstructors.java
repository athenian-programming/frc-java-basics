package org.athenian;

public class SuperWithConstructors {
  public static void main(String... args) {
    new Child();
  }
}

class Child extends Parent {
  public Child() {
    System.out.println("Inside Child constructor");
  }
}

class Parent extends SuperClass {

  public Parent() {
    this("Hello World");
    System.out.println("Inside Parent constructor");
  }

  public Parent(String s) {
    System.out.println("Inside Parent parameterized constructor with value : " + s);
  }

}

class SuperClass {
  public SuperClass() {
    System.out.println("Inside SuperClass constructor");
  }
}