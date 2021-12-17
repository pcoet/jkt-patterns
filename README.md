# Java Patterns

Examples of design patterns, algorithms, best practices, and Java and Kotlin language features.

The Kotlin algorithms and data structures are translated or adapted from Kevin Wayne
and Robert Sedgewick's open-source [algs4](https://github.com/kevin-wayne/algs4) Java project.

## License

Apache 2.0; see [`LICENSE`](LICENSE) for details.

## Build

    ./gradlew build

## Test

    ./gradlew test

## TODOs
* Fix suppressed warnings in Merge and Queue: "uses unchecked or unsafe operations."
  * Basically, the generics are not type safe in these implementations.
