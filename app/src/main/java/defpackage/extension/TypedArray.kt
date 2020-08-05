@file:Suppress("unused")

package defpackage.extension

import android.content.res.TypedArray
import timber.log.Timber

inline fun <T : TypedArray?, R> T.use(block: (T) -> R): R {
    try {
        return block(this)
    } catch (e: Throwable) {
        throw e
    } finally {
        try {
            this?.recycle()
        } catch (e: Throwable) {
            Timber.e(e)
        }
    }
}