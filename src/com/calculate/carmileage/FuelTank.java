package com.calculate.carmileage;

public class FuelTank {

	public double fuelTankCapacity;
	public double remainingFuelInTank;
	public double fuelRequiredToFillTheTank;
	
	FuelTank(double fuelTankCapacity,double remainingFuelInTank){
		this.fuelTankCapacity=fuelTankCapacity;
		this.remainingFuelInTank=remainingFuelInTank;
	}
	public void fuelTankInfo(){
	System.out.println("Your fuel Tank Capacity :" +fuelTankCapacity+"litres");
	System.out.println("Remaining Fuel in the Tank:" +remainingFuelInTank+"litres");
	System.out.println("Fuel Required to fill the Tank:" +fuelRequiredToFillTheTank()+"litres");
	}
	
	public double fuelRequiredToFillTheTank() {
		return (fuelTankCapacity-remainingFuelInTank);
	}
	
}
