@tag
Feature: Maintenance
	Background: 
		Given User is on the D one Factory Login page "http://40.68.124.94/imm/dsqa/d-onefactoryWeb/factory/factory-dashboard"
		And User zoom out the page
  	Then User enters username as "donefactory" 
  	And User enters password as "Factory@admin"
  
  @ProductionMaintenance
  Scenario: Profile Page
    #Given User clicks the Schedule Option
    #Then User clicks the Scheduler Gantt
  #@SchedulerGantt
  #Scenario: Schedule Order to Maintenance
  #	Given User is on the Scheduler Gantt Page "http://40.68.124.94/imm/dsqa/d-onefactoryWeb/factory/scheduler?parent=Schedule"
  #	When User clicks the Activity Order
  #	And User clicks the Add Icon
  #	And User clicks the Type button
  #	And User enter the Descripstion as "Maintenance"
  #	And User enter the Material
  #	And User enter the Machine
  #	And User enter the duration time as "60"
#		Then User clicks the Confirm Add Option
#		Then User clicks the Checkbox
#		And User clicks the Schedule Icon
#		And User clicks the Schedule Confirm Option
		Given User is on the Mobile "http://40.68.124.94/imm/dsqa/d-onefactoryMobileweb/tabs/menu"
		When User clicks the Production Option
		And User clicks the Machine List
		And User clicks the Demo1 option
		Then User clicks the Demo1 production
		And User clicks the Maintenance of Demo1
		And User Clicks the Equipment Id as "001"
		And User clicks the Issue type
		And User click the Breakdown as Yes
		And User clicks the Description as "Fault"
		And User clicks the Maintenance Confirm button
		Given User is on the Mobile "http://40.68.124.94/imm/dsqa/d-onefactoryMobileweb/tabs/menu"
		When User clicks the Maintenance option
		And User clicks the Demo1 Option in Maintenance
		And User clicks the Action button
		Given User is on the Maintenance page "http://40.68.124.94/imm/dsqa/d-onefactoryMobileweb/tabs/menu"
		When User clicks the Maintenance option
		When User clicks the ongoing request Option
		And User clicks the Demo1 Option in ongoing request
		And User clicks the Action button in ongoing request
		And User clicks the Reason Option
		Then User clicks the confitm button in Maintenance
		Given User is on the Mobile "http://40.68.124.94/imm/dsqa/d-onefactoryMobileweb/tabs/menu"
		When User clicks the Production Option
		And User clicks the Machine List
		And User clicks the Demo1 option
		Then User clicks the Demo1 production
		And User clicks the confirm production