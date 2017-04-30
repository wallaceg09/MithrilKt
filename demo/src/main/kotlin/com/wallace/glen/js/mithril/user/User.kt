package com.wallace.glen.js.mithril.user

import com.wallace.glen.js.mithril.Mithril
import com.wallace.glen.js.mithril.request.RequestOptions
import kotlin.js.Promise

/**
 * Created by Glen on 4/29/2017.
 */
object User {
    var list: Array<dynamic> = arrayOf()
    var current: dynamic = object {}

    fun loadList(): Promise<*> {
        return Mithril.request(RequestOptions(url = "https://rem-rest-api.herokuapp.com/api/users", withCredentials = true))
                .then(onFulfilled = fun(result: dynamic) {
                    list = result.data
                })
    }

    fun load(id: String): Promise<*> {
        val data = object {val id: String = id}
        val options = RequestOptions(url = "https://rem-rest-api.herokuapp.com/api/users/:id", data = data, withCredentials = true)

        fun onFulfilled (result: dynamic) {
            current = result
        }

        return Mithril.request(options).then(onFulfilled = ::onFulfilled)
    }

    fun save(): Promise<*> {
        val options = RequestOptions(
                method = RequestOptions.PUT, // PUT not working...?
                url = "https://rem-rest-api.herokuapp.com/api/users/:id",
                data = User.current,
                withCredentials = true)
        js("debugger")
        return Mithril.request(options = options)
    }
}