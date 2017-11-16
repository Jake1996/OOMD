package Billing;

import Building.BuildingConstructor;

public class InternetBill {
	public static long getBillAmount(int type,int units) {
		if(type == BuildingConstructor.COMMERCIAL) {
			return units*100;
		}
		else if(type == BuildingConstructor.FACTORY) {
			return units*1000;
		}
		else if(type == BuildingConstructor.RESIDENTIAL) {
			return units*10;
		}
		else return -1;
	}	
}
