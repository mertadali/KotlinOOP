package com.mertadali.kotlinoop

class Piano : HouseDecor, Instruments{
    var brand :String? = null
    var digital : Boolean? =null
    override var roomName: String
        get() ="Kitchen"
        set(value) {}
}