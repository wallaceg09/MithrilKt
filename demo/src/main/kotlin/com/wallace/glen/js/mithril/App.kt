package com.wallace.glen.js.mithril

import com.wallace.glen.js.mithril.request.RequestOptions
import kotlin.browser.document

/**
 * Created by Glen on 4/25/2017.
 */
fun main(args: Array<String>) {
    val root = document.body

    val Hello = object : com.wallace.glen.js.mithril.Component {
        var count: Int = 0

        private val attrs = com.wallace.glen.js.mithril.HtmlAttribute(`class` = "title")

        private val onclick1 = fun () {
            ++count
        }

        private fun getView() : (com.wallace.glen.js.mithril.VNode) -> Any {
            fun increment() {
                val value = count + 1
                class Result(var count: Int)
                com.wallace.glen.js.mithril.Mithril.request(com.wallace.glen.js.mithril.request.RequestOptions(
                        method = "PUT",
                        url = "http://rem-rest-api.herokuapp.com/api/tutorial/0",
                        data = object {
                            var count: Number = value
                        },
                        withCredentials = true
                )).then(onFulfilled = fun(data: Any?) {
                    if(data is Result) {
                        count = data.count
                    }
                })
            }

            return fun(vnode: com.wallace.glen.js.mithril.VNode) : Any {
                val thing = arrayOf(
                        com.wallace.glen.js.mithril.m("p", attrs, children = "My first app!"),
                        com.wallace.glen.js.mithril.m("button", attrs = object {
                            val onclick = ::increment
                        }, children = "$count clicks")
                )

                return com.wallace.glen.js.mithril.m("main", children = *thing)
            }
        }

        override val view: (com.wallace.glen.js.mithril.VNode) -> Any get() = getView()

    }

    com.wallace.glen.js.mithril.Mithril.mount(root!!, Hello)
}