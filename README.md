# Pcoet Utils

## Build

    ./gradlew build
    
The JAR is built to:
 
 * **build/libs/pcoet-utils-1.0-SNAPSHOT.jar**.

To view test results, open the reports index file in a browser, e.g.:

    open build/reports/tests/test/index.html

## Test

    ./gradlew test

## TODOs
* Learn about Gradle.
* Fix suppressed warnings in Merge and Queue: "uses unchecked or unsafe operations."
  * Basically, the generics are not type safe in these implementations.
* Learn about JUnit
  * https://github.com/junit-team/junit4/wiki
  
## Things to know

### About Gradle

This package uses Gradle to build. To learn more about building a Java library with Gradle, see [Building Java Libraries](https://guides.gradle.org/building-java-libraries/).