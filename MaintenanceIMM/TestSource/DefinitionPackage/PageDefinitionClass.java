package DefinitionPackage;

import ActionPackage.*;
import UtilsPackage.HelperClass;
import io.cucumber.java.en.*;

public class PageDefinitionClass {
	
	LoginActionClass log=new LoginActionClass();
	ProfilePageActionClass pro=new ProfilePageActionClass();
	SchedulerGanttActionClass gantt=new SchedulerGanttActionClass();
	ProductionListActionClass list=new ProductionListActionClass();
	MaintenanceListActionClass main=new MaintenanceListActionClass();
	
	@Given("User is on the D one Factory Login page {string}")
	public void user_is_on_the_d_one_factory_login_page(String url) {
		HelperClass.openPage(url);
	}
	@Then("User enters username as {string}")
	public void user_enters_username_as(String name) {
		log.enterUserName(name);
	}
	@Then("User enters password as {string}")
	public void user_enters_password_as(String pass) {
		log.enterPassword(pass);
	}
	@Given("User clicks the Schedule Option")
	public void user_clicks_the_schedule_option() {
		pro.clickScheduleIcon();
	}
	@Then("User clicks the Scheduler Gantt")
	public void user_clicks_the_scheduler_gantt() {
		pro.clickSchedulerGantt();
	}
	@Given("User is on the Scheduler Gantt Page {string}")
	public void user_is_on_the_scheduler_gantt_page(String url) {
		HelperClass.openPage(url);
	}
	@Given("User zoom out the page")
	public void user_zoom_out_the_page() {
		HelperClass.zoomOut();
	}
	@When("User clicks the Activity Order")
	public void user_clicks_the_activity_order() {
		gantt.clickActivityOrder();
	}
	@When("User clicks the Add Icon")
	public void user_clicks_the_add_icon() {
		gantt.clickAddIcon();
	}
	@When("User clicks the Type button")
	public void user_clicks_the_type_button() {
		gantt.clickTypeButton();
	}
	@When("User enter the Descripstion as {string}")
	public void user_enter_the_descripstion_as(String desc) {
		gantt.clickDescription(desc);
	}
	@When("User enter the Material")
	public void user_enter_the_material() {
		gantt.clickMaterial();
	}
	@When("User enter the Machine")
	public void user_enter_the_machine() {
		gantt.clickMachine();
	}
	@When("User enter the duration time as {string}")
	public void user_enter_the_duration_time_as(String time) {
		gantt.clickTimeDuration(time);
	}
	@Then("User clicks the Confirm Add Option")
	public void user_clicks_the_confirm_add_option() {
		gantt.clickConfirmAdd();
	}
	@Then("User clicks the Checkbox")
	public void user_clicks_the_checkbox() {
		gantt.clickCheckBox();
	}
	@Then("User clicks the Schedule Icon")
	public void user_clicks_the_schedule_icon() {
		gantt.clickOrderSchedule();
	}
	@Then("User clicks the Schedule Confirm Option")
	public void user_clicks_the_schedule_confirm_button() {
		gantt.clickConfirmOption();
	}
	@When("User clicks the Mobile Icon")
	public void user_clicks_the_mobile_icon() {
		list.clickMobileIcon();
	}
	@Given("User is on the Mobile {string}")
	public void user_is_on_the_mobile(String url) {
		HelperClass.openPage(url);
	}
	@When("User clicks the Production Option")
	public void user_clicks_the_production_option() {
		list.clickProductionOption();
	}
	@When("User clicks the Machine List")
	public void user_clicks_the_machine_list() {
		list.clickMachineList();
	}
	@When("User clicks the Demo1 option")
	public void user_clicks_the_demo1_option() {
		list.clickDemo1Option();
	}
	@Then("User clicks the Demo1 production")
	public void user_clicks_the_demo1_production() {
		list.clickDemo1Production();
	}
	@Then("User clicks the Maintenance of Demo1")
	public void user_clicks_the_maintenance_of_demo1() {
		list.clickMaintenanceDemo1();
	}
	@Then("User Clicks the Equipment Id as {string}")
	public void user_clicks_the_equipment_id_as(String id) {
		list.clickEquipmentId(id);
	}
	@Then("User clicks the Issue type")
	public void user_clicks_the_issue_type() {
		list.clickIssueType();
	}
	@Then("User click the Breakdown as Yes")
	public void user_click_the_breakdown_as_yes() {
		list.clickBreakdownYes();
	}
	@Then("User clicks the Description as {string}")
	public void user_clicks_the_description_as(String desc) {
		list.clickDescription(desc);
	}
	@Then("User clicks the Maintenance Confirm button")
	public void user_clicks_the_maintenance_confirm_button() {
		list.clickMaintenanceConfirm();
	}
	@Then("User clicks the confirm production")
	public void user_clicks_the_confirm_Production() {
		list.clickConfirmProduction();
	}
	@When("User clicks the Maintenance option")
	public void user_clicks_the_maintenance_option() {
		main.maintenanceOption();
	}
	@When("User clicks the Demo1 Option in Maintenance")
	public void user_clicks_the_demo1_option_in_maintenance() {
		main.demo1Maintenance();
	}
	@When("User clicks the Action button")
	public void user_clicks_the_action_button() {
		main.actionMaintenance();
	}
	@Given("User is on the Maintenance page {string}")
	public void user_is_on_the_maintenance_page(String url) {
		HelperClass.openPage(url);	
	}
	@When("User clicks the ongoing request Option")
	public void user_clicks_the_ongoing_request_option() {
		main.ongoingRequest();
	}
	@When("User clicks the Demo1 Option in ongoing request")
	public void user_clicks_the_demo1_option_in_ongoing_request() {
		main.demo1Ongoing();
	}
	@When("User clicks the Action button in ongoing request")
	public void user_clicks_the_action_button_in_ongoing_request() {
		main.actionOngoing();
	}
	@When("User clicks the Reason Option")
	public void user_clicks_the_reason_option() {
		main.reasonOption();
	}
	@Then("User clicks the confitm button in Maintenance")
	public void user_clicks_the_confitm_button_in_maintenance() {
		main.confirmMaintenance();
	}
}
