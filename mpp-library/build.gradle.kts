plugins {
    id("kmm-convention")
    id("dev.icerock.mobile.multiplatform.ios-framework")
    id("dev.icerock.mobile.multiplatform.cocoapods")
}

dependencies {
    commonMainApi(projects.mppLibrary.featureAuth)
    commonMainImplementation(projects.mppLibrary.featureProfile)
//    commonMainImplementation(libs.kotlin.stdlib)
}

framework {
    export(projects.mppLibrary.featureAuth)
    export(projects.mppLibrary.featureProfile)
    export(libs.mokoMvvmCore)
}

cocoaPods {
    pod("AFNetworking")
}
