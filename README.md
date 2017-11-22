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

* Run a single Test Method:<br/>
        - need to have init and teardown implementation (which browser to open, where to navigate, close browser after test)
* Run a Test Class: `gradle -Dtest.single=ClassUnderTestTest test`<br/>
* Run a TestNG Test Suite:<br/>
* Run a single Feature:<br/>
* Run Gradle Task from from command line:<br/>
* Run Test on Jenkins:<br/>

## Configurations:
GRADLE:<br/>
https://docs.gradle.org/4.3.1/userguide/tutorial_using_tasks.html<br/>
build.gradle -- script in multi-project builds<br/>
settings.gradle -- script will be executed in each build<br/>
gradle.properties -- simple Java Properties<br/>




