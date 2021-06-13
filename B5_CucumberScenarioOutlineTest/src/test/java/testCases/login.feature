#Author-Amirtha-Vcentry
@login
Feature: Validate vcentry login feature of http://djangovinoth.pythonanywhere.com/login/

Scenario Outline: Validate vcentry login app with valid data
Given open browser as "<BROWSER>"
When enter url as "<URL>"
When click login link
And enter username as "<USERNAME>"
And enter password as "<PASSWORD>"
But dont click signup button
When click login button
Then verify user welcome page

Examples:

|Browser|URL|USERNAME|PASSWORD|
|firefox|http://djangovinoth.pythonanywhere.com/login/|Amirtha|vcentry1|
|firefox|http://djangovinoth.pythonanywhere.com/login/|Amirtha|vcentry1|
|firefox|http://djangovinoth.pythonanywhere.com/login/|buyer|vcentry1|
|firefox|http://djangovinoth.pythonanywhere.com/login/|seller|vcentry1|