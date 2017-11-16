package Main;

import java.util.Iterator;

import Billing.Bill;
import Building.BuildingConstructor;
import Building.Site;

public class World {
	public static void main(String args[]) {
		Site s1,s2,s3;
		
		s1 = BuildingConstructor.getSite(BuildingConstructor.RESIDENTIAL, 10, 20);
		s2 = BuildingConstructor.getSite(BuildingConstructor.FACTORY, 200, 300);
		s3 = BuildingConstructor.getSite(BuildingConstructor.COMMERCIAL, 50, 60);
		
		s1.setElectricity(10);
		s2.setElectricity(20);
		s3.setElectricity(20);
		s1.setInterent(200);
		s2.setInterent(200);
		s3.setInterent(200);
		s1.setWater(50);
		
		System.out.println(s1.getType()+" "+Bill.getTotalBillAmount(s1));
		System.out.println(s2.getType()+" "+Bill.getTotalBillAmount(s2));
		System.out.println(s3.getType()+" "+Bill.getTotalBillAmount(s3));
		
		//get all site iterator
		Iterator<Site> it = BuildingConstructor.getAllSites();
		while(it.hasNext()) {
			System.out.println(it.next().getType());
		}
	}
}
