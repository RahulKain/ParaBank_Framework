# ParaBank Automation Framework 🏦

A robust, maintainable, and scalable **Selenium + Cucumber + TestNG** automation framework built to test the [ParaBank demo application](http://parabank.parasoft.com).  
This project demonstrates best practices in automation design, including Page Object Model (POM), reusable utilities, hooks, and reporting integration.

---

## 🚀 Features
- **Java + Selenium WebDriver** for browser automation
- **Cucumber (BDD)** for feature files and step definitions
- **TestNG** for test execution and reporting
- **Page Object Model (POM)** for clean separation of test logic and UI elements
- **Hooks** for setup/teardown and screenshot capture on failure
- **Config-driven execution** (URL, browser, environment)
- **Cross-browser support** (Chrome, Firefox, Edge)
- **Scalable architecture** for adding new modules and test cases

---

## 📂 Project Structure

ParaBank_Framework/ 
    
    │ 
    ├── hooks/               # Cucumber Hooks (setup & teardown) 
    ├── pages/               # Page Object classes 
    ├── steps/               # Step Definitions 
    ├── features/            # Cucumber Feature files 
    ├── utils/               # ConfigReader, DriverFactory, helpers 
    ├── reports/             # Test execution reports 
    └── pom.xml              # Maven dependencies & build



---

## ⚙️ Prerequisites
- Java 11 or higher
- Maven 3.x
- ChromeDriver / GeckoDriver (ensure drivers are in PATH)
- IDE: IntelliJ IDEA / Eclipse

---

## ▶️ How to Run Tests
1. **Clone the repository**
   ```bash
   git clone https://github.com/RahulKain/ParaBank_Framework.git
   cd ParaBank_Framework

