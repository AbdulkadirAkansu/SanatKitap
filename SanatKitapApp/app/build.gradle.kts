plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("androidx.navigation.safeargs.kotlin")
    id ("com.google.devtools.ksp")
    id ("dagger.hilt.android.plugin")

}

android {
    namespace = "com.akansu.sanatkitapapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.akansu.sanatkitapapp"
        minSdk = 34
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation ("com.google.dagger:hilt-android:2.48")
    ksp ("com.google.dagger:hilt-android-compiler:2.48")
    //implementation "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03"
    ksp ("androidx.hilt:hilt-compiler:1.0.0")

    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation ("androidx.activity:activity-ktx:1.7.2")

    implementation ("androidx.room:room-runtime:2.5.2")
    ksp ("androidx.room:room-compiler:2.5.2")
    implementation ("androidx.room:room-ktx:2.5.2")

    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("androidx.navigation:navigation-fragment-ktx:2.7.3")
    implementation ("androidx.navigation:navigation-ui-ktx:2.7.3")
    implementation ("com.github.bumptech.glide:glide:4.15.1")
    ksp ("com.github.bumptech.glide:compiler:4.13.2")


    // TestImplementations
    implementation ("androidx.test:core:1.5.0")
    testImplementation ("junit:junit:4.13.2")
    testImplementation ("org.hamcrest:hamcrest-all:1.3")
    testImplementation ("androidx.arch.core:core-testing:2.2.0")
    testImplementation ("org.robolectric:robolectric:4.10.3")
    testImplementation ("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.3")
    testImplementation ("com.google.truth:truth:1.1.5")
    testImplementation ("org.mockito:mockito-core:5.5.0")

    // Android Test Implementations
    androidTestImplementation ("junit:junit:4.13.2")
    //androidTestImplementation "com.linkedin.dexmaker:dexmaker-mockito:2.12.1"
    androidTestImplementation ("org.mockito:mockito-android:5.5.0")
    androidTestImplementation ("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.3")
    androidTestImplementation ("androidx.arch.core:core-testing:2.2.0")
    androidTestImplementation ("com.google.truth:truth:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation ("org.mockito:mockito-core:5.5.0")
    androidTestImplementation ("com.google.dagger:hilt-android-testing:2.48")
    kspAndroidTest ("com.google.dagger:hilt-android-compiler:2.48")
    //debugImplementation ("androidx.fragment:fragment-testing:1.7.0-alpha08")

    androidTestImplementation("androidx.test.espresso:espresso-contrib:3.5.1") {
        exclude(group = "org.checkerframework", module = "checker")
    }
}

ksp {
    arg("room.schemaLocation", "${project.buildDir}/schemas")
}

