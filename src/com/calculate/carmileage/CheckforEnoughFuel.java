package com.calculate.carmileage;

public class CheckforEnoughFuel {
	FuelTank fueltank=new FuelTank(32.00,23.50);
	double fuelTankCapacity=fueltank.fuelTankCapacity;
	public boolean fuelCheck() {
	if(fueltank.remainingFuelInTank >= fueltank.fuelRequiredToFillTheTank()) {
		return true;
	}
	else {
		return false;
	}
	}
	public void refuel(double fuel) {
	if (fueltank.remainingFuelInTank + fuel > fuelTankCapacity) {
		fueltank.remainingFuelInTank = fuelTankCapacity;
  } else {
	  fueltank.remainingFuelInTank += fuel;
  }
  System.out.println("Need to be refueling the car tank. Current fuel level: " + fueltank.remainingFuelInTank + "litres.");
	}
}
