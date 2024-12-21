// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
}

android {
    compileSdkVersion 33
    defaultConfig {
        applicationId "com.example.viewpagerrecyclerviewapp"
        minSdkVersion 21
        targetSdkVersion 33
        versionCode 1
        versionName "1.0"
    }
    // Other configurations...
}
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:7.3.0'
        classpath 'org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.0'
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

}