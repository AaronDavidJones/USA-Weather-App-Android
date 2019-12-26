const val APPLICATION_ID = "com.aaronj.usaweatherapp"

object Modules {
    const val app = ":app"
    const val navigation = ":navigation"

    const val local = ":common:local"
    const val remote = ":common:remote"
    const val ui = ":common:ui"

    const val search = ":features:search"
    const val notifications = "features:notifications"
    const val settings = ":features:settings"
    const val forecast = ":features:forecast"
}

object Releases {
    const val versionCode = 1
    const val versionName = "1.0"
}

object Versions {
    const val kotlin = "1.3.61"
    const val gradle = "3.6.0-rc01"
    const val serialization = "0.14.0"
    const val coroutines = "1.3.3"

    const val compileSdk = 29
    const val targetSdk = 29
    const val minSdk = 23

    // Android
    const val androidxCore = "1.2.0-rc01"
    const val appCompat = "1.1.0"
    const val constraintLayout = "2.0.0-beta4"
    const val nav = "2.2.0-rc04"
    const val lifecycle = "2.2.0-rc03"
    const val fragment = "1.2.0-rc04"
    const val material = "1.2.0-alpha03"
    const val work = "2.3.0-beta01"
    const val dataBinding = "5.4.1"
    const val room = "2.2.3"

    // Testing
    const val jUnit = "4.13-rc-2"
    const val jUnitExt = "1.1.1"
    const val espresso = "3.2.0"

    // Other
    const val koin = "2.0.1"
    const val glide = "4.10.0"
    const val retrofit = "2.7.0"
    const val retrofitKotlinxAdapter = "0.4.0"
    const val okHttp = "4.2.2"
    const val threeTen = "1.2.1"
    const val timber = "4.7.1"
    const val leakCanary = "2.0"
}

object Libraries {
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"

    const val koinScope = "org.koin:koin-androidx-scope:${Versions.koin}"
    const val koinViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    const val koinExt = "org.koin:koin-androidx-ext:${Versions.koin}"

    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    const val threeTen = "com.jakewharton.threetenabp:threetenabp:${Versions.threeTen}"

    const val leakCanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakCanary}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitKotlinXConverter = "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:${Versions.retrofitKotlinxAdapter}"
    const val httpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
}

object AndroidLibraries {
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val androidxCoreKtx = "androidx.core:core-ktx:${Versions.androidxCore}"

    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"

    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.nav}"
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.nav}"

    const val dataBinding = "com.android.databinding:compiler:${Versions.dataBinding}"

    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragment}"

    const val material = "com.google.android.material:material:${Versions.material}"

    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val lifecycleExt = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"

    const val work = "androidx.work:work-runtime-ktx:${Versions.work}"
}

object TestLibraries {
    const val jUnit = "junit:junit:${Versions.jUnit}"
    const val jUnitExt = "androidx.test.ext:junit:${Versions.jUnitExt}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"

    const val room = "androidx.room:room-testing:${Versions.room}"
    const val work = "androidx.work:work-testing:${Versions.work}"
    const val mockWebServer = "com.squareup.okhttp3:mockwebserver:${Versions.okHttp}"
}

object KotlinLibraries {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val coroutinesPlayServices = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:${Versions.coroutines}"

    const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.serialization}"
}
