package by.tc.task02.main;

import by.tc.task02.entity.Appliance;

public class PrintApplianceInfo {

	public static void print(Appliance appliance) {


		if (appliance != null) {
			System.out.println(appliance.getParameters());
		} else {
			System.out.println("The search has not given any results!");
		}
	}
}








