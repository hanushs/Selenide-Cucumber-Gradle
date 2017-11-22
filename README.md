# Selenide-Cucumber-Gradle

## Tools used:
[Selenide](https://github.com/codeborne/selenide)<br/>
[Cucumber](https://github.com/cucumber/cucumber)<br/>
[Gradle](https://github.com/gradle/gradle)<br/>
[JUnit](https://github.com/junit-team/junit5)<br/>

## How to run test:
Check [Userguide](https://docs.gradle.org/current/userguide/userguide.html) first<br/>
build without tests using gradle installation: `gradle build -x test`<br/>
build without tests using built-in gradle wrapper: `./gradlew build -x test`<br/>

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
GRADLE:<br/>
https://docs.gradle.org/4.3.1/userguide/tutorial_using_tasks.html<br/>
build.gradle -- script in multi-project builds<br/>
settings.gradle -- script will be executed in each build<br/>
gradle.properties -- simple Java Properties<br/>




