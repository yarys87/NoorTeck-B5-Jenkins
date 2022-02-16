Feature: Job Titles Page

  Scenario Outline: Verify Job Titles Page Header
    Given User is logged into NTK application <region>
    When User navigates to Job Titles Page | click "menu.jobTitles"
    Then System displays page header | verify "jobTitles.header" <header>

    Examples: 
      | region  | header       |
      | "scrum" | "Job Titles" |

  Scenario Outline: Verify User able to add new Job Titles
    Given User is logged into NTK application <region>
    When User navigates to Job Titles Page | click "menu.jobTitles"
    And User clicks Add icon | click "common.addIcon"
    And User enters Job Title | enterValue "jobTitles.title" <title>
    And User enters Job Description | enterValue "jobTitles.description" <description>
    And User enters Note | enterValue "jobTitles.note" <note>
    And User clicks save button | click "common.saveButton"
    Then System displays message "Successfully Saved"

 
    Examples: 
      | region  | title              | description            | note        |
      | "scrum" | "test job titles2" | "test job description" | "test note" |

  Scenario Outline: Verify User able to edit existing Job Titles
    Given User is logged into NTK application <region>
    When User navigates to Job Titles Page | click "menu.jobTitles"
    And User clicks edit icon | click "common.editIcon"
    And User enters Job Title | enterValue "jobTitles.title" <title>
    And User enters Job Description | enterValue "jobTitles.description" <description>
    And User enters Note | enterValue "jobTitles.note" <note>
    And User clicks save button | click "common.saveButton"
    Then System displays message "Successfully Updated"

  
    Examples: 
      | region  | title               | description              | note          |
      | "scrum" | "update job titles" | "update job description" | "update note" |
