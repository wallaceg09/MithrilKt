package com.wallace.glen.js.mithril

import kotlin.browser.document

/**
 * Created by Glen on 4/25/2017.
 */
fun main(args: Array<String>) {
    val root = document.body

    val Hello = object : Component {
        var count: Int = 0

        private val attrs = HtmlAttribute(`class` = "title")

        private val onclick1 = fun () {
            ++count
        }

        private val thing = arrayOf(
                m("p", attrs, children = "My first app!"),
                m("button", attrs = object {val onclick = onclick1}, children = "$count clicks")
        )

        override val view: (VNode) -> Any =
                fun(vnode: VNode) : Any {
                    val thing = arrayOf(
                            m("p", attrs, children = "My first app!"),
                            m("button", attrs = object {val onclick = onclick1}, children = "$count clicks")
                    )

                    return m("main", children = *thing)
                }
    }

    Mithril.mount(root!!, Hello)
}