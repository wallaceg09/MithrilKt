package com.wallace.glen.js.mithril

/**
 * Created by Glen on 4/30/2017.
 */
interface RouteResolver {
    val onmatch: (args: dynamic, requestedPath: String) -> dynamic
    val render: (vnode: VNode) -> Array<VNode>
}