plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.carrom.aimmaster"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.carrom.aimmaster"
        minSdk = 30
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
