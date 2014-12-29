Required tech's

Gradle [https://www.gradle.org/downloads]
Mongodb [https://www.mongodb.org/dr//fastdl.mongodb.org/win32/mongodb-win32-x86_64-2008plus-2.4.12.zip/download]
Eclipse luna or newer is recommended [https://eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/lunar]
git [http://git-scm.com/download/win]

Clone code:
git clone remote.origin.url	https://github.com/ajitkulkarni/restrobooking.git
Import code into eclipse as git project.

Then move inside restrobooking folder from command prompt

Run gradlew eclipse, once this is success.
Run gradlew

In eclipse "Runas Jetty", give port as 8080

Hit "http://localhost:8080/restrobooking", you can see dummy page.

Hit "http://localhost:8080/restrobooking/resources/sample" from firefox rest-client. you can "Hello world" response. And check in your local mongodb, you can see "EmployeePerformanceInfo" collection under PAR db with one document.

Then start your fun!!!!!!!








