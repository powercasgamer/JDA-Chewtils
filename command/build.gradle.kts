dependencies {
    compileOnly(libs.jda)
    implementation(projects.commons)
    implementation(libs.slf4j.api)
    implementation(libs.okhttp)
    implementation(libs.findbugs)
    implementation(libs.json)
}

//javadoc {
//    exclude 'com/jagrosh/jdautilities/commandclient/impl'
//}
