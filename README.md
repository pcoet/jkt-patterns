# Java Patterns

Examples of design patterns, algorithms, data structures, and programming techniques in Java and Kotlin.

This repo will eventually contain a Kotlin port of Bob Nystrom's JLox, the teaching language
from his [Crafting Interpreters](https://craftinginterpreters.com/) project.

## Build

    ./gradlew build

## Test

    ./gradlew test

## TODOs
* Fix suppressed warnings in Merge and Queue: "uses unchecked or unsafe operations."
  * Basically, the generics are not type safe in these implementations.
