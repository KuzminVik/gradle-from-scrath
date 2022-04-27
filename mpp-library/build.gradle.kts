plugins {
    id("kmm-convention")
    id("dev.icerock.mobile.multiplatform.ios-framework")
    id("dev.icerock.mobile.multiplatform.cocoapods")
}

dependencies {
    commonMainApi(project(Modules.featureAuth))
    commonMainImplementation(project(Modules.featureProfile))
//    commonMainImplementation(Deps.stdlib)
}

framework {
    export(project(Modules.featureProfile))
    export(project(Modules.featureAuth))
    export(Deps.mokoMvvmCore)
}

cocoaPods {
//    pod("AFNetworking")
}