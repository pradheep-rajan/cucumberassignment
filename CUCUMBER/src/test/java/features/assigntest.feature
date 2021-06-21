Feature: To signup mail and then login After successful login send mail.

  Scenario Outline: signup mail and then login and send mail
    Given The application http://elearningm1.upskills.in/ Url given
    When Start to register with the signup button
    And Give the user details Firstname"<FirstName>"
    And add Lastname"<LastName>"
    And Enter then e-mail address "<e-mail>"
    And Give the user details Username"<username>"
    And Enter the Pass"<password>"
    Then confirm password "<ConfirmPassword>"
    And Enter the Register button
    Then click dropmenu top right side
    And click the Inbox
    Then click on the compose icon
    And enter the sendto mailId "<Email ID>"
    And Enter the subject "<subject>" and Message "<message>"
    Then Click on the send message
    And verify the message sent confirmation

    Examples: 
      | FirstName | LastName | e-mail            | username | password  | ConfirmPassword | Email ID        | subject       | message                  |
      | Pradheep  | Rajan    | dheepan@gmail.com | Dheepan  | qwer@1234 | qwer@1234       | rajpr@gmail.com | Happy bithday | Wish you a happybirthday |
