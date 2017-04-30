package com.wallace.glen.js.mithril.user

import com.wallace.glen.js.mithril.Component
import com.wallace.glen.js.mithril.Mithril
import com.wallace.glen.js.mithril.VNode
import com.wallace.glen.js.mithril.lifetime.Initable
import com.wallace.glen.js.mithril.m

/**
 * Created by Glen on 4/29/2017.
 */
class UserListView : Component, Initable {
    override val view: (VNode) -> Any
        get() {
            return fun(vnode: VNode) = m(".user-list", children = User.list.map(this::userListItem).toTypedArray())
        }
    private fun userListItem(user: dynamic): VNode{
        val attrs = object {
            val href = "/edit/${user.id}"
            val oncreate = Mithril.route::link
        }
        return m(".user-list-item", attrs = attrs,children = "${user.firstName} ${user.lastName}")
    }

    override val oninit: Function<*> = User::loadList
}