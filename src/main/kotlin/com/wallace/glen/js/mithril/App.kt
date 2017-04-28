package com.wallace.glen.js.mithril

import kotlin.browser.document

/**
 * Created by Glen on 4/25/2017.
 */
fun main(args: Array<String>) {
    val root = document.body

    val attrs = HtmlAttribute(`class` = "title")

    val thing = arrayOf(
            m("p", attrs, children = "My first app!"),
            m("button", children = "A button")
    )

    fun theFunction() : dynamic = m("main", children = *thing)

    val Hello = Component(::theFunction)

    Mithril.mount(root!!, Hello)
}