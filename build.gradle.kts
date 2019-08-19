
plugins {
    java
  id("org.sonarqube").version("2.7")
}


dependencies {
    compileOnly(gradleApi())
}

group = "com.tavisca.workshops.Mog"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}


val jar by tasks.getting(Jar::class) {


    manifest {


        attributes["Main-Class"] = "com.tavisca.workshops.MoG.ClassificationParser"


    }


}
