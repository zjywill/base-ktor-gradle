# base-ktor-gradle
A simple ktor project using gradle build system

## How to run
##### Important: You don`t need to install any web server, just execute the project!

```shell
git clone git@github.com:BugsBunnyBR/base-ktor-gradle.git
cd base-ktor-gradle
./gradlew run
```

Open browser http://localhost:5000

## Project folder Structure

```
base-ktor-gradle/
  |-- web/
  |   -- META-INF/context.xml
  |   -- WEB-INF/web.xml
  |-- gradle/wrapper
  |       -- gradle-wrapper.jar
  |       -- gradle-wrapper.properties
  |-- build.gradle
  |-- gradlew
  |-- gradlew.bat
  |-- settings.gradle
  |-- src/main/
  |       -- kotlin/com/sample/Main.kt
  |       -- resources/
  |           -- application.conf
  |           -- logback.xml
  
  
```

### I don`t know exactly what each file does, but I will try to summarize:

 - `web/WEB-INF/web.xml` holds the servlet host class, servlet display name, servlet name and the url path to your application. Know more [here](https://docs.oracle.com/cd/E13222_01/wls/docs81/webapp/web_xml.html).
 - `web/META-INF/context.xml` holds the reference which application.conf should be loaded. #Wild guess.
 - `gradle/wrapper/gradle-wrapper.jar` executes the update of the wrapper.
 - `gradle/wrapper/gradle-wrapper.properties` defines which version of gradle to use in the wrapper.
 - `build.gradle` defines where your classes/tests will be, the dependencies and dependencies versions.
 - `gradlew and gradlew.bat` executes the project build using the wrapped gradle version. Know more [here](https://docs.gradle.org/current/userguide/gradle_wrapper.html).
 - `settings.gradle` defines which gradle modules are part of your build path.
 - `src/main/kotlin/*` is where you should place your kotlin packages/classes
 - `src/main/resources/application.conf` defines which port to run, environment and the "bootstrap" class/method of your application.
 - `src/main/resources/logback.xml` defines where the server should log (default is the console where it is running). 
 

 


  
