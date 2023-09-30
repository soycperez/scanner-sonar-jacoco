# scanner-sonar-jacoco
Example to scan a project with SonarQube and take the coverage level of the unit tests reflected in the report.

### Explaining branches:

1. Branch **adapter-pom**:
   It contains only the dependency structure and plugins for the execution of unit tests, JACOCO and SonarQube configuration. :smirk:
   <br/><br/>

2. Branch **connection-mongodb**: Contiene un ejemplo de conexión a la base de datos en local. El cual a nivel de proyecto los ENVIROMENT, se recuperan a través de IDE. Simulando un configserver.
   <br/><br/>
   Contains an example of connecting to the local database. Which at the project level, the ENVIROMENT, are recovered through IDE. Simulating a configserver.
   A unit test is left to be able to read and understand. At the test level, there is a properties file, which WILL ONLY BE USED FOR THE TESTS. :innocent: <br/><br/>

3. Branch **develop**: Here all the merges of the subbranches that are generated will be carried out, to later merge with the **main** branch. :wink: <br/><br/>
4. Others branchs: 	Todas las remás ramas que se generen seran para alimentar el proyecto con lo que gustes, por lo que no habrá problema.
   Añade la palabra "feature/your_ Branch" para no perder las ramas pilares del proyecto y gente que quiera conocer. la estructura, sepa lo que se está haciendo. ¡EXITO! :stuck_out_tongue_winking_eye:
   <br/><br/>
