Feature: Validate product page user based

@product
  Scenario: Validate whether user can purchase product in limited count
    Given open Browser as "chrome"
    When Enter url as "http://djangovinoth.pythonanywhere.com/login/"
    When Enter user name as "Amirtha"
    And Enter password as "vcentry1"
    When Click login button
    Then verify login sucess
    When click framework form
    And Click Simple form
    Then validate whether user can place order upto 5 times
      | product a | 1111 | maila@mail.com | Electrical |  5 | purchaser a |
      | product b | 2222 | mailb@mail.com | Electrical | 15 | purchaser b |
      | product c | 3333 | mailc@mail.com | Electrical | 25 | purchaser c |
      | product d | 4444 | maild@mail.com | Electrical | 35 | purchaser d |
      | product e | 5555 | maile@mail.com | Electrical | 45 | purchaser e |
      | product f | 6666 | mailf@mail.com | Electrical | 55 | purchaser f |
    Then logout the user
