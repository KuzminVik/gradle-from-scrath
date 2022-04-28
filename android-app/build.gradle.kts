
plugins {
    id("com.android.application")
//    id("com.android.library")
    id("kotlin-android")
//    kotlin("android")
}

dependencies {
    implementation(projects.mppLibrary)
}

android {
    lint {
        baseline = file("lint-baseline.xml")
    }
}