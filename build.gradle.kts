plugins {
    `java-library`
}



subprojects {
    apply<JavaLibraryPlugin>()

    repositories {
        mavenCentral()
        maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
        maven("https://m2.dv8tion.net/releases")

    }

}
