## API AUTOMATION EXERCISE
This project is a Java-based API testing exercise

Prerequisites
------------
1. Java as the programming language
2. Gradle as build tool
3. Junit as framework
4. Intellij as IDE for writing code

Step
------------
add libraries using gradle's built-in features to your build.gradle file:
```
dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.8.1'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.8.1'
    testImplementation 'org.junit.vintage:junit-vintage-engine:5.7.2'

    implementation group: 'io.cucumber', name: 'cucumber-java', version: '7.12.0'
    testImplementation group: 'io.cucumber', name: 'cucumber-junit', version: '7.12.0'

    testImplementation group: 'io.rest-assured', name: 'rest-assured', version: '5.3.0'
    testImplementation group: 'org.json', name: 'json', version: '20220924'
    testImplementation 'io.rest-assured:json-path:5.3.0'
    testImplementation 'io.rest-assured:json-schema-validator:5.3.0'
    testImplementation group: 'org.assertj', name: 'assertj-core', version: '3.24.0'
}

test {
    useJUnitPlatform()
}
```

**Getting Started**
Setup your machine.

1. Install JDK
2. Install IntelliJ
3. Install Gradle
**Running Test**

[Test](https://github.com/rizky165/Test_API_Automation_Junit/blob/master/src/test/java/pages/ApiPages.java) : Send a get Request of an API and validate the body

You can run the tests directly from the IntelliJ, by right-clicking and Run test.

Output
------
![output](https://github.com/user-attachments/assets/448beaf3-6ef4-44c8-8c15-3d60b1155716)
