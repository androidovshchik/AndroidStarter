@file:Suppress("unused")

package defpackage.extension

import android.app.ActivityManager
import android.app.Service

@Suppress("DEPRECATION")
inline fun <reified T : Service> ActivityManager.isRunning(): Boolean {
    for (service in getRunningServices(Int.MAX_VALUE)) {
        if (T::class.java.name == service.service.className) {
            return true
        }
    }
    return false
}