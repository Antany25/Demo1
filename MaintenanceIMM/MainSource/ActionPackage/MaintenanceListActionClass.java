package ActionPackage;

import org.openqa.selenium.support.PageFactory;

import LocatorPackage.MaintenanceListLocatorClass;
import UtilsPackage.HelperClass;

public class MaintenanceListActionClass {
	
	MaintenanceListLocatorClass main = null;
	
    public MaintenanceListActionClass () {
    	
        this.main= new MaintenanceListLocatorClass();
        
        PageFactory.initElements(HelperClass.getDriver(),main);
    }
	public void maintenanceOption() {
		// TODO Auto-generated method stub
		main.maintenanceIcon.click();
		HelperClass.sleep(2000);
	}

	public void demo1Maintenance() {
		// TODO Auto-generated method stub
		main.demo1Option.click();
		HelperClass.sleep(2000);
	}

	public void actionMaintenance() {
		// TODO Auto-generated method stub
		main.actionNewRequest.click();
		HelperClass.sleep(500);
		main.startMaintenance.click();
		HelperClass.sleep(2000);
	}

	public void ongoingRequest() {
		// TODO Auto-generated method stub
		main.clickOngoingRequest.click();
		HelperClass.sleep(2000);
	}

	public void demo1Ongoing() {
		// TODO Auto-generated method stub
		main.clickDemo1Ongoing.click();
		HelperClass.sleep(2000);
	}

	public void actionOngoing() {
		// TODO Auto-generated method stub
		main.actionOngoingRequest.click();
		HelperClass.sleep(500);
		main.endMaintenance.click();
		HelperClass.sleep(2000);
	}

	public void reasonOption() {
		// TODO Auto-generated method stub
		main.clickReason.click();
		HelperClass.sleep(500);
		main.clickAnyReason.click();
		HelperClass.sleep(2000);
	}

	public void confirmMaintenance() {
		// TODO Auto-generated method stub
		main.clickConfirmEnd.click();
		HelperClass.sleep(2000);
	}

}
