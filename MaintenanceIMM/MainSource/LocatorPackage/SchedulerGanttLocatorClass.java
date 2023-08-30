package LocatorPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SchedulerGanttLocatorClass {
	
	@FindBy(xpath="/html/body/app-root/done-ui-portal/mat-drawer-container/mat-drawer-content/div/div/done-fac-factory/div/done-fac-schedular/div/div[2]/div[2]/done-fac-tabs-panel/div/mat-tab-group/mat-tab-header/div[2]/div/div/div[3]")
	public WebElement activityOrder;
	
	@FindBy(xpath="/html/body/app-root/done-ui-portal/mat-drawer-container/mat-drawer-content/div/div/done-fac-factory/div/done-fac-schedular/div/div[2]/div[2]/done-fac-tabs-panel/div/mat-tab-group/div/mat-tab-body[3]/div/done-fac-activities/div/div[2]/button[1]/span[1]/mat-icon")
	public WebElement addOrder;
	
	@FindBy(xpath="//*[@id=\"mat-dialog-1\"]/done-fac-add-activity-order/div/div[2]/div[1]/div/mat-form-field[1]/div")
	public WebElement clickType;
	
	@FindBy(xpath="//*[@id=\"mat-option-31\"]")
	public WebElement clickMaintenance;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/mat-dialog-container/done-fac-add-activity-order/div/div[2]/div[1]/div/mat-form-field[2]/div/div[1]/div[3]/input")
	public WebElement clickDescription;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/mat-dialog-container/done-fac-add-activity-order/div/div[2]/div[1]/div/mat-form-field[4]/div/div[1]/div[3]/mat-select/div/div[1]/span")
	public WebElement clickMaterial;
	
	@FindBy(xpath="/html/body/div[4]/div[4]/div/div/div/mat-option/span")
	public WebElement clickMaintenance01;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/mat-dialog-container/done-fac-add-activity-order/div/div[2]/div[1]/div/mat-form-field[5]/div/div[1]/div[3]/mat-select/div/div[1]/span")
	public WebElement clickMachine;
	
	@FindBy(xpath="/html/body/div[4]/div[4]/div/div/div/mat-option[1]/span")
	public WebElement clickDemo01;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/mat-dialog-container/done-fac-add-activity-order/div/div[2]/div[2]/div/div[1]/doui-quantity-control/div/mat-form-field/div/div[1]/div[3]/input")
	public WebElement clickTimeDuration;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/mat-dialog-container/done-fac-add-activity-order/div/div[3]/div/button[2]/span[1]")
	public WebElement clickAddConfirm;
	
	@FindBy(xpath="/html/body/app-root/done-ui-portal/mat-drawer-container/mat-drawer-content/div/div/done-fac-factory/div/done-fac-schedular/div/div[2]/div[2]/done-fac-tabs-panel/div/mat-tab-group/div/mat-tab-body[3]/div/done-fac-activities/div/div[3]/table/tbody/tr/td[1]/mat-checkbox/label/span[1]")
	public WebElement clickCheckBox;
	
	@FindBy(xpath="/html/body/app-root/done-ui-portal/mat-drawer-container/mat-drawer-content/div/div/done-fac-factory/div/done-fac-schedular/div/div[2]/div[2]/done-fac-tabs-panel/div/mat-tab-group/div/mat-tab-body[3]/div/done-fac-activities/div/div[2]/button[3]/span[1]")
	public WebElement clickScheduleIcon;
	
	@FindBy(xpath="//*[@id=\"mat-dialog-0\"]/done-fac-confirm/div/div[3]/div/button[2]")
	public WebElement clickConfirmSchedule;
}
