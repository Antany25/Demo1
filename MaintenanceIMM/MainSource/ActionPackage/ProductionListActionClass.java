package ActionPackage;

import org.openqa.selenium.support.PageFactory;

import LocatorPackage.ProductionListLocatorClass;
import UtilsPackage.HelperClass;

public class ProductionListActionClass {

	ProductionListLocatorClass list = null;
	
    public ProductionListActionClass () {
    	
        this.list= new ProductionListLocatorClass ();
        
        PageFactory.initElements(HelperClass.getDriver(),list);
    }
	public void clickMobileIcon() {
		// TODO Auto-generated method stub
		HelperClass.sleep(5000);
		list.mobileIcon.click();
		HelperClass.sleep(5000);
	}

	public void clickProductionOption() {
		// TODO Auto-generated method stub
		list.productionOption.click();
		HelperClass.sleep(1000);
	}

	public void clickMachineList() {
		// TODO Auto-generated method stub
		list.machineList.click();
		HelperClass.sleep(1000);
	}

	public void clickDemo1Option() {
		// TODO Auto-generated method stub
		list.clickDemo1Option.click();
		HelperClass.sleep(1000);
	}

	public void clickDemo1Production() {
		// TODO Auto-generated method stub
		list.clickDemo1Production.click();
		HelperClass.sleep(1000);
	}

	public void clickMaintenanceDemo1() {
		// TODO Auto-generated method stub
		list.maintenanceOption.click();
		HelperClass.sleep(1000);
	}

	public void clickEquipmentId(String id) {
		// TODO Auto-generated method stub
		list.equipmentId.sendKeys(id);
		HelperClass.sleep(1000);
	}

	public void clickIssueType() {
		// TODO Auto-generated method stub
		list.issueType.click();
		HelperClass.sleep(500);
		list.clickProductQuality.click();
		HelperClass.sleep(1000);
	}

	public void clickBreakdownYes() {
		// TODO Auto-generated method stub
		list.breakDown.click();
		HelperClass.sleep(500);
		list.clickBreakdownYes.click();
		HelperClass.sleep(1000);
	}

	public void clickDescription(String desc) {
		// TODO Auto-generated method stub
		list.descriptionAsFault.click();
		HelperClass.sleep(1000);
	}

	public void clickMaintenanceConfirm() {
		// TODO Auto-generated method stub
		list.mainteananceConfirm.click();
		HelperClass.sleep(1000);
	}
	public void clickConfirmProduction() {
		// TODO Auto-generated method stub
		list.clickProduction.click();
		HelperClass.sleep(1000);
		list.clickConfirmProduction.click();
		HelperClass.sleep(5000);
	}

}
