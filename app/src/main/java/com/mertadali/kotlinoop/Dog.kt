package com.mertadali.kotlinoop

class Dog : Animals() {
    override fun sing(){   // Animals sınıfından farklı bir sing fonksiyonu çağırmak için override ettik.
        println("Dog song ")
    }
}