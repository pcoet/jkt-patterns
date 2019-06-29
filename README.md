# Pcoet Utils

## Build

    mvn package

This will compile source code, run tests, and package the compiled code as a JAR in the target directory. Note that the package builds with the Maven Shade plugin, which lets you package artifacts and dependencies in a single jar and then rename (i.e. "shade") dependencies.

## Clean

    mvn clean

## Test

    mvn test

Maven uses a plugin called "surefire" to run unit tests. The default configuration of this plugin compiles and runs all classes in src/test/java with a name matching `*Test`.

## Use locally in another Maven project

First, install the Pcoet Utils package:

    mvn install

Then, in the pom.xml of your other Maven project, you can declare a dependency on Pcoet Utils and package it with the jar.

The other pom.xml would look something like this, but with the correct Main-Class):

```xml
<project ...>
  ...
  <dependencies>
    ...
    <dependency>
      <groupId>pcoet.utils</groupId>
      <artifactId>pcoet-utils</artifactId>
      <version>0.1.0</version>
      <scope>compile</scope>
    </dependency>
  </dependencies>
  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-shade-plugin</artifactId>
        <version>3.2.1</version>
        <executions>
          <execution>
            <phase>package</phase>
            <goals>
              <goal>shade</goal>
            </goals>
            <configuration>
              <transformers>
                <transformer implementation="org.apache.maven.plugins.shade.resource.ManifestResourceTransformer">
                  <manifestEntries>
                    <Main-Class>MAIN.CLASS.HERE</Main-Class>
                  </manifestEntries>
                </transformer>
              </transformers>
            </configuration>
          </execution>
        </executions>
      </plugin>
    </plugins>
  </build>
</project>
```

During the packaging process, the Shade plugin puts dependencies next to the main class in the jar.

After you package up this other project, you should be able to run it:

    java -jar target/<my-jar>.jar

## TODOs

* Convert to Gradle.
* Use Intellij.
* Implement (better) QuickSort
* Learn about JUnit
  * https://github.com/junit-team/junit4/wiki