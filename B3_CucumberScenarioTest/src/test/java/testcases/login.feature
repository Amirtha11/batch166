#Author-Amirtha-Vcentry
@login
Feature: Validate vcentry login feature of http://djangovinoth.pythonanywhere.com/login/
Scenario: validate vcentry login app with valid data
Given open browser
When enter url
When click login link
And enter username
And enter password
But don't click signup button
When click login button
Then verify user welcome page