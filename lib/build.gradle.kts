plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

apply<AndroidDefault>()

dependencies {
    featureModule(true)
}