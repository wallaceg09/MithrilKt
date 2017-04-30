package com.wallace.glen.js.mithril.layout

import com.wallace.glen.js.mithril.Component
import com.wallace.glen.js.mithril.Mithril
import com.wallace.glen.js.mithril.VNode
import com.wallace.glen.js.mithril.m

/**
 * Created by Glen on 4/30/2017.
 */
class Layout : Component {
    override val view: (VNode) -> Any
        get() : (VNode) -> Any {
            return fun (vnode: VNode) : VNode{
                return m("main.layout", arrayOf(
                        m("nav.menu", arrayOf(
                                m("a[href='/list'", object {val oncreate = Mithril.route::link}, "Users")
                        )),
                        m("section", vnode.children)
                ))
            }
        }
}