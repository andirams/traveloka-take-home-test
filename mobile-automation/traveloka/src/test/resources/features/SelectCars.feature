Feature: Select Cars
    As a user
    I want to select cars rental

    Scenario: I want to search cars
        Given I am on the cars screen
        When I click tab without driver button
        And I select location
        And I select pick up date and time
        And I select drop off date and time
        And I click search car button
        Then I will redirected to various car screen 

    Scenario: I want to select cars
        Given I am on the various cars screen
        When I select car product
        And I select car provider
        And I click continue button in product detail
        And I click pick up location button
        And I select pick up location
        And I click select pick up RO button
        And I click drop off location button
        And I select drop off location
        And I click select drop off OL button
        And I click book now
        And I input contact name
        And I input driver name
        And I click continue
        And I click check all
        And I click continue
        And I select payment
        Then I will see successfull payment