package com.wallace.glen.js.mithril

/**
 * Created by Glen on 4/25/2017.
 */
@JsModule("mithril")
@JsNonModule

external fun m(selector: String, attrs: dynamic, vararg children: dynamic)

@JsName("m")
external object Mithril {
    fun render(element: dynamic, vnodes: dynamic)
}
