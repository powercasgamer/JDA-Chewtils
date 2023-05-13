plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version("0.5.0")
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "JDA-Chewtils"
sequenceOf(
        "command",
        "commons",
        "doc",
        "examples",
        "menu",
        "oauth2",
).forEach {
    include("$it")
}
