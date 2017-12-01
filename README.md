# Selenide-Cucumber-Gradle

## Tools used:
[Selenide](https://github.com/codeborne/selenide)\
[Cucumber](https://github.com/cucumber/cucumber)\
[Gradle](https://github.com/gradle/gradle)\
[JUnit](https://github.com/junit-team/junit5)\

## How to write test:
* Selenide instatiates pages automatically, all you need is to add:\
`import static com.codeborne.selenide.Selenide.*;`\
`import static com.codeborne.selenide.Condition.*;`
* 

## How to run test:
Check [Userguide](https://docs.gradle.org/current/userguide/userguide.html) first<br/>
build without suites using gradle installation: `gradle build -x test`<br/>
build without suites using built-in gradle wrapper: `./gradlew build -x test`<br/>

NOTE: from IDE execution available in standard way as well as debug mode<br/>

* Run Cucumber Feature (steps implemented):<br/>
    - create java class 
    - add annotation: @RunWith(Cucumber.class)
    - add annotation: @CucumberOptions()
    - specify options: features = "path-to-feature" (or folder with features)
    - add any additional options if required
* Run single Test Method:<br/>
* Run Test Class: `gradle -Dtest.single=ClassUnderTestTest test`<br/>
* Run JUnit Test Suite:<br/>
    - create java class 
    - add annotation: @RunWith(Suite.class)
    - add annotation: @SuiteClasses(class1.class2…..) or @Suite.SuiteClasses ({test1.class, test2.class……})

* Run Gradle Task from from command line:<br/>
    - create new gradle task:
    - execute:
* Run Test on Jenkins:<br/>
    - create new job (same parameters as gradle task)
    - execute:

## Configurations:
* Browsers:
    - Chrome: 62.0.3202.94
    - Firefox: 57.0 (64-bit)
* Selenium:
    - 3.17.1
* Drivers:
    - ChromeDriver: 2.33.506120 
    - geckodriver 0.19.1






