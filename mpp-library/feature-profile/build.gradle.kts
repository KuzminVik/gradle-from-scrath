plugins {
    id("kmm-convention")
}

kotlin {

    sourceSets {
        val commonMain by getting
        commonMain.dependencies {
//            implementation("org.jetbrains.kotlin:kotlin-stdlib-common:1.5.30")
        }
    }
}