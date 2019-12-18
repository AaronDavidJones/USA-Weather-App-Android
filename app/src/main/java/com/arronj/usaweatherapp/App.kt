package com.arronj.usaweatherapp

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import leakcanary.AppWatcher
import leakcanary.LeakCanary
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.logger.KOIN_TAG
import org.koin.core.logger.Level
import org.koin.core.logger.Logger
import org.koin.core.logger.MESSAGE
import timber.log.Timber

class App : Application() {
    override fun onCreate() {
        //disableLeakCanary()
        super.onCreate()
        startTimber()
        AndroidThreeTen.init(this)
        startKoin {
            logger(koinTimberLogger())
            androidContext(this@App)
            modules(listOf())
        }
    }

    private fun startTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            Timber.plant(object : Timber.Tree() {
                override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {}
            })
        }
    }

    private fun disableLeakCanary() {
        AppWatcher.config = AppWatcher.config.copy(enabled = false)
        LeakCanary.config = LeakCanary.config.copy(dumpHeap = false)
        LeakCanary.showLeakDisplayActivityLauncherIcon(false)
    }

    private fun koinTimberLogger() = object : Logger() {
        override fun log(level: Level, msg: MESSAGE) = Timber.tag(KOIN_TAG).run {
            when (level) {
                Level.DEBUG -> d(msg)
                Level.INFO -> i(msg)
                Level.ERROR -> e(msg)
            }
        }
    }
}