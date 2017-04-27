package com.wallace.glen.js.mithril

import com.wallace.glen.js.JsObject

/**
 * Created by Glen on 4/26/2017.
 */
class HtmlAttribute (var `class` : String? = null, var id : String? = null): JsObject {
    override fun toJsObject() : dynamic {
        val jsObject : dynamic = object {}

        if (this.`class` != null) jsObject["class"] = `class`
        if (this.id != null) jsObject["id"] = id

        return jsObject
    }
}