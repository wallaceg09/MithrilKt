package com.wallace.glen.js.mithril

import org.w3c.dom.Element

/**
 * Created by Glen on 4/25/2017.
 */
@JsModule("mithril")
@JsNonModule

@JsName("m")
external fun m(selector: Any, attrs: Any? = definedExternally, vararg children: VNode? = definedExternally) : VNode

@JsName("m")
external fun m(selector: Any, attrs: Any? = definedExternally, children: String? = definedExternally) : VNode

@JsName("m")
external fun m(selector: Any, attrs: Any? = definedExternally, children: Number? = definedExternally) : VNode

@JsName("m")
external fun m(selector: Any, attrs: Any? = definedExternally, children: Boolean? = definedExternally) : VNode

@JsName("m")
external object Mithril {
    fun mount(element: Element, component: Component?)

    fun render(element: Element, vnodes: VNode)
    fun render(element: Element, vnodes: Array<VNode>)

    fun route(root: Element, defaultRoute: String, routes: Map<String, dynamic>)

    object route {
        fun set(path: String, data: Map<String, String> = definedExternally, options: dynamic = definedExternally)
        fun get() : String
        fun prefix(prefix: String)
        fun link(vnode: VNode)
        fun param(): dynamic
        fun param(key: String) : String
    }
}
