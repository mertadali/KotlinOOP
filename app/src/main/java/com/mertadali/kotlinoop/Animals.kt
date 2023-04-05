package com.mertadali.kotlinoop

open class Animals {
    open fun sing(){       // Animals sınıfından kalıtlanan dog sınıfında da sing fonksiyonu kullanılması için open yaptık.
        println("Animal song")
    }
}