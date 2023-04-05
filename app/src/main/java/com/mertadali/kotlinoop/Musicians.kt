package com.mertadali.kotlinoop

open class Musicians(name: String, age: Int, instrument: String) { // Open class inheritance için yaptık yapmazsak default olarak sınıflar final olur.
    private var name : String? = name

     var age: Int? = age
    get
    private set


    private var instrument : String? = instrument

   /*  Eğer bu şekliyle kullansaydık kullanıcının yaşına
       ve enstrumanına ulaşabilirdik diyelim  ki istemiyoruz bu durumda Encapsulation bize  kullanıcının
       herhangi bir bilgisini güvenli bir şekilde gizli tutmamıza yardımcı olur.
       */


    private val bandName : String = "Night Wish"

    fun returnBandName(password: String) :String {
        if (password== "12345"){
            return bandName
        }else{
            return "Wrong password "
        }
    }
}