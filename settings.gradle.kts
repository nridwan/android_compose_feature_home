pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Compose"
include(":app")
include(":core:ui")
include(":feat:home:lib")
project(":feat:home:lib").projectDir = File("${rootProject.projectDir}/lib")
