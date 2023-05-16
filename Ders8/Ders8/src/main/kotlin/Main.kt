fun main(args: Array<String>) {


    /*
    Java ve diğer programlama dillerinden farklı olarak, Kotlin'de geleneksel bir for döngüsü yoktur.
    Kotlin'de for döngüsü string, range ve sayılabilir sayıda değer içeren,
    arrays diğer şeyler arasında döngü yapmak için kullanılır.

    Kotlinde for dongusu in ile kullanilir.
     */

    /**
     *  3 farkli sekilde for tanimlayabiliriz.
     *  value in list                           seklinde value degerlerini alabiliriz
     *  index in list.indices                   seklinde index degerlerini alabiliriz
     *  (index,value) in list.withIndex()       seklinde index,value degerlerini alabilirz.
     */

    for (value: Int in 1..10) {
        println(value)
    }

    val countryCode = arrayOf("tr", "az", "uk", "fr")

    println("-------------------------------------------")

    for (value: String in countryCode) {
        println(value)
    }
    println("-------------------------------------------")

    for (index in countryCode.indices) {
        println("$index. index değeri=${countryCode[index]}")
    }
    println("--------------------------------------------")

    val arrayNumbers = arrayOf(1, 2, 3, 4, 5)
    for ((index, value) in arrayNumbers.withIndex()) {
        println("$index. değeri=$value")
    }

    /**
     * https://kotlinlang.org/docs/destructuring-declarations.html
     */

    //For each kullanımı
    countryCode.withIndex().forEach {
        println("${it.index}.index=${it.value}")
    }


    /**
     *  repeat(siz) şeklinde herhangi bir listeye ihtiyac duymadan tekrarlayan işler yapılsbilir.
     */

    repeat(10) {
        println("$it.index=Daha Çok Blok Yazmam Lazım")
    }

//--------------------------------------------------------------------------------------------------------
    /**
     * break kullanarak ilgili sart saglanirsa, donguden cikabilirsiniz.
     * continue kullanarak ilgili sart saglanirsa, donguye o degeri atlayarak devam edebilirsiniz
     */

    for (value: Int in 1..100) {
        if (value % 2 == 1) {
            continue // sayi tek ise print etmez
        }
        println(value)
    }

    for (value in 1..50) {
        if (value % 2 == 0) {
            break  // if icindeki sart saglanirsa donguden cikar
        }
        println(value)
    }

    //------------------------------------------------------------------------------------------------------

    /**
     * ic ice for donguleri kullnaiyorsak bir ustteki for a degil de iki ustteki uc ustteki for a donmek istiyorsak
     * label kullanabiliriz. bunun icin labelname@ ifadesini ilgili for un onune yazip. return ya da continue yapacagimiz
     * yere ise @labelname seklinde yazmamiz yeterlidir.
     * labelleri continue ve break operatorleri ile kullanbiliriz.



    for (value in 1..10) {
        for (value1 in 1..5) {
            if (value1 == 2) {
                continue
            }
            print("\n$value,$value1")
        }
    }
     */

    returnlabel@ for (value in 1..5) {
        for (value1 in 1..5) {
            if (value1 == 2) {
                continue@returnlabel
            }
            print("\n$value,$value1")
        }
    }


}