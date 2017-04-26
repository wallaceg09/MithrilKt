package com.wallace.glen.js.mithril

import kotlin.browser.document

/**
 * Created by Glen on 4/25/2017.
 */
fun main(args: Array<String>) {
    val root = document.body

    val attrs: dynamic = object {}
    attrs["class"] = "title"

    val thing = arrayOf(
            m("p", attrs, "My first app!"),
            m("button", "A button")
    )

    // TODO: Figure out why this doesn't work?
//    fun functionThatDoesntWork() = m("main", thing)

    fun theFunction() : dynamic {
        return m("main", thing)
    }

    val Hello: dynamic = object {}
    Hello["view"] = ::theFunction

    Mithril.mount(root, Hello)
}