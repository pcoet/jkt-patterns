# Java Patterns

Examples of design patterns, algorithms, Java language features, and CS fundamentals.

## License

Apache 2.0; see [`LICENSE`](LICENSE) for details.

## Build

    ./gradlew build

Or:

    ./gradlew build --rerun-tasks
    
The JAR is built to:
 
 * **build/libs/pcoet-patterns-1.0-SNAPSHOT.jar**.

To view test results, open the reports index file in a browser, e.g.:

    open build/reports/tests/test/index.html

## Test

    ./gradlew test

## TODOs
* Learn about Gradle.
* Fix suppressed warnings in Merge and Queue: "uses unchecked or unsafe operations."
  * Basically, the generics are not type safe in these implementations.
* Convert to JUnit5.
* Build a state machine: https://www.baeldung.com/java-enum-simple-state-machine
* Implement patterns from Effective Java, 3rd Ed.
  
## Things to know

### About Gradle

This package uses Gradle to build. To learn more about building a Java library with Gradle, see [Building Java Libraries](https://guides.gradle.org/building-java-libraries/).
