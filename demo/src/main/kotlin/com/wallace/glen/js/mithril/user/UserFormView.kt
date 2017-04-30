package com.wallace.glen.js.mithril.user

import com.wallace.glen.js.mithril.Component
import com.wallace.glen.js.mithril.Mithril
import com.wallace.glen.js.mithril.VNode
import com.wallace.glen.js.mithril.lifetime.Initable
import com.wallace.glen.js.mithril.m
import org.w3c.dom.events.Event

/**
 * Created by Glen on 4/29/2017.
 */
class UserFormView : Component, Initable {
    override val view: (VNode) -> Any
        get() {
            return fun(vnode: VNode) : Any {
                val firstNameInputAttrs = object {
                    var oninput: Function<*> = Mithril.withAttr("value", fun(value: Any) {
                        User.current.firstName = value
                    })

                    var value = User.current?.firstName
                }
                val lastNameInputAttrs = object {
                    var oninput: Function<*> = Mithril.withAttr("value", fun(value: Any) {
                        User.current.lastName = value
                    })

                    var value = User.current?.lastName
                }

                val formAttrs = object {
                    val onsubmit = fun(e: Event) {
//                        js("debugger")
                        e.preventDefault()
                        User.save()
                    }
                }

                return m("form", attrs = formAttrs, children = arrayOf(
                        m("label.label", children = "First name"),
                        m("input.input[type=text][placeholder=First name", attrs = firstNameInputAttrs),
                        m("label.label", children = "Last name"),
                        m("input.input[placeholder=Last name]", attrs = lastNameInputAttrs),
                        m("button.button[type=submit]", children = "Save")
                    )
                )
            }
        }

    override val oninit: Function<*> = fun(vnode: VNode) {
        val id = vnode.attrs.id
        if(id is String) {
            User.load(id)
        } else {
            throw IllegalArgumentException("Expected id to be a String.")
        }
    }
}