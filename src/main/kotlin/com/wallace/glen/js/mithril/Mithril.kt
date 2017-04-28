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
    fun mount(element: dynamic, component: dynamic) : dynamic

    fun render(element: Element, vnodes: VNode)
    fun render(element: Element, vnodes: Array<VNode>)
}
