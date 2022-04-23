package com.prgs.eteco.TecoECommerce.utils;

public class Vehicle {
  protected int wheels;
  protected String licencePlate;
  protected String color;

  public void drive() {
    System.out.println("Driving Vehicle!!");
  }

  public static void testStatic() {
    // wheels = 10; not possible as wheels is not static
  }

  public static void main(String[] args) {
    Vehicle c = new Car();
    Vehicle t = new Truck();
    c.wheels = 4;

    c.drive();
    t.drive();
  }
}

 class Car extends Vehicle{
  int seats;
  public Car() {
    wheels = 4;
  }

  public void drive() {
    System.out.println("Driving Car!!");
  }
 }

 class SUV extends Car {

 }

 class Truck extends Vehicle {
  int cargoSpace;

  public void drive() {
    System.out.println("Driving Truck!!");
  }
 }