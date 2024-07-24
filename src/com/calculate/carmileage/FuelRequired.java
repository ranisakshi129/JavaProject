package com.calculate.carmileage;

import java.util.Scanner;

public class FuelRequired {
	Scanner scanner=new Scanner(System.in);
	String sourceLocation;
	String destinationLocation;
	double distance;
	double mileage;
	public void display() {
		System.out.println("Enter the Source Location:");
		scanner.nextLine();
		sourceLocation=scanner.nextLine();
		System.out.println("Enter the destination Location :");
		destinationLocation=scanner.nextLine();
		System.out.println("How much distance you have to travelled in kilometers??");
		distance=scanner.nextDouble();
		System.out.println("Mileage :");
		mileage=scanner.nextInt();
		System.out.println("Distance between "+ sourceLocation +" to " + destinationLocation +" is : "+ distance +"km");
	}
	
	public double fuelRequiredForJourney(double distance,double mileage ) {
		 return (distance/mileage);
	 }
}
