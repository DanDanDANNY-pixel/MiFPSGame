plugins {
    id("com.android.application") version "8.2.2"
}
android {
    namespace = "com.miempresa.mifpsgame"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.miempresa.mifpsgame"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    // jMonkeyEngine Core y Android
    implementation("org.jmonkeyengine:jme3-core:3.6.1-stable")
    implementation("org.jmonkeyengine:jme3-android:3.6.1-stable")
    implementation("org.jmonkeyengine:jme3-android-native:3.6.1-stable")

    // Física
    implementation("org.jmonkeyengine:jme3-bullet:3.6.1-stable")
    implementation("org.jmonkeyengine:jme3-bullet-native:3.6.1-stable")

    // Audio
    implementation("org.jmonkeyengine:jme3-android-audio:3.6.1-stable")

    // Efectos visuales
    implementation("org.jmonkeyengine:jme3-effects:3.6.1-stable")
}