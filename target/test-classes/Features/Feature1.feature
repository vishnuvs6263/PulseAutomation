Feature: Login into the application
Scenario: Verify the dashboardpage
Given Application is launched
|https://www.idaksbassist.com/|
When User login into the application using username and password
|test01@gmail.com|test123|Dac Test Hospital|

When Naviagte to create patient page and add patient
When Create a new patient