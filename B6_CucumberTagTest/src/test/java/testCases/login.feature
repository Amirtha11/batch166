#Authour - Amirtha - Vcentry - 
@login
Feature: Validate vcentry login feature of http://djangovinoth.pythonanywhere.com/login/

@validLogin @smokeTest
Scenario: Validate vcentry login app with valid data
Given open browser as "firefox"
When enter url as "http://djangovinoth.pythonanywhere.com/login/"
When click login link
And enter username as "Amirtha"
And enter password as "vcentry1"
But dont click signup button
When click login button
Then verify user welcome page

@inValidLogin
Scenario: Validate vcentry login app with invalid data
Given open browser as "firefox"
When enter url as "http://djangovinoth.pythonanywhere.com/login/"
When click login link
And enter user name as "user"
And enter password as "pass@12345"
But dont click signup button
When click login button
Then verify user welcome page

@adminLogin @smokeTest
Scenario: Validate vcentry login app with admin valid data
Given open browser as "firefox"
When enter url as "http://djangovinoth.pythonanywhere.com/login/"
When click login link
And enter user name as "admin"
And enter password as "admin@12345"
But dont click signup button
When click login button
Then verify user welcome page

@buyerLogin
Scenario: Validate vcentry login app with buyer valid data
Given open browser as "firefox"
When enter url as "http://djangovinoth.pythonanywhere.com/login/"
When click login link
And enter user name as "buyer"
And enter password as "buyer@12345"
But dont click signup button
When click login button
Then verify user welcome page
#additional


@sellerLogin
Scenario: Validate vcentry login app with seller valid data
Given open browser as "firefox"
When enter url as "http://djangovinoth.pythonanywhere.com/login/"
When click login link
And enter user name as "seller"
And enter password as "seller@12345"
But dont click signup button
When click login button
Then verify user welcome page
#additional
 