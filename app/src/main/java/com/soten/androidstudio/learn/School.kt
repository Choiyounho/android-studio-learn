package com.soten.androidstudio.learn

import io.realm.RealmObject

open class School() : RealmObject() {

    var name: String? = null
    var location: String? = null

}