plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("dev.icerock.mobile.multiplatform.android-manifest")
}

kotlin {
    ios()
    android()
}