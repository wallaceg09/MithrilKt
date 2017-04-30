package com.wallace.glen.js

/**
 * Created by Glen on 4/29/2017.
 */

/**
 * Kotlin Maps aren't translated to associative arrays in javascript, so this extension converts a Map object to a
 * dynamic associative array.
 */
fun Map<*, *>.toAssociativeArray() : dynamic {
    val arr: dynamic = object {}
    forEach { arr[it.key] = it.value }

    return arr
}
