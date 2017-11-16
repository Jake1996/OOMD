package Billing;

import Building.BuildingConstructor;
import Building.Site;

public class Bill {
	public static long getTotalBillAmount(Site s) {
		long sum = 0;
		int type = -1;
		if(s.getType()=="Residential") {
			type = BuildingConstructor.RESIDENTIAL;
		}
		else if(s.getType()=="Factory") {
			type = BuildingConstructor.FACTORY;
		}
		else if(s.getType()=="Commercial") {
			type = BuildingConstructor.COMMERCIAL;
		}
		sum += ElectricityBill.getBillAmount(type, s.getElectricity());
		sum += InternetBill.getBillAmount(type, s.getInterent());
		sum += WaterBill.getBillAmount(type, s.getWater());
		return sum;
	}
}
