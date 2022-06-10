#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Insurance rates per customer

  Scenario Outline: 
    Given Customer <Customer> signs up
    When If customer age <Age> is greater than 18, apply discount <Discount>
    And If customer has no crashes <no_crashes>, apply discount <Discount>
    And If customers credit score <credit_score> is greater than 600, apply discount <Discount>
    And If customers income <income> is greater than 40000, apply discount <Discount>
    And If customer is military <military>, apply discount <Discount>
    And If customer is a student <student>, apply discount <Discount>
    And If customers vehicle is parked in a garage <parked_garage>, apply discount <Discount>
    And If customers account tenure <account_tenure> is greater than 1 year, apply discount <Discount>
    And If customers safety feature count <safety_features> is greater than 1, apply discount <Discount>
    And If customer signed up for payment autodraft <autodraft>, apply discount <Discount>
    And If customer bundles additional policies <bundle>, apply discount <Discount>
    And If customers yearly mileage <yearly_mileage> is less than 10000 miles per year, apply discount <Discount>
    And If customer does not have a lien <lien> on the vehicle, apply discount <Discount>
    And If customers total vehicle mileage <vehicle_mileage> is less than 20000 miles, apply discount <Discount>
    And If customers vehicle is electric <electric>, apply discount <Discount>
    Then Display total discount

    Examples: 
      | Customer | Age | no_crashes | credit_score | income | military | student | parked_garage | account_tenure | safety_features | autodraft | bundle  | yearly_mileage | lien    | vehicle_mileage | electric | Discount |
      | "John"   |  16 | "True"     |          517 |  38000 | "False"  | "True"  | "True"        |              0 |               2 | "False"   | "False" |          11000 | "True"  |           21000 | "False"  |        2 |
      | "Jake"   |  21 | "False"    |          630 |  42000 | "True"   | "False" | "False"       |              0 |               4 | "True"    | "False" |          13000 | "False" |           14000 | "False"  |        2 |
      | "Derek"  |  34 | "False"    |          710 |  54000 | "False"  | "False" | "False"       |             11 |               3 | "True"    | "False" |           9000 | "False" |           62000 | "False"  |        2 |
      | "Jack"   |  25 | "False"    |          650 |  50000 | "False"  | "True"  | "True"        |              3 |               2 | "False"   | "True"  |          11000 | "True"  |           21000 | "False"  |        2 |
      | "Bill"   |  38 | "True"     |          400 |  45000 | "True"   | "False" | "False"       |              5 |               4 | "True"    | "False" |          13000 | "False" |           2000  | "True"   |        2 |
      | "Ahmed"  |  22 | "False"    |          700 |  60000 | "False"  | "False" | "False"       |             18 |               3 | "True"    | "True"  |           8000 | "False" |           62000 | "False"  |        2 |
      | "Manjula"|  55 | "True"     |          720 |  70000 | "False"  | "True"  | "True"        |              9 |               2 | "False"   | "True"  |          11000 | "True"  |           4000  | "False"  |        2 |
      | "Krishna"|  45 | "False"    |          750 |  80000 | "True"   | "False" | "False"       |              1 |               4 | "True"    | "False" |          13000 | "False" |           5000  | "True"   |        2 |
      | "Lisa"   |  28 | "False"    |          800 |  54000 | "False"  | "False" | "False"       |             5  |               3 | "True"    | "True"  |          15000 | "False" |           8000  | "False"  |        2 |
      | "Dakota" |  22 | "False"    |          850 |  40000 | "False"  | "True"  | "True"        |              0 |               2 | "False"   | "False" |          11000 | "True"  |           21000 | "True"   |        2 |
      | "Crystal"|  24 | "False"    |          735 |  50000 | "True"   | "False" | "False"       |              0 |               4 | "True"    | "True"  |          14000 | "False" |           14000 | "False"  |        2 |
      | "Rolando"|  34 | "False"    |          710 |  54000 | "False"  | "False" | "False"       |             20 |               3 | "True"    | "True"  |           9000 | "False" |           2500  | "False"  |        2 |
     
