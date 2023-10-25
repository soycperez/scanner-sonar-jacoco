# scanner-sonar-jacoco
Example to scan a project with SonarQube and take the coverage level of the unit tests reflected in the report.

### Explaining branches:

1. Branch **adapter-pom**:
   It contains only the dependency structure and plugins for the execution of unit tests, JACOCO and SonarQube configuration. :smirk:
   <br/><br/>

2. Branch **connection-mongodb**: Contains an example of connecting to the local database. Which at the project level, the ENVIROMENT, are recovered through IDE. Simulating a configserver.
   <br/><br/>
   Contains an example of connecting to the local database. Which at the project level, the ENVIROMENT, are recovered through IDE. Simulating a configserver.
   A unit test is left to be able to read and understand. At the test level, there is a properties file, which WILL ONLY BE USED FOR THE TESTS. :innocent: <br/><br/>

3. Branch **develop**: Here all the merges of the subbranches that are generated will be carried out, to later merge with the **main** branch. :wink: <br/><br/>
4. Others branchs: 	Todas las remás ramas que se generen seran para alimentar el proyecto con lo que gustes, por lo que no habrá problema.
   Añade la palabra "feature/your_ Branch" para no perder las ramas pilares del proyecto y gente que quiera conocer. la estructura, sepa lo que se está haciendo. ¡EXITO! :stuck_out_tongue_winking_eye:
   <br/><br/>

### Commands execute Jacoco in server SonarQube.
* **Example in MVN:**
  <br>
   * **mvn clean org.jacoco:jacoco-maven-plugin:0.8.7:prepare-agent install**
     <br>
      * This command prepares the project packaging with the coverage report, so it is important to include the **org.jacoco plugin**, otherwise the project coverage will not be reflected on the SonarQube server.
        <br/><br/>
   * **mvn sonar:sonar -Dsonar.host.url=http://localhost:9000 -Dsonar.language=java -Dsonar.java.binaries=target/classes -Dsonar.java.coveragePlugin=jacoco -Dsonar.sources=src/main/java -Dsonar.tests=src/test -Dsonar.dynamicAnalysis=reuseReports -Dsonar.projectKey=scanner-sonar-jacoco -Dsonar.projectName=scanner-sonar-jacoco -Dsonar.login=<<YOUR_TOKEN>> -Dsonar.sourceEncoding=UTF-8 -Dsonar.junit.reportPaths=target/surefire-reports,target/failsafe-reports -Dsonar.jacoco.reportPaths=target/coverage-reports/jacoco-unit.exec**
     <br>
      * These are all the properties for the project to run correctly in SonarQue.
        And you can check the COVERAGE, as well as the number of tests executed. You can run it at the MAVEN level.
        <br/><br/>
* **Example in SONAR-SCANNER:**
   * **sonar.host.url=http://localhost:9000
     sonar.language=java**
     sonar.coverage.exclusions=<p>&#42;&#42;/dto/&#42;&#42;,&#42;&#42;/model/&#42;&#42;</p>
     **sonar.java.binaries=./target/classes
     sonar.java.coveragePlugin=jacoco
     sonar.sources=./src/main/java
     sonar.tests=./src/test
     sonar.dynamicAnalysis=reuseReports
     sonar.projectKey=scanner-sonar-jacoco
     sonar.projectName=scanner-sonar-jacoco
     sonar.login=<<YOUR_TOKEN>>
     sonar.sourceEncoding=UTF-8
     sonar.junit.reportPaths=target/surefire-reports,target/failsafe-reports
     sonar.jacoco.reportPaths=./target/coverage-reports/jacoco-unit.exec**
     <br>
      * If you use the sonar-scanner (added the next text of file sonar-scanner.properties), you must add the classes you want to exclude, so as not to generate incorrect coverages.
        <br/><br/>