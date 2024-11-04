package functions

/**
 *  Bir fonksiyon herhangi bir sınıfın içerisinde değil de bir dosyanın içerisinde tanımlanır.
 *  top level functino adını alır.
 *
 *  Bir fonksiyon oluşturulurken top level tanımlama yapılamıyor.Sadece bir sınıfa ait fonksiyonlar yazılıyorsa
 *  bunlara fonksiyon değil,method denir.Bir fonksiyona fonksiyon diyebilmemiz icin top level tanimlaniyor olmasi lazimdir.
 */


fun main() {
    calculateAtomPhysics()

    fun calculateAtomPhysics2() {

    }

    val demo = Demo()
    demo.demoFunction() //  Görüldüğü üzere sadece sınıfın üye değişkenine erişilebildi.
    //localFunction() reflection yapısı ile bile erişemeyiz.


}

fun calculateAtomPhysics() {

}

/*-------------------------------------------------------------------------------------------------------------*/

/**
 *  Fonksiyon içerisinde fonksiyon tanımı Kotlin'de yapılabilir.Bu fonksiyonlara Local Functions denir.
 *  Sebebi ise, yazdığımız fonksiyonun kendi sınıfınızdan dahi çağrılmamasını isteyebiliriz.
 *  Bu fonksiyonun herhangi bir başka fonksiyon ya da sınıf için değiştirilmesini isteyebilirsiniz.
 *  Reflection ile de bu fonksiyonlarımıza erişemeyiz.
 *  Bu gibi durumlarda bu çok önemli fonkisyonunuzu başka bir fonksiyon içerisine
 */

class Demo() {
    fun demoFunction() {
        fun localFunction() {

        }
    }
}

class PrivateA() {
    private fun commonFunciton() {
        fun localFunction() {

        }
    }

    // localFunction() ne bu sınıf içerisinde çağırabiliriz ne de bu sınıf dışında herhangi bir yerde çağırabiliriz.

    fun secondFun() {
        commonFunciton()

    }
}


