Feature: ApplyForJob
  Scenario: Apply
    Given Initialize the browser
    And Navigate to "https://www.crossover.com"
    And Click See Available Jobs Button
    And Choose Category "Engineering" from The Category Dropdown
    And Search for "QA Automation" in the search box
    And Click on Search Jobs Button
    And Choose "QA Automation Engineer"
    Then Click On Apply Now Button
    And Enter First Name "Omar" and Last Name "Hossam" and Email "omarhossam150499@gmail.com" and LinkedIn "https://linkedin.com/in/devomarhossam/" and Phone Number "+201110064720"
    And Choose Country "Egypt" and "Less than 2 years" and "More than 5 years" and "2 Test Automation tools experience" and "Advanced" and "Less than 3 years" and "Yes, send me an invite to hear more at your next event"
    And Click Continue