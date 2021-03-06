package com.mapbox.services.android.navigation.v5.utils.extensions

import android.os.Build
import android.os.HandlerThread

fun HandlerThread.quitSafelySupport() {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
        this.quitSafely()
    } else {
        this.quit()
    }
}
