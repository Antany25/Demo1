package LocatorPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePageLocatorClass {
	
	@FindBy(xpath="//*[@id=\"Livello_1\"]")
	public WebElement schedule;
	
	@FindBy(xpath="/html/body/app-root/done-ui-portal/mat-drawer-container/mat-drawer-content/div/done-externaldrawer/div/a[1]")
	public WebElement schedulerGantt;
}
