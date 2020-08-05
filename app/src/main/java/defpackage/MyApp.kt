package defpackage

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import org.kodein.di.android.BuildConfig
import timber.log.Timber

@Suppress("unused")
class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        AndroidThreeTen.init(this)
    }
}