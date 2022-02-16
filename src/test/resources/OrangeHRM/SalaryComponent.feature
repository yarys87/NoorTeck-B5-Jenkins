Feature: Salary Components Pages

  Scenario Outline: Verify Salary Components Page Header
    Given User is logged into NTK application <region>
    When User navigates to Salary Components Page | click "menu.salaryComp"
    Then System displays page header | verify "salaryComp.header" <header>

    Examples: 
      | region  | header              |
      | "scrum" | "Salary Components" |

  Scenario Outline: Verify User able to add new Salary Component
    Given User is logged into NTK application <region>
    When User navigates to Salary Components Page | click "menu.salaryComp"
    And User clicks Add icon | click "common.addIcon"
    And User enters Component Name | enterValue "salaryComp.name" <name>
    And User selects Add to options  | selectOption
      | earning   | deduction   |
      | <earning> | <deduction> |
    And User selects Add to options  | selectOption
      | totalPayable   | CostToCompany   |
      | <totalPayable> | <costToCompany> |
    And User selects Value Type | selectOption
      | valueType | percentage   |
      | <amount>  | <percentage> |
    And User clicks save button | click "common.saveButton"
    Then System displays message "Successfully Saved"

    Examples: 
      | region  | name        | earning              | deduction              | totalPayable       | costToCompany     | amount              | percentage              |
      | "scrum" | "Sr.SDET 1" | "salaryComp.earning" |                        | "salaryComp.total" |                   | "salaryComp.amount" |                         |
      | "scrum" | "Sr.Dev 2"  |                      | "salaryComp.deduction" |                    | "salaryComp.cost" |                     | "salaryComp.percentage" |
      | "scrum" | "Sr.BA 3"   | "salaryComp.earning" | "salaryComp.deduction" | "salaryComp.total" | "salaryComp.cost" | "salaryComp.amount" | "salaryComp.percentage" |

  Scenario Outline: Verify User able to edit existing Salary Component
    Given User is logged into NTK application <region>
    When User navigates to Salary Components Page | click "menu.salaryComp"
    And User clicks edit icon | click "common.editIcon"
    And User enters Component Name | enterValue "salaryComp.name" <name>
    And User selects Add to options  | selectOption
      | earning   | deduction   |
      | <earning> | <deduction> |
    And User selects Add to options  | selectOption
      | totalPayable   | CostToCompany   |
      | <totalPayable> | <costToCompany> |
    And User selects Value Type | selectOption
      | valueType | percentage   |
      | <amount>  | <percentage> |
    And User clicks save button | click "common.saveButton"
    Then System displays message "Successfully Updated"

    Examples: 
      | region  | name           | earning | deduction              | totalPayable | costToCompany     | amount              | percentage |
      | "scrum" | "Sr. SDET 007" |         | "salaryComp.deduction" |              | "salaryComp.cost" | "salaryComp.amount" |            |
