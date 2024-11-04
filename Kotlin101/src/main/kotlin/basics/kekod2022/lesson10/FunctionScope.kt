package basics.kekod2022.lesson10

fun main() {

    /*
        -> Bir fonksiyon herhangi bir sınıfın içersinde değilde bir dosyanın içerisnde boşlukta tanımlanıyorsa
           top level function adını alır.

        -> Bir fonksiyona fonksiyon demek için top level function olmalıdır.Aksi takdirde metoddur.

     */

    calculateAtomPhysics()
    // getValuesFromUserAndPrint() ->Erişemeyiz.

}

//----------------------------------------------------------------------------------------------------------------------

/**
 *  Fonksiyon içinde fonksiyon tanımı Kotlin'de yapılabilir.Bu fonksiyonlara Local Function denir.
 *  Sebebi ise yazdığımız fonsksiyonların kendi sınıfında dahi çağrılmamasını istemeyebiliriz.
 *  Bu fonksiyonunun herhangi bir sınıf içerisinde veya bir fonksiyon tarfından değiştirilmemesini isteriz.
 *  Reflection ile fonksiyonlarımıza erişilirken gizli kalmasını isteyebiliriz.
 *  Bu gibi durumlarda  bu çok önemli fonksiyonumuzu başka bir fonksiyon içine yazabiliriz.
 */

fun calculateAtomPhysics() { //Bu "basics.kekod2022.lesson10.calculateAtomPhysics" fonksiyonu private olsa bile reflection ile erişebiliriz.
    val userName = "Codemy"
    println("Initialize Process...")

    fun getValuesFromUserAndPrint() {  //Ancak bu local functiondur, reflection yapsak bile erisemeyiz.
        userName.length
        val numberOne = readln().toInt()
        val numberTwo = readln().toInt()
        val result = numberOne + numberTwo
        println("$result")
    }

    getValuesFromUserAndPrint()

    println("Process has been done")
}

//----------------------------------------------------------------------------------------------------------------------


// Üye Fonksiyonlar: Bir sınıfın içindeki fonsksiyonlara denir.
class Car {
    fun setColor(colorId: Int) {

    }
}

//----------------------------------------------------------------------------------------------------------------------

//  Generic Fonksiyonlar:Bir fonksiyon Generic tip alıyorsa,Generic Funciton olarak adlandırılır.
//  Değişken tipi bilinmediği veya değişken tipi birden fazla değer alıyorsa genericler kullanılır.

fun <T> setColor(colorId: T) {

   
}















