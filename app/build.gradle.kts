plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(Versions.compileSdk)
    defaultConfig {
        applicationId = APPLICATION_ID
        minSdkVersion(Versions.minSdk)
        targetSdkVersion(Versions.targetSdk)
        versionCode = Releases.versionCode
        versionName = Releases.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        targetCompatibility = JavaVersion.VERSION_1_8
        sourceCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(fileTree(mapOf("include" to listOf("*.jar"), "dir" to "libs")))

    // Kotlin stdlib
    implementation(KotlinLibraries.kotlin)

    // Androidx
    implementation(AndroidLibraries.appCompat)
    implementation(AndroidLibraries.androidxCoreKtx)

    // ConstraintLayout
    implementation(AndroidLibraries.constraintLayout)

    // JUnit, Espresso
    testImplementation(TestLibraries.jUnit)
    androidTestImplementation(TestLibraries.jUnitExt)
    androidTestImplementation(TestLibraries.espresso)

    // Glide
    implementation(Libraries.glide)

    // Koin
    implementation(Libraries.koinScope)
    implementation(Libraries.koinViewModel)
    implementation(Libraries.koinExt)

    // Data Binding
    kapt(AndroidLibraries.dataBinding)

    // Co-routines
    implementation(KotlinLibraries.coroutinesCore)
    implementation(KotlinLibraries.coroutinesAndroid)
    implementation(KotlinLibraries.coroutinesPlayServices)

    // Fragment
    implementation(AndroidLibraries.fragmentKtx)

    // Material Design
    implementation(AndroidLibraries.material)

    // Lifecycle
    implementation(AndroidLibraries.lifecycleExt)
    implementation(AndroidLibraries.lifecycleViewModel)
    implementation(AndroidLibraries.lifecycleLiveData)
    implementation(AndroidLibraries.lifecycleRuntime)

    // Navigation
    implementation(AndroidLibraries.navigationUi)
    implementation(AndroidLibraries.navigationFragment)

    // Work
    implementation(AndroidLibraries.work)
    androidTestImplementation(TestLibraries.work)

    // Retrofit
    implementation(Libraries.retrofit)
    implementation(Libraries.retrofitKotlinXConverter)

    // OkHttp
    implementation(Libraries.httpLoggingInterceptor)
    testImplementation(TestLibraries.mockWebServer)

    // Serialization
    implementation(KotlinLibraries.serialization)

    // ThreeTenABP Time Library
    implementation(Libraries.threeTen)

    // Timber
    implementation(Libraries.timber)

    // Leak Canary
    debugImplementation(Libraries.leakCanary)

    // Room
    implementation(AndroidLibraries.roomRuntime)
    implementation(AndroidLibraries.roomKtx)
    kapt(AndroidLibraries.roomCompiler)
    testImplementation(TestLibraries.room)
}
