package edu.yujie.designpettern

import android.content.Context.CONNECTIVITY_SERVICE
import android.net.ConnectivityManager
import androidx.core.content.ContextCompat.getSystemService


fun getMethodName(): String {
    val stackTrace = Thread.currentThread().stackTrace
    return stackTrace[3].methodName
}

fun getClassName(): String {
    val stackTrace = Thread.currentThread().stackTrace
    return stackTrace[3].className
}

