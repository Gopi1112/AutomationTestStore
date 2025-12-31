# \# AutomationTestStore – Test Automation Framework

# 

# \## Project Overview

# 

# \*\*AutomationTestStore\*\* is a \*\*hands-on Hybrid Test Automation Framework designed to simulate real-world automation scenarios\*\* developed to automate a web application that includes \*\*user login functionality, validations, and navigation flows\*\*. The framework is built using \*\*Selenium WebDriver with Java\*\* and follows industry-standard automation practices suitable for SDET roles.

# 

# This project was created for \*\*hands-on learning and real-time automation experience\*\*, covering UI automation with cross-browser and headless execution.

# 

# \## Application Under Test

# 

# \* \*\*Application Type:\*\* Web Application (Practice)

# \* \*\*Login Feature:\*\* Yes

# 

# \## Tech Stack

# 

# \* \*\*Programming Language:\*\* Java (JDK 17)

# \* \*\*Automation Tool:\*\* Selenium WebDriver

# \* \*\*Test Framework:\*\* TestNG

# \* \*\*Build Tool:\*\* Maven

# \* \*\*Framework Design:\*\* Hybrid Framework (POM + Data-Driven + Utilities)

# \* \*\*Version Control:\*\* Git

# \* \*\*CI/CD:\*\* Jenkins

# 

# \## Key Highlights

# \* \*\* Designed a scalable hybrid automation framework from scratch

# \* \*\* Automated end-to-end user journeys including login, search, cart and checkout

# \* \*\* Integrated automation suite with Jenkins for CI execution

# \* \*\* Implemented data-driven testing using Excel utilities

#

# \## Prerequisites

# \* \*\* Java JDK 17 installed

# \* \*\* Maven installed and configured

# \* \*\* Chrome / Firefox / Edge browser

# \* \*\* IDE (IntelliJ / Eclipse)

#

# \## Framework Features

# 

# \* Page Object Model (POM) for better maintenance

# \* Data-driven testing using Excel

# \* Cross-browser execution (Chrome, Firefox, Edge)

# \* Headless browser execution support

# \* Centralized WebDriver management using DriverFactory

# \* Reusable utilities for waits, configuration, and test data

# \* Test execution via TestNG, Maven, and Jenkins

# \* HTML test report generation

# 

# \## Project Structure

# 

# ```

# AutomationTestStore

# │── src/test/java

# │   ├── pageBase

# │   │   └── DriverFactory.java

# │   ├── pages

# │   │   ├── BasePage.java

# │   │   ├── HomePage.java

# │   │   ├── LoginPage.java

# │   │   ├── AccountPage.java

# │   │   ├── SearchPage.java

# │   │   ├── ItemPage.java

# │   │   ├── CartPage.java

# │   │   ├── CheckoutPage.java

# │   │   └── SpecialsPage.java

# │   ├── testCases

# │   │   ├── BaseTest.java

# │   │   ├── LoginTests.java

# │   │   ├── SearchTests.java

# │   │   ├── CartTests.java

# │   │   └── CheckoutTests.java

# │   └── utilities

# │       ├── WaitUtils.java

# │       ├── ConfigReader.java

# │       └── ExcelReader.java

# │── src/test/resources

# │── testData

# │   └── testdataprovider.xlsx

# │── reports

# │   └── Test Report.html

# │── pom.xml

# │── testng.xml

# │── README.md

# ```

# 

# \## Test Coverage

# 

# \* User login functionality

# \* UI validations

# \* Navigation across pages

# \* Search and item selection

# \* Cart and checkout flows

# 

# \## Execution Details

# 

# \### Browsers Supported

# 

# \* Chrome

# \* Firefox

# \* Edge

# \* Headless mode

# 

# \### Run Using TestNG

# 

# \* Open `testng.xml`

# \* Right-click → Run as TestNG Suite

# 

# \### Run Using Maven

# 

# ```

# mvn clean test

# ```

# 

# \### Run Using Jenkins

# 

# \* Configure Jenkins job with Git repository

# \* Set Maven goal as `clean test`

# \* Trigger build manually or automatically

# 

# \## Reporting

# 

# \* HTML execution reports generated after test run

# \* Reports include pass/fail status and execution details

# 

# \## Utilities Used

# 

# \* \*\*WaitUtils\*\* – Explicit and fluent waits

# \* \*\*ConfigReader\*\* – Environment and browser configuration

# \* \*\*ExcelReader\*\* – Data-driven testing support

# 

# \## Best Practices Followed

# 

# \* Page Object Model (POM)

# \* Reusable and modular code

# \* No hard-coded values

# \* Clear package structure

# \* Scalable framework design

# 

# \## Purpose of the Project

# 

# This project was developed as a \*\*practice automation framework\*\* to strengthen skills in:

# 

# \* Selenium automation

# \* Framework design

# \* CI/CD execution

# \* Real-time SDET responsibilities

# 

# \## Author

# 

# \*\*S. Umasankar\*\*

# Automation / SDET Engineer

# 

# ---

# 

# This project is intended for learning, interview demonstration, and hands-on automation practice.



