#Authour - Amirrtha - Vcentry -
@login
Feature: Validate vcentry login feature of http://djangovinoth.pythonanywhere.com/login/
Background:
		Given establish DB connection
		When enter DB user name
		When enter DB password
		And Click DB login

  Scenario: Validate vcentry login app with valid data
    Given open browser as "firefox"
    When enter url as "http://djangovinoth.pythonanywhere.com/login/"
    When click login link
    And enter user name as "Amirtha"
    And enter password as "vcentry1"
    But dont click signup button
    When click login button
    Then verify user welcome page

  Scenario Outline: Validate vcentry login app with valid data
    Given open browser as "<BROWSER>"
    When enter url as "<URL>"
    When click login link
    And enter user name as "<USERNAME>"
    And enter password as "<PASSWORD>"
    But dont click signup button
    When click login button
    Then verify user welcome page

    Examples: 
      | BROWSER | URL                                           | USERNAME | PASSWORD   |
      | firefox | http://djangovinoth.pythonanywhere.com/login/ | Amirtha   | vcentry1 |
      | firefox | http://djangovinoth.pythonanywhere.com/login/ | Amirtha    | pass123    |
      | firefox | http://djangovinoth.pythonanywhere.com/login/ | admin    | pass222    |
      | firefox | http://djangovinoth.pythonanywhere.com/login/ | buyer    | pass333    |
      | firefox | http://djangovinoth.pythonanywhere.com/login/ | seller   | pass444    |
