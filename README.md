## Selenide-Cucumber-Gradle

### TOOLS USED:<br/>
[Selenide](https://github.com/codeborne/selenide)<br/>
[Cucumber](https://github.com/cucumber/cucumber)<br/>
[Gradle](https://github.com/gradle/gradle)<br/>
[JUnit](http://junit.org/junit5/docs/current/user-guide/)<br/>
[Jenkins](https://github.com/kohsuke/jenkins)<br/>

### HOW TO RUN TEST:<br/>
https://docs.gradle.org/current/userguide/build_lifecycle.html<br/>
build without tests using gradle installation:<br/>
`gradle build -x test`<br/>
build without tests using built-in gradle wrapper: <br/>
`./gradlew build -x test`<br/>

* Run a single Test Method:<br/>
        - need to have init and teardown implementation (which browser to open, where to navigate, close browser after test)

* Run a Test Class: <br/>
	`gradle -Dtest.single=ClassUnderTestTest test`

* Run a TestNG Test Suite:<br/>

* Run a single Feature:<br/>

* Run Gradle Task from from command line:<br/>

* Run Test on Jenkins:<br/>

### CONFIGURATIONS:
GRADLE:<br/>
https://docs.gradle.org/4.3.1/userguide/tutorial_using_tasks.html<br/>
build.gradle -- script in multi-project builds<br/>
settings.gradle -- script will be executed in each build<br/>
gradle.properties -- simple Java Properties<br/>




