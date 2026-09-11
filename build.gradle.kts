plugins {
    kotlin("jvm") version "2.0.0"
    application
}

repositories { mavenCentral() }

dependencies {
    implementation("io.ktor:ktor-server-core-jvm:3.0.3")
    implementation("org.postgresql:postgresql:42.7.4")
    implementation("io.lettuce:lettuce-core:6.5.1.RELEASE")
}

application { mainClass.set("MainKt") }
