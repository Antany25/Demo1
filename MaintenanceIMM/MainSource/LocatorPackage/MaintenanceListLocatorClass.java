package LocatorPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MaintenanceListLocatorClass {

	@FindBy(xpath="/html/body/d-one-root/ion-app/ion-router-outlet/d-one-tabs/ion-tabs/div/ion-router-outlet/d-one-menu/ion-content/ion-card[2]/d-one-card-menu/ion-item")
	public WebElement maintenanceIcon;
	
	@FindBy(xpath="/html/body/d-one-root/ion-app/ion-router-outlet/d-one-tabs/ion-tabs/div/ion-router-outlet/d-one-maintenance-request-menu/ion-content/swiper/div/div[1]/ion-list/ion-item/ion-grid/ion-row")
	public WebElement demo1Option;
	
	@FindBy(xpath="/html/body/d-one-root/ion-app/ion-router-outlet/d-one-tabs/ion-tabs/div/ion-router-outlet/d-one-maintenance-request/ion-fab/ion-button")
	public WebElement actionNewRequest;
	
	@FindBy(xpath="/html/body/d-one-root/ion-app/ion-action-sheet/div[2]/div/div/button[4]")
	public WebElement startMaintenance;
	
	@FindBy(xpath="/html/body/d-one-root/ion-app/ion-router-outlet/d-one-tabs/ion-tabs/div/ion-router-outlet/d-one-maintenance-request-menu/ion-content/ion-grid/ion-row/ion-segment/ion-segment-button[2]")
	public WebElement clickOngoingRequest;
	
	@FindBy(xpath="/html/body/d-one-root/ion-app/ion-router-outlet/d-one-tabs/ion-tabs/div/ion-router-outlet/d-one-maintenance-request-menu/ion-content/swiper/div/div[2]/ion-list/ion-item/ion-grid/ion-row")
	public WebElement clickDemo1Ongoing;
	
	@FindBy(xpath="/html/body/d-one-root/ion-app/ion-router-outlet/d-one-tabs/ion-tabs/div/ion-router-outlet/d-one-maintenance-request/ion-fab/ion-button")
	public WebElement actionOngoingRequest;
	
	@FindBy(xpath="/html/body/d-one-root/ion-app/ion-action-sheet/div[2]/div/div/button[3]")
	public WebElement endMaintenance;
	
	@FindBy(xpath="/html/body/d-one-root/ion-app/ion-modal/div[2]/d-one-maintenance-end-request/ion-content/ion-list/ion-item[1]")
	public WebElement clickReason;
	
	@FindBy(xpath="/html/body/d-one-root/ion-app/ion-action-sheet/div[2]/div/div[1]/button[2]")
	public WebElement clickAnyReason;
	
	@FindBy(xpath="/html/body/d-one-root/ion-app/ion-modal/div[2]/d-one-maintenance-end-request/div/ion-button")
	public WebElement clickConfirmEnd;
}
