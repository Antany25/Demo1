package LocatorPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductionListLocatorClass {
	
	@FindBy(xpath="/html/body/app-root/done-ui-portal/mat-drawer-container/mat-drawer/div/div/done-sidenav/div/div[1]/div[2]/a[12]/done-icon/mat-icon")
	public WebElement mobileIcon;
	
	@FindBy(xpath="/html/body/d-one-root/ion-app/ion-router-outlet/d-one-tabs/ion-tabs/div/ion-router-outlet/d-one-menu/ion-content/ion-card[1]/d-one-card-menu/ion-item/ion-label")
	public WebElement productionOption;
	
	@FindBy(xpath="/html/body/d-one-root/ion-app/ion-router-outlet/d-one-tabs/ion-tabs/div/ion-router-outlet/d-one-production/ion-content/ion-list[1]/d-one-item-menu/ion-item/ion-label")
	public WebElement machineList;
	
	@FindBy(xpath="//body/d-one-root[1]/ion-app[1]/ion-router-outlet[1]/d-one-tabs[1]/ion-tabs[1]/div[1]/ion-router-outlet[1]/d-one-machine-list[1]/ion-content[1]/ion-list[1]/ion-item[1]/ion-grid[1]/ion-row[1]/ion-col[1]/ion-text[1]/b[1]")
	public WebElement clickDemo1Option;
	
	@FindBy(xpath="/html/body/d-one-root/ion-app/ion-router-outlet/d-one-tabs/ion-tabs/div/ion-router-outlet/d-one-production-machine/ion-content/div/ion-grid/ion-row[1]/ion-col/ion-row[2]")
	public WebElement clickDemo1Production;
	
	@FindBy(xpath="/html/body/d-one-root/ion-app/ion-action-sheet/div[2]/div/div/button[1]")
	public WebElement maintenanceOption;
	
	@FindBy(xpath="//body/d-one-root[1]/ion-app[1]/ion-router-outlet[1]/d-one-tabs[1]/ion-tabs[1]/div[1]/ion-router-outlet[1]/d-one-production-request-maintenance[1]/ion-content[1]/ion-list[1]/ion-item[1]/ion-input[1]/input[1]")
	public WebElement equipmentId;
	
	@FindBy(xpath="/html/body/d-one-root/ion-app/ion-router-outlet/d-one-tabs/ion-tabs/div/ion-router-outlet/d-one-production-request-maintenance/ion-content/ion-list/ion-item[2]")
	public WebElement issueType;
	
	@FindBy(xpath="/html/body/d-one-root/ion-app/ion-action-sheet/div[2]/div/div[1]/button[2]")
	public WebElement clickProductQuality;
	
	@FindBy(xpath="/html/body/d-one-root/ion-app/ion-router-outlet/d-one-tabs/ion-tabs/div/ion-router-outlet/d-one-production-request-maintenance/ion-content/ion-list/ion-item[3]")
	public WebElement breakDown;
	
	@FindBy(xpath="/html/body/d-one-root/ion-app/ion-action-sheet/div[2]/div/div[1]/button[1]")
	public WebElement clickBreakdownYes;
	
	@FindBy(xpath="/html/body/d-one-root/ion-app/ion-router-outlet/d-one-tabs/ion-tabs/div/ion-router-outlet/d-one-production-request-maintenance/ion-content/ion-list/ion-item[5]/ion-input/input")
	public WebElement descriptionAsFault;
	
	@FindBy(xpath="/html/body/d-one-root/ion-app/ion-router-outlet/d-one-tabs/ion-tabs/div/ion-router-outlet/d-one-production-request-maintenance/ion-content/div[2]/ion-button[2]")
	public WebElement mainteananceConfirm;
	
	@FindBy(xpath="/html/body/d-one-root/ion-app/ion-action-sheet/div[2]/div/div/button[1]")
	public WebElement clickProduction;
	
	@FindBy(xpath="/html/body/d-one-root/ion-app/ion-modal/div[2]/d-one-production-state-change/ion-fab/ion-button")
	public WebElement clickConfirmProduction;
}
