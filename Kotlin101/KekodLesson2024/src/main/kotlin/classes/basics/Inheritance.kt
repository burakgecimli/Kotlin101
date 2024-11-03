package classes.basics

/**
 * Aralarında benzerlik bulunan sınıfları dolayısıyla da nesneleri,bu benzerlik ile beraber oluşturmakta kullanılır.
 * Yani bir sınıfın başka bir sınıftan özellik ve davranış miras almasına denir.Bu sayade kod tekrarı önlenir.
 *
 * Kotlin'de tüm sınıflar varsayılan olarak final'dir.Bu nedenle,bir sınıfın başka bir sınıfı miras almasını istiyorsak
 * sınıfın başına "open" anahtar kelimesini getiririz.
 *
 *
 *
 */

/**
 * open ve final:Sınıfların ya da fonksiyonların miras alınabilirliğini kontrol eden modifikasyonlardır.
 * Yani, bir sınıfın veya fonksiyonun başka sınıflar tarafından genişletilip genişletilemeyeceğini belirtirler.
 * Erişim düzenleyicileri(public,private) (access modifiers) değildir.
 * Kotlin’de sınıflar ve fonksiyonlar varsayılan olarak finaldir.
 * Bu, başka bir sınıf tarafından miras alınamayacakları veya override edilemeyecekleri anlamına gelir.
 */
open class Animal(val name: String = "", open var age: Int) {

    var feetCount: Int = 1

    open fun makeSound(): String {
        return ""
    }

    fun sleep() {

    }
}

class Dog(name: String, override var age: Int) : Animal(name, age) {
    override fun makeSound(): String {
        return "hav hav"
    }

}

/**
 * Cat sınıfında name "val/var" yaparsak neden hata verir?
 * Cevap:Sınıf parametrelerine geçilen parametlerin val/var ile tanımlanması bu değişkenlere sınıf içerisinde init dışından da
 * erişeceleceği anlamına gelir.Örneğin Dog sınıfında sadece "name" olarak tanımlanmış dog.name ile ulaşırsak bu Animal sınıfının name gider.
 * Ancak cat.name ile gidersek bu bizi Cat sınıfına götürür ve hem kendi içinde name oluşturur.
 *
 * Alt sınıfta val veya var ile bir özellik yeniden tanımlandığında, bu özellik sınıfın içinde yeni bir alan (property) olarak oluşturulur ve
 * böylece üst sınıftan gelen özellik ile aynı isimde iki farklı özellik oluşmuş olur.
 * Bu durumda, Cat sınıfındaki name ve Animal sınıfındaki name özellikleri çakışır ve bu nedenle Kotlin derleyicisi hata verir.
 *
 */
class Cat(name: String, override var age: Int) : Animal(name, age) {
    override fun makeSound(): String {
        return "miyav"
    }

    fun call(gokhan: Gokhan) {

    }

    fun call(baris: Baris) {

    }

    fun call(person1: Person1) {

    }

}

open class Person1
class Gokhan : Person1()
class Baris : Person1()


fun main() {
    val dog = Dog("Emily", 1)
    val cat = Cat("Tekir", 2)
    dog.name
    cat.name
    println(dog.makeSound())
    println(cat.makeSound())
    //  val animal: Animal = Dog("ds",2)
    // animal.makeSound()
}