plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
}

dependencies {
    implementation("dev.icerock:mobile-multiplatform:0.14.1")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.30")
    implementation("com.android.tools.build:gradle:7.1.3")
}