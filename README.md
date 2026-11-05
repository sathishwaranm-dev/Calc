# Maven Calculator Lab

A small Java 21 Maven project for practising dependency management, compilation,
JUnit testing, packaging, and local installation.

## Requirements
- JDK 21
- Apache Maven 3.9.x (or a compatible recent Maven release)

## Verify tools
```powershell
java -version
mvn -version
```

## Run from this folder
```powershell
mvn clean
mvn compile
mvn test
mvn package
```

Run the packaged application:
```powershell
java -jar target/maven-calculator-1.0-SNAPSHOT.jar
```

Install the artifact into your local Maven repository:
```powershell
mvn install
```

Expected application output:
```text
Maven Calculator Application
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2.0
```

JUnit test reports are written under `target/surefire-reports/`.
The packaged JAR is written under `target/`.
