plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.farzona.birthday"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.farzona.birthday"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
         = "1.0"
    }
compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}
