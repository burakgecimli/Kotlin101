package classes.basics


class Turtle(var name: String = "Tosbik", feetCount: Int = 4, var age: Int) {
    val feetColor: String = "Brown"
    val headCount: Int = 1
    val headColor: String = "Brown"
    val shelterColor: String = "Green"
    val sex: String = "Female"
    val isMarried: Boolean = true

    //Primary constructorun body'sidir.
    init {
        println("Primary Constructor created.....")
    }

    constructor(name: String = "ffd", feetCount: Int = 4, tailCount: Int, isMarried: Boolean = true) : this(
        name,
        feetCount,
        tailCount
    ) {
        println("Secondary Constructor created.....")
    }

    fun makeASound(): String {
        return "htjtjjt"
    }

    fun eatMeal() {

    }

    fun walk() {

    }


}

/**
 * Eğer bir sınıf primary constructora sahip olmayıp secondary constructora sahip olup bunu this ile
 * işaret etmese bile init bloğu ilk çalışacaktır.Çünkü arkada Default boş bir Primary Constructor oluşuyor..
 */

class NoPrimaryConstructor {
    init {
        println("Primary Constructor Created")
    }

    constructor(name: String) {
        println("Second Constructor Created")
    }
}

class Person(firstName: String, lastName: String = "Geçimli") {

    init {
        println("Primary Constructor Created")
    }

    //Secondary constructor primary constructorun default olmayan tüm değerlerini içermek zorundadır.
    //Örneğin Primary constructor içinde lastName in bir default değeri olduğu için lastName olmak zorunda değil..
    constructor(firstName: String = "Ayşe", age: Int) : this(firstName) {

    }
}

class Product(val productId: Int, productTitle: String) {
    init {
        // İnit bloğu içerisinde val veya var ile tanımlanmış olsun
        // olmasın iki değişkene de ulaşabiliriz.
        productTitle
        productId
    }

    fun printTitle() {
        productId
        //    productTitle -> Ama val/var ile tanımlanmamış değişkene init dışında hiçbir yerden ulaşamayız.
        //    Bu yüzden constructorda  değişkenleri başında val/var ile tanımlanır.
    }
}

//  Soru data classlarda değişkenleri neden val/var ile tanımlamak zorundayız?
data class User(val userName: String) {
    //  Çünkü bu sınıfların otomatik olarak equals(), hashCode(), toString(), ve copy() gibi fonksiyonları oluşturması sağlanır
   //  ve bu işlevlerin sağlıklı çalışması için temsil ettikleri veriyi içermeleri gerekir.Yani yukarıdaki gibi bu metotlar bu değişkene
  //  ulaşabilsin ki bu fonksiyonlar işlemlerini yapabilsin?

}

// Eğer primary constructor’a bir erişim belirleyici (örneğin private, protected) eklemek istiyorsanız,
// constructor anahtar kelimesini kullanmak zorundasınız.
// primary constructor’a bir annotation eklemek istiyorsanız, constructor anahtar kelimesini kullanmak zorundasınız.
class Customer private constructor(name: String) {


}


fun main() {

    val turtleOne = Turtle(age = 5)
    val turtleTwo = Turtle("Murtle", age = 10)
    turtleOne.name = "Murtle"

    // Aşağıdaki kod secondary constructora uygun yazılmıştır.Run edilince ilk olarak primary constructor
    // sonra ise Secondary Constructor oluşturulacaktır.
    val turtleThree = Turtle("Ninja", 5, 2, true)

    val noPrimaryConstructor = NoPrimaryConstructor("hello")



}
