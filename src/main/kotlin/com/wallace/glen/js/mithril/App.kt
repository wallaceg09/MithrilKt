package com.wallace.glen.js.mithril

import kotlin.browser.document

/**
 * Created by Glen on 4/25/2017.
 */
fun main(args: Array<String>) {
    val root = document.body

    val attrs = HtmlAttribute(`class` = "title")

    val thing = arrayOf(
            m("p", attrs.toJsObject(), "My first app!"),
            m("button", "A button")
    )

    fun theFunction() : dynamic = m("main", thing)

    val Hello = MithrilComponent(::theFunction)

    Mithril.mount(root, Hello)
}