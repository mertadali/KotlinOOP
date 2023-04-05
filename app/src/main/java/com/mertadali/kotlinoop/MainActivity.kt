package com.mertadali.kotlinoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mertadali.kotlinoop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //Constructor

        var myUser =
            User("Mert", 23)   // User sınıfından oluşturulmuş bir myUser adlı obje oluşturduk.
        myUser.age = 24
        myUser.name = "Levent"        // bu şekilde değiştirilebilir.
        println(myUser.age)
        println(myUser.name)

        //Encapsulation(Kapsülleme)

        var Mert = Musicians(
            "Mert",
            23,
            "Violin"
        )   // Mert objesinin isim bilgisini artık göremiyoruz Mert.age=34  -  artık set metodu private olduğundan gene değiştirilemez yapıldı.
        println(Mert.age)  // ancak yaş bilgisini yazdırabiliriz
        println(Mert.returnBandName("12345"))
        println(Mert.returnBandName("12344"))  // Bu şekilde bile private bir bilgiyi kapsülleyebiliriz.

        //Inheritance(Kalıtım)

        var Levent = SuperMusician("Miray", 23, "Violin")
        Levent.sing()  // Eğer Levent objesini müzisyen sınıfından üretseydik çalışmayacaktı.

        // Polymorphism(Çok biçimlilik)
        // static polymorphism
        var mathematics = Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(3, 4))
        println(
            mathematics.sum(
                3,
                4,
                7
            )
        )  //Aynı sınıftan üretilen sum fonksiyonu 3 farklı sonuç verdi birden fazla bakış açısına sahip oldu.

        // -dynamic polymorphism
        var animals = Animals()
        println(animals.sing())

        var dog = Dog()
        println(dog.sing())

        /*Abstract(Soyutlama)
         soyutlama yöntemi belli sınıfların objesi oluşsun istemediğimiz zaman o sınıf abstract olarak tanımlamamız yeterlidir

         Interface
         Ancak İnterface yöntemi bize iki farklı sınıftan özelliikleri inheritance yapmamıza olanak sağlar.*/

        var myPiano = Piano()
        myPiano.brand = "Yamaha"
        myPiano.digital = false
        println(myPiano.roomName)
        myPiano.info()

        // lambda expressions  -   fonksiyonun body olarak değil de direkt inputunu alıp outputunu veren ifadedir.

        fun printString(myString: String) {
            println(myString)    //Bu bildiğimiz bir gösterimdir.
        }
        printString("Function expression")

        val lambdaString = { myString: String -> println(myString) }
        lambdaString("Lambda String")  //Bu ise bir lambda gösterimidir.

        val multiplyLambda = { a: Int, b: Int -> a * b }
        println(multiplyLambda(4, 5))

        val multiplyLambda2: (Int, Int) -> Int = { a, b -> a * b }
        println(
            multiplyLambda2(
                4,
                5
            )
        )     // Aslında yukarıdaki multiplyLambda ile aynı işlemi yaptık.


        //asynchrnous   bazen aynı zamanda çalışmayan işlemler için gerekli olabilir lambda expressionlar.

        // özellikle internetten veri çekildğinde lazım olabilir. bunlar callbacks, completion function olarak da geçer.

        fun downloadFunction(url: String, completion: () -> Unit){
            //url
            //data
            completion()
        }
        downloadFunction("mert.com.tr",{
            println("completed.")                           // Bu şekilde kullanım yapmak demek bir indirme işlemi yapıldığını varsayalım tamamlandığında bize bir geridönüş sağlayacak fonksiyon.

        })

        fun showActor(url : String, completion : (Musicians)  -> Unit){
            // url
            //data
            val mert = Musicians("Mert",23,"Violin" )
            completion(mert)
        }
        showActor("adali.com",{
            println(it.age)   // completion içerisinde ne varsa onu yazdırabiliriz.
        })

        showActor("adali.com",{musicians ->
            println(musicians.age)                     // Yukarıdaki işlemin aynısı ancak gösterimi farklı ve daha yaygın olanıdır.
        })





    }
}