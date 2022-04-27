
plugins {
    id("com.android.application")
//    kotlin("android")
}

dependencies {
    implementation(project.mppLibrary)
}

android {
    lint {
        baseline = file("lint-baseline.xml")
    }
}