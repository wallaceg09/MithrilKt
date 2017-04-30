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

    val routeResolver: dynamic = mapOf(
            "/list" to object {
                val render = fun(): VNode {return m(Layout, children = m(UserListView))}
            },
            "/edit/:id" to object {
                val render = fun(vnode: VNode): VNode {return m(Layout, children = m(UserFormView, vnode.attrs))}
            }
    ).toAssociativeArray()

    Mithril.route(root, "/list", routeResolver)
}