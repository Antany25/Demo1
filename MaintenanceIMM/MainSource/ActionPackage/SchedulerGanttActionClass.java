package ActionPackage;

import org.openqa.selenium.support.PageFactory;

import LocatorPackage.SchedulerGanttLocatorClass;
import UtilsPackage.HelperClass;

public class SchedulerGanttActionClass {
	
	SchedulerGanttLocatorClass gantt = null;
	
    public SchedulerGanttActionClass() {
    	
        this.gantt= new SchedulerGanttLocatorClass();
        
        PageFactory.initElements(HelperClass.getDriver(),gantt);
    }
	public void clickActivityOrder() {
		// TODO Auto-generated method stub
		gantt.activityOrder.click();
		HelperClass.sleep(1000);
	}

	public void clickAddIcon() {
		// TODO Auto-generated method stub
		gantt.addOrder.click();
		//HelperClass.sleep(1000);
	}

	public void clickTypeButton() {
		gantt.clickType.click();
		//HelperClass.sleep(500);
		gantt.clickMaintenance.click();
		HelperClass.sleep(1000);
	}

	public void clickDescription(String desc) {
		// TODO Auto-generated method stub
		gantt.clickDescription.sendKeys(desc);
		HelperClass.sleep(1000);
	}

	public void clickMaterial() {
		// TODO Auto-generated method stub
		gantt.clickMaterial.click();
		HelperClass.sleep(500);
		gantt.clickMaintenance01.click();
		HelperClass.sleep(1000);
	}

	public void clickMachine() {
		// TODO Auto-generated method stub
		gantt.clickMachine.click();
		HelperClass.sleep(500);
		gantt.clickDemo01.click();
		HelperClass.sleep(1000);
	}

	public void clickTimeDuration(String time) {
		// TODO Auto-generated method stub
		gantt.clickTimeDuration.clear();
		gantt.clickTimeDuration.sendKeys(time);
		HelperClass.sleep(1000);
	}

	public void clickConfirmAdd() {
		// TODO Auto-generated method stub
		gantt.clickAddConfirm.click();
		HelperClass.sleep(1000);
	}

	public void clickCheckBox() {
		// TODO Auto-generated method stub
		gantt.clickCheckBox.click();
		HelperClass.sleep(3000);
	}

	public void clickOrderSchedule() {
		// TODO Auto-generated method stub
		gantt.clickScheduleIcon.click();
		HelperClass.sleep(1000);
	}

	public void clickConfirmOption() {
		// TODO Auto-generated method stub
		gantt.clickConfirmSchedule.click();
		HelperClass.implicitWait();
	}

}
