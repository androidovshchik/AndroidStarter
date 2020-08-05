@file:Suppress("unused")

package defpackage.extension

import android.graphics.Bitmap
import timber.log.Timber

inline fun <T : Bitmap?, R> T.use(block: (T) -> R): R {
    try {
        return block(this)
    } catch (e: Throwable) {
        throw e
    } finally {
        try {
            if (this?.isRecycled == false) {
                recycle()
            }
        } catch (e: Throwable) {
            Timber.e(e)
        }
    }
}