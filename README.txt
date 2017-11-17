
TOOLS USED:
Selenide: https://github.com/codeborne/selenide

Cucumber: https://github.com/cucumber/cucumber

Gradle: https://github.com/gradle/gradle

jUnit: https://github.com/junit-team/junit5

Jenkins: https://github.com/kohsuke/jenkins


HOW TO RUN TEST:
gradle build -x test --build without tests

1. Run a single Test Method:
        - need to have init and teardown implementation (which browser to open, where to navigate, close browser after test)
2. Run a Test Class:
        gradle -Dtest.single=ClassUnderTestTest test
3. Run a JUnit Test Suite:
4. Run a single Feature:
5. Run Gradle Task from from command line:
6. Run Test on Jenkins:

CONFIGURATIONS:
-Dselenide.baseUrl=http://staging-server.com/start
-Dselenide.browser=chrome

DESIGN PATTERNS USED:
- Page Object
- Steps
- Lazy Initialization
- Builder
- Object Pool
- Behavior Specification





