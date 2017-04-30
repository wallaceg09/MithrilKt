package com.wallace.glen.js.mithril

import com.wallace.glen.js.mithril.layout.Layout
import com.wallace.glen.js.mithril.user.UserFormView
import com.wallace.glen.js.mithril.user.UserListView
import com.wallace.glen.js.toAssociativeArray
import kotlin.browser.document

/**
 * Created by Glen on 4/25/2017.
 */
fun main(args: Array<String>) {
    val root = document.body!!

    var UserListView = UserListView()
    var UserFormView = UserFormView()
    var Layout = Layout()

//    val routes: dynamic = mapOf(
//            "/list" to UserListView,
//            "/edit/:id" to UserFormView
//    ).toAssociativeArray()

    val listRouteResolver = object: RouteResolver {
        override val onmatch: (dynamic, requestedPath: String) -> dynamic
            get() = fun(args: dynamic, requestedPath: String) {}
        override val render: (vnode: VNode) -> Array<VNode>
            get() = fun(vnode: VNode): Array<VNode> { return arrayOf(m(Layout, children = m(UserListView))) }
    }

    val editRouteResolver = object: RouteResolver {
        override val onmatch: (dynamic, requestedPath: String) -> dynamic
            get() = fun(args: dynamic, requestedPath: String){}
        override val render: (vnode: VNode) -> Array<VNode>
            get() = fun(vnode: VNode): Array<VNode> {return arrayOf(m(Layout, children = m(UserFormView, vnode.attrs)))}
    }

    val routeResolver: dynamic = mapOf(
            "/list" to listRouteResolver,
            "/edit/:id" to editRouteResolver
    ).toAssociativeArray()

    Mithril.route(root, "/list", routeResolver)
}