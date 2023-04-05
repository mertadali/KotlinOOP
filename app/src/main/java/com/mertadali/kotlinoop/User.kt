package com.mertadali.kotlinoop
 // Bir user sınıfı olusturduk ve bu sınıfa ait gerçekleştirme ayrıntılarını yazdık.

class User {
    var name : String? = null
    var age :Int? = null

     //Constructor is a first function to run when we create  object by any class
     constructor(nameInput:String,ageInput:Int){
         this.name=nameInput
         this.age=ageInput
     }
}