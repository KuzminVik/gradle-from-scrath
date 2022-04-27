plugins {
    id("kmm-convention")
}

dependencies {
    commonMainImplementation(libs.kotlin.stdlib)
    commonMainApi(libs.moko.mvvm.core)
}