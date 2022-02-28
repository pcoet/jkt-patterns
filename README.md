# JKt Patterns

Examples of design patterns, algorithms, data structures, and programming techniques in Java and Kotlin.

The algorithms in this project are translated or adapted from Robert Sedgewick
and Kevin Wayne's [algs4](https://github.com/kevin-wayne/algs4) Java project.

Some examples are adapted from, or inspired by, the [Kotlin documentation](https://kotlinlang.org/docs/home.html),
which is available as part of the [kotlin-web-site](https://github.com/JetBrains/kotlin-web-site) repo.

## Build

    ./gradlew build

## Test

    ./gradlew test

## TODOs
* Fix suppressed warnings in Merge and Queue: "uses unchecked or unsafe operations."
  * Basically, the generics are not type safe in these implementations.
