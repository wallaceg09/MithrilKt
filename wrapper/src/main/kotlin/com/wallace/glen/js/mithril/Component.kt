package com.wallace.glen.js.mithril

/**
 * Created by Glen on 4/26/2017.
 */
interface Component {
    val view: (VNode) -> Any
}