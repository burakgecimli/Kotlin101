package basics.kekod2022.lesson10
/**
 *  Daha okunaklı kodlar yazmak için kullanılır.
 *  .(nokta) ile kullanımını kaldırır.(Örneğin true.and(false) yerine true and false )
 *  Bir fonksiyonu infix hale getirmek için aşağıdaki şartlar sağlanmalıdır.
 *  1) infix keywordü ile başlar.
 *  2) Fonksiyon bir üye fonksiyon olmalıdır.(Bir sınıfa ait olmalıdır ya da extension function olmalıdır.)
 *  3) Sadece bir parametre almalıdır.Bu parametre "vararg" olamaz.
 *  4) İnfix metoduun parametresi default parametre olamaz.

 * ->Bir parametre alma sebebi true.or(false,true) bir infix çağırım olsaydı true or false true şekilinde okunarlığı bozuk bir kod olacaktı.
 *
 *   infix fun infixMethodName (justOneParam : AwesomeParamType) : WhateverType{
 *           ....
 *            }
 *
 *
 *
 *       //extension fonksiyonlar ile yazilma sekli.
 *      infix fun ReceiverClass.infixMethodName (justOneParam : AwesomeParamType) : WhateverType{
 *               ....
 *            }
 *
 *
 */
fun main() {

    val isStudent = false
    val isMale = true

    /**
     * and, or, xor gibi onlarca infix method vardir.
     * operatorlerde bahsedildi.
     */

    // ---- Değişkenlerde Kullanımı ----
    isStudent and isMale // infix
    isStudent.and(isMale) // normal


    // ---- Sınıflarda  Kullanımı ----
    val awesomeInstance = AwesomeClass() //class in nesnesini olusturup asagidaki gibi kullanabilirz.
    awesomeInstance downloadImage "www.picture.com" //infix kullanimi
    awesomeInstance.downloadImage("www.picture.com") // normal kullanim

    // infix methodlarin da mantik operatorlerine gore onceligi vardir.
    val number = 5
    if (number == 3 && number < 5 || awesomeInstance specialPlus 4 == 5) {

    }

    // matematiksel operatorlerin, tip donusumlerin (basics.kekod2022.lesson10.getType conversion), range kullanimin, infix methodlara karsi islem onceligi vardir.
    if (number + number - 2 * (awesomeInstance specialPlus 4) == 5) {

    }

    1 topla 2  // this(Int) = 1   x = 2
}

// infix fonksiyonlarin extensionlar ile birlikte kullanimi
//topla adinda infix fonksiyon yazip 2 sayiyi topluyoruz
infix fun Int.topla(x: Int): Int {
    return this.plus(x) //buradaki this Int'i niteliyor
}


class AwesomeClass {

    infix fun downloadImage(imageUrl: String) {

    }

    infix fun specialPlus(number: Int): Int {
        return 4
    }



    //---- Sınıf içinden sınıfa ait bir infix metodu çağırma ------
    fun logWhenImageDownloaded(imageUrl: String){
        downloadImage(imageUrl) // infix degil duz cagirim bu
        //downloadImage imageUrl   calismaz.
        this downloadImage  imageUrl // bu infixtir.   //AwesomeClass() downloadImage imageUrl     this = AwesomeClass()
    }


}


//---- Sınıf dışından sınıfa ait bir infix metodu çağırma ------

//bir sinifin disindayken infix method cagirimi yapilirsa this kullanilamaz
fun logWhenImageDownloaded(imageUrl: String){
    //this downloadImage imageUrl     calismaz. class disinda this isaret edecek bir sey bulamaz.

    //class nesnesini vererek kullanabiliriz.
    AwesomeClass() downloadImage imageUrl
    AwesomeClass().downloadImage(imageUrl)
}













