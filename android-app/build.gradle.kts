
plugins {
    id("com.android.application")
//    kotlin("android")
}

dependencies {
    implementation(project(":mpp-library"))
}

android {
    lint {
        baseline = file("lint-baseline.xml")
    }
}