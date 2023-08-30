package ActionPackage;

import org.openqa.selenium.support.PageFactory;

import LocatorPackage.ProfilePageLocatorClass;
import UtilsPackage.HelperClass;

public class ProfilePageActionClass {
	
	ProfilePageLocatorClass pro = null;
	
    public ProfilePageActionClass() {
    	
        this.pro= new ProfilePageLocatorClass();
        
        PageFactory.initElements(HelperClass.getDriver(),pro);
    }
    
	public void clickScheduleIcon() {
		// TODO Auto-generated method stub=
		HelperClass.sleep(5000);
		pro.schedule.click();
		HelperClass.sleep(1000);
	}

	public void clickSchedulerGantt() {
		// TODO Auto-generated method stub
		pro.schedulerGantt.click();
		HelperClass.sleep(1000);
	}

}
