# java-utils

## Build

    mvn package

This will compile source code, run tests, and package the compiled code as a JAR in the target directory. Note that the package builds with the Maven Shade plugin, which lets you package artifacts and dependencies in a single jar and then rename (i.e. "shade") dependencies.

## Clean

    mvn clean

## Test

    mvn test

Maven uses a plugin called "surefire" to run unit tests. The default configuration of this plugin compiles and runs all classes in src/test/java with a name matching `*Test`.

## Use locally

First, install the package

    mvn install

Then, in another Maven project, you can declare a dependency.

## TODOs

* Learn about the Java classpath
* Implement QuickSort
* Learn about Maven
  * https://maven.apache.org/index.html
* Learn about JUnit
  * https://github.com/junit-team/junit4/wiki