package com.wallace.glen.js.mithril

import kotlin.browser.document

/**
 * Created by Glen on 4/25/2017.
 */
fun main(args: Array<String>) {
    val root = document.body

    val attrs: dynamic = object {}
    attrs["class"] = "title"

    var thing = m("p", attrs, "My first app!")

    js("m.render(root, thing)")
}