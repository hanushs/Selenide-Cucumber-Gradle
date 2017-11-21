
TOOLS USED:
Selenide: https://github.com/codeborne/selenide
Cucumber: https://github.com/cucumber/cucumber
Gradle: https://github.com/gradle/gradle
TestNG: https://github.com/cbeust/testng
Jenkins: https://github.com/kohsuke/jenkins

HOW TO RUN TEST:
https://docs.gradle.org/current/userguide/build_lifecycle.html
gradle build -x test --build without tests

1. Run a single Test Method:
        - need to have init and teardown implementation (which browser to open, where to navigate, close browser after test)

2. Run a Test Class:
        gradle -Dtest.single=ClassUnderTestTest test

3. Run a TestNG Test Suite:

4. Run a single Feature:

5. Run Gradle Task from from command line:

6. Run Test on Jenkins:



CONFIGURATIONS:

GRADLE:
https://docs.gradle.org/4.3.1/userguide/tutorial_using_tasks.html
build.gradle -- script in multi-project builds
settings.gradle -- script will be executed in each build
gradle.properties -- simple Java Properties




