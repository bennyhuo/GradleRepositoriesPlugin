plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.4.30"
    id("org.jetbrains.dokka") version "1.4.30"
    id("com.vanniktech.maven.publish") version "0.13.0"
}

group = "com.bennyhuo.gradle"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.jetbrains.kotlin:kotlin-stdlib")
    compileOnly(gradleKotlinDsl())
    testCompile(group = "junit", name = "junit", version = "4.12")
}
