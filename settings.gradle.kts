
enableFeaturePreview("VERSION_CATALOGS")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "test-project"

includeBuild("build-logic")

include(":mpp-library")
include(":android-app")
include(":mpp-library:feature-auth")
include(":mpp-library:feature-profile")