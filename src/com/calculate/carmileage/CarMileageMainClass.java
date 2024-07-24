package com.calculate.carmileage;

import java.util.Scanner;

public class CarMileageMainClass {
	

	public static void main(String[] args) {
		CheckforEnoughFuel checkfuel=new CheckforEnoughFuel();
		FuelRequired fuelRequired=new FuelRequired();
		FuelTank fueltank=new FuelTank(32.00,23.50);
		Scanner scanner=new Scanner(System.in);
		while(true) {
		System.out.println("******Program to simulate a car journey from one location to Another*******");
		System.out.println();
		System.out.println("What you want to know about Car.....?");
		System.out.println("1.About Fuel Tank");
		System.out.println("2.Fuel Required From Source to Destination");
		System.out.println("3.Check fuel is enough for the whole journey or not");
		System.out.println("4.Check need of refueling or not ");
		System.out.println("5.Exit");
		System.out.println("Enter the number as per your choice : ");
		int choice =scanner.nextInt();
		switch(choice) {
		case 1: System.out.println("About Fuel Tank.....");
				fueltank.fuelTankInfo();
				break;
		case 2: fuelRequired.display();
				System.out.println("Fuel Required to travel : "+ fuelRequired.fuelRequiredForJourney(fuelRequired.distance,fuelRequired.mileage) +"litres");
				break;
		case 3: if(checkfuel.fuelCheck())
				System.out.println("Fuel is enough for travelling");
				else
				System.out.println("Fuel is not enough");
				break;
		case 4: checkfuel.refuel(7);
				break;
		case 5: System.out.println("...............HAPPY JOURNEY...........");
				return;
		default:
				System.out.println("Enter the appropriate choice");
		}
	}
}
}