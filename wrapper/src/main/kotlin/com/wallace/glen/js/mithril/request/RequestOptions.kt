package com.wallace.glen.js.mithril.request

import org.w3c.xhr.XMLHttpRequest

/**
 * Created by Glen on 4/28/2017.
 *
 * Wrapper for the options available for the javascript function []m.request()][https://mithril.js.org/request.html].
 */
class RequestOptions (
        var method: String = "GET",
        var url: String,
        var data: Any? = null,
        var async: Boolean = true,
        var user: String? = undefined,
        var password: String? = undefined,
        var withCredentials: Boolean = false,
        var config: ((xhr: XMLHttpRequest) -> Any)? = null,
        var headers: dynamic = null,
        var type: ((obj: Any) -> dynamic)? = null,
        var serialize: ((data: Any) -> Any)? = null,
        var deserialize: ((data: String) -> Any?)? = null,
        var extract: ((xhr: XMLHttpRequest, options: dynamic) -> dynamic)? = null,
        var useBody: Boolean = method == GET,
        var background: Boolean = false
        ) {
    companion object {
        val POST = "POST"
        val GET = "GET"
        val PUT = "PUT"
        val PATCH = "PATCH"
        val DELETE = "DELETE"
    }
}