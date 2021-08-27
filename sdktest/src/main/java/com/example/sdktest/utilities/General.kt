package com.example.sdktest.utilities

import android.content.Context
import com.scottyab.rootbeer.RootBeer

class General {

    internal fun getText(): String {
        return "Text"
    }

    internal fun isRooted(context: Context): Boolean {
        return RootBeer(context).isRooted
    }

}