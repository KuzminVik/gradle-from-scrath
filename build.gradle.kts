buildscript {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
    dependencies {
        classpath(":build-logic")
    }
}

allprojects {
    repositories {
        mavenCentral()
        google()
    }

    plugins.withType(com.android.build.gradle.BasePlugin::class) {
        extensions.configure(com.android.build.gradle.BaseExtension::class) {
            compileSdkVersion(30)
            defaultConfig {
                minSdk = 21
            }
        }
    }
}