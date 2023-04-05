package com.mertadali.kotlinoop

class SuperMusician(name: String, age: Int, instrument: String) : Musicians(name, age, instrument) {
    // Bu şekilde SuperMusician sınıfından oluşturulacak herhangi bir obje Musiciansın bilgilerine de ulaşabilir.
    fun sing(){
        println("Story Time")
    }
}