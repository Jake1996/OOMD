package Billing;

import Building.BuildingConstructor;

public class ElectricityBill {
	public static long getBillAmount(int type,int units) {
		if(type == BuildingConstructor.COMMERCIAL) {
			return units*10000;
		}
		else if(type == BuildingConstructor.FACTORY) {
			return units*10000;
		}
		else if(type == BuildingConstructor.RESIDENTIAL) {
			return units*1000;
		}
		else return -1;
	}
}
