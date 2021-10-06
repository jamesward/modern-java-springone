plugins {
    application
}

application {
    mainClass.set("HelloRecords")
}

// this will work in Gradle 7.3
/*
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}
 */

/*
tasks.withType<JavaCompile> {
    options.compilerArgs.add("--enable-preview")
}
 */

tasks.register<JavaExec>("HelloRecords") {
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("HelloRecords")
}

tasks.register<JavaExec>("HelloSum") {
    dependsOn("classes")
    //jvmArgs("--enable-preview")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("HelloSum")
}

tasks.register<JavaExec>("HelloNullHelp") {
    dependsOn("classes")
    //jvmArgs("--enable-preview")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("HelloNullHelp")
}
