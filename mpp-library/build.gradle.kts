plugins {
    id("kmm-convention")
    id("dev.icerock.mobile.multiplatform.ios-framework")
    id("dev.icerock.mobile.multiplatform.cocoapods")
}

dependencies {
    commonMainApi(project.mppLibrary.featureAuth)
    commonMainImplementation(project.mppLibrary.featureProfile)
    commonMainImplementation(libs.kotlin.stdlib)
}

framework {
    export(project.mppLibrary.featureProfile)
    export(project.mppLibrary.featureAuth)
    export(libs.moko.mvvm.core)
}

cocoaPods {
//    pod("AFNetworking")
}