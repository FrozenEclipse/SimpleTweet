package com.codepath.apps.restclienttemplate
//
//import android.util.Log
//import java.text.ParseException
//import java.text.SimpleDateFormat
//import java.util.*
//
class formatTime {
//    private val SECOND_MILLIS = 1000
//    private val MINUTE_MILLIS = 60 * SECOND_MILLIS
//    private val HOUR_MILLIS = 60 * MINUTE_MILLIS
//    private val DAY_MILLIS = 24 * HOUR_MILLIS
//
//    fun getRelativeTimeAgo(rawJsonDate: String?): String? {
//        val twitterFormat = "EEE MMM dd HH:mm:ss ZZZZZ yyyy"
//        val format = SimpleDateFormat(twitterFormat, Locale.ENGLISH)
//        format.setLenient(true)
//        try {
//            var ret = ""
//            val time: Long = format.parse(rawJsonDate).getTime()
//            val now = System.currentTimeMillis()
//            val diff = now - time
//            if (diff < 5) {
//                ret = "just now"
//            }
//            else if (diff < 60) {
//                ret = "a minute ago"
//            }
//            else if (diff < 50 * 60000) {
//                ret = java.lang.String.format(Locale.ENGLISH, "%ds", diff)
//            }
//            else if (diff < 90 * 60000) {
//                ret = "an hour ago"
//            }
//            else if (diff < 24 * 3600000) {
//                diff / 3600000.toString() + " h"
//            }
//            else if (diff < 48 * HOUR_MILLIS) {
//                ret = "yesterday"
//            }
//            else {
//                diff / DAY_MILLIS.toString() + " d"
//            }
//            return ret
//        } catch (e: ParseException) {
//            Log.i("TimeFormat", "getRelativeTimeAgo failed")
//            e.printStackTrace()
//        }
//        return ""
//    }
}