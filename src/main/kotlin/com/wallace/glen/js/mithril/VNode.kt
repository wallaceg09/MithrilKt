package com.wallace.glen.js.mithril

import org.w3c.dom.Element

/**
 * Created by Glen on 4/27/2017.
 */
external class VNode {
    var tag: dynamic
    var key: String?
    var attrs: Any?
    var children: dynamic
    var text: dynamic
    var dom: Element?
    var domSize: Double?
    var state: Any?
    var _state: Any?
    var events: Any?
    var instance: Any?
}
