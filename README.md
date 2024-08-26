# Sprint 2 Automated Test

![GitHub Contributors](https://img.shields.io/github/contributors/sarkadins/sprint_2_automated_test)
![GitHub Forks](https://img.shields.io/github/forks/sarkadins/sprint_2_automated_test?style=social)
![GitHub Stars](https://img.shields.io/github/stars/sarkadins/sprint_2_automated_test?style=social)
![GitHub Issues](https://img.shields.io/github/issues/sarkadins/sprint_2_automated_test)

**priusz:**

[![LinkedIn][linkedin-shield]][linkedin-url-one]

**sarkadins:**

[![LinkedIn][linkedin-shield]][linkedin-url-two]


This repository contains automated tests for various scenarios on the JIRA website. The tests are developed using Selenium WebDriver and are structured to ensure comprehensive coverage of key functionalities within the JIRA application.

## Table of Contents

- [Project Overview](#project-overview)
- [Technology Stack](#technology-stack)
- [Setup Instructions](#setup-instructions)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
    - [Running the Tests](#running-the-tests)
- [Test Cases Implemented](#test-cases-implemented)
- [Built With](#built-with)

## Project Overview

Sprint 2 Automated Test is a test suite designed to automate the testing of various user scenarios on the JIRA website. The tests utilize Selenium WebDriver to simulate user interactions, ensuring that the application behaves as expected under different conditions.

## Technology Stack

- **Selenium WebDriver**: The core automation tool used for browser-based testing.
- **Java**: The programming language used to write the test scripts.
- **JUnit/TestNG**: The testing frameworks used for structuring and executing the tests.
- **Maven**: Build automation tool for managing dependencies and running tests.

## Setup Instructions

### Prerequisites

Before setting up the project, ensure you have the following tools installed:

- **Java Development Kit (JDK) 11 or higher**
- **Maven**
- **Git**
- **A compatible web browser (e.g., Chrome, Firefox)**

### Installation

1. **Clone the repository**

   ```bash
   git clone https://github.com/sarkadins/sprint_2_automated_test.git
   cd sprint_2_automated_test
   ```

2. **Install dependencies**

    ```bash
    mvn clean install
    ```

### Running the Tests

1. **Execute tests**

    ```bash
    mvn test
    ```

2. **View test reports**

After running the tests, the report can be found in the target/surefire-reports/ directory.

### Test Cases Implemented
The following test cases have been automated and implemented for the JIRA website:

**Login Test**

Verifies that a user can log in with valid credentials.
Ensures that login attempts with invalid credentials fail as expected.

**Create Issue Test**

Validates that a user can successfully create a new issue.
Checks that required fields are validated properly.

**Search Issue Test**

Tests the search functionality by searching for issues using different criteria.
Ensures that search results are accurate and relevant.

**Update Issue Test**

Verifies that a user can update an existing issue.
Checks that changes are saved and reflected in the issue's details.

**Delete Issue Test**

Tests the ability to delete an issue.
Ensures that the issue is removed from the project and cannot be accessed afterward.

**Logout Test**

Verifies that a user can log out successfully.
Checks that the user session is terminated and requires re-authentication for further actions.

### Built with

[![Selenium][selenium-shield]][selenium-url]

[selenium-shield]: https://img.shields.io/badge/Selenium-WebDriver-43B02A?logo=selenium&logoColor=white

[selenium-url]: https://www.selenium.dev/

[linkedin-shield]: https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white

[linkedin-url-one]: https://www.linkedin.com/in/timeaboros-priusz/

[linkedin-url-two]: https://www.linkedin.com/in/soma-sarkadi-nagy/

