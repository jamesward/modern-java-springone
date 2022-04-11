plugins {
    application
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.withType<JavaCompile> {
    options.compilerArgs.add("--enable-preview")
}

tasks.register<JavaExec>("HelloRecords") {
    javaLauncher.set(javaToolchains.launcherFor {
        languageVersion.set(JavaLanguageVersion.of(17))
    })
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("HelloRecords")
}

tasks.register<JavaExec>("HelloSum") {
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("HelloSum")
    javaLauncher.set(javaToolchains.launcherFor {
        languageVersion.set(JavaLanguageVersion.of(17))
    })
    jvmArgs("--enable-preview")
}

tasks.register<JavaExec>("HelloNullHelp") {
    javaLauncher.set(javaToolchains.launcherFor {
        languageVersion.set(JavaLanguageVersion.of(17))
    })
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("HelloNullHelp")
}
