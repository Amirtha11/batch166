#Author-Amirtha-Vcentry
@login
Feature: Validate vcentry login feature of http://djangovinoth.pythonanywhere.com/login/
Scenario: validate vcentry login app with valid data
Given open browser as "firefox"
When enter url as "http://djangovinoth.pythonanywhere.com/login/"
When click login link
And enter username as "Amirtha"
And enter password as "vcentry1"
But dont click signup button
When click login button
Then verify user welcome page


#sendKeys("String")