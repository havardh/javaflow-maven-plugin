# Javaflow Maven Plugin

Maven plugin for running [javaflow](https://github.com/havardh/javaflow).

## How to use

Add the following to the plugins section of your `pom.xml` file.

```
<plugin>
  <groupId>com.github.havardh</groupId>
  <artifactId>javaflow-maven-plugin</artifactId>
  <version>1.2.0</version>
  <configuration>

    <!-- Specify output target directory. Default: ${basedir}/src/main/java -->
    <!-- sourceDirectory>test</sourceDirectory -->

    <!-- Specify output target directory. Default: ${basedir}/target -->
    <!-- targetDirectory></targetDirectory -->
    <apis>
      <api>
        <packageName>com.github.havardh.example.api</packageName>
        <suffixes>
          <!-- here you can specify suffixes like Dto.java -->
          <suffix>.java</suffix>
        </suffixes>
        <output>flow.js</output>
        <types>
          <!-- example for overriding types -->
          <!-- tag name is canonical java type name -->
          <!-- value is a valid flow (https://flow.org/) type -->
          <java.math.BigDecimal>number</java.math.BigDecimal>
        </types>
        <verifications>
          <!-- optional flag specifying if the engine should use the `ClassGetterNamingVerifier` -->
          <!-- take a look at the javaflow docs for more info on what this verifier does -->
          <verifyGetters>true</verifyGetters>
        </verifications>
      </api>

      <!-- more api nodes if applicable -->
    </apis>
  </configuration>
</plugin>
```

Run `mvn javaflow:build` to generate the flow types.

## Documentation

Refer to the [readme](https://github.com/havardh/javaflow/blob/master/readme.md) of the 
[javaflow](https://github.com/havardh/javaflow) repository for additional documentation.
