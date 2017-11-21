# Selenide-Cucumber-Gradle

## TOOLS USED:
Selenide: https://github.com/codeborne/selenide
Cucumber: https://github.com/cucumber/cucumber
Gradle: https://github.com/gradle/gradle
JUnit: http://junit.org/junit5/docs/current/user-guide/
Jenkins: https://github.com/kohsuke/jenkins

## HOW TO RUN TEST:
https://docs.gradle.org/current/userguide/build_lifecycle.html
build without tests using gradle installation: ```sh gradle build -x test```
build without tests using built-in gradle wrapper: ```sh ./gradlew build -x test```


* Run a single Test Method:
        - need to have init and teardown implementation (which browser to open, where to navigate, close browser after test)

* Run a Test Class: <br/>
	`gradle -Dtest.single=ClassUnderTestTest test`
```sh
gradle -Dtest.single=ClassUnderTestTest test
```

* Run a TestNG Test Suite:

* Run a single Feature:

* Run Gradle Task from from command line:

* Run Test on Jenkins:



##CONFIGURATIONS:

GRADLE:
https://docs.gradle.org/4.3.1/userguide/tutorial_using_tasks.html
build.gradle -- script in multi-project builds
settings.gradle -- script will be executed in each build
gradle.properties -- simple Java Properties




