package com.wallace.glen.js.mithril

import com.wallace.glen.js.mithril.request.RequestOptions
import org.w3c.dom.Element
import kotlin.js.Promise

/**
 * Created by Glen on 4/25/2017.
 */
@JsModule("mithril")
@JsNonModule

@JsName("m")
external fun m(selector: Any, attrs: Any? = definedExternally, children: Array<VNode> = definedExternally) : VNode

@JsName("m")
external fun m(selector: Any, attrs: Any? = definedExternally, children: VNode = definedExternally) : VNode

@JsName("m")
external fun m(selector: Any, attrs: Any? = definedExternally, children: String = definedExternally) : VNode

@JsName("m")
external fun m(selector: Any, attrs: Any? = definedExternally, children: Number = definedExternally) : VNode

@JsName("m")
external fun m(selector: Any, attrs: Any? = definedExternally, children: Boolean = definedExternally) : VNode

@JsName("m")
external fun m(selector: Any) : VNode
@JsName("m")
external fun m(selector: Any, attrs: Any? = definedExternally) : VNode

@JsName("m")
external object Mithril {
    fun mount(element: Element, component: Component?)

    fun render(element: Element, vnodes: VNode)
    fun render(element: Element, vnodes: Array<VNode>)

    fun route(root: Element, defaultRoute: String, routes: dynamic)

    object route {
        fun set(path: String, data: Map<String, String> = definedExternally, options: dynamic = definedExternally)
        fun get() : String
        fun prefix(prefix: String)
        fun link(vnode: VNode)
        fun param(): dynamic
        fun param(key: String) : String
    }

    fun request(url: String, options: RequestOptions = definedExternally) : Promise<*>
    fun request(options: RequestOptions = definedExternally) : Promise<*>

    fun <T>parseQueryString(string: String): T

    fun buildQueryString(obj: Map<String, Any>)
    fun buildQueryString(obj: Any)
    fun buildQueryString(obj: dynamic)

    fun withAttr(attrName: String, callback: (Any) -> Unit, thisArg: Any = definedExternally) : (Any) -> Unit

    fun fragment(attrs: Any, children: Array<VNode>?): VNode
    fun fragment(attrs: Any, children: String?): VNode
    fun fragment(attrs: Any, children: Number?): VNode
    fun fragment(attrs: Any, children: Boolean?): VNode

    fun trust(html:String) : VNode

    fun redraw()

    fun version() : String
}
