package basics.kekod2022.lesson04

fun main() {


    /**
     * Implicit Type Conversion : Örtülü - belirgin olmayan şekilde tip dönüşümü.
     * Explicit Type Conversion : Açık - belirgin tip dönüşümü.
     */


    /**
     * Kotlin'de implicit basics.kekod2022.lesson10.getType conversion yoktur.
     */

    // val number:Int=(Int) 3L çalışmaz. Comment'i kaldır kontrol et istersen.

    /**
     * Tip dönüşümü için kullanabileceğimiz fonksiyonlar:
     *  toByte(), toShort(), toInt(),toLong(), toDouble() toFloat(), toChar(), toString()
     *  toUByte(), toUShort(), toUInt(), toULong(), toDuration(), toBigDecimal(), toBigInteger()
     */

    //------------------------------------------------------------------------------------------------------------------

    /**
     * 2.Numbers.kt dosyasının içerisindeki değişken tiplerinin değer aralıklarını inceleyiniz.
     * Değer aralığı küçük olan tipler büyük olan tiplere, sorunsuz, açık olarak (explicit) dönüşür.
     */

    val schoolNumber = 126.toByte()
    val convertedValue: Short = schoolNumber.toShort()

    println("schoolNumber: $schoolNumber")
    println("convertedNumber: $convertedValue")


    //------------------------------------------------------------------------------------------------------------------

    /**
     *      Numbers.kt içerisindeki değişken tiplerinin değer aralıklarını inceleyiniz.
     *      Değer aralığı büyük olan tiplere açık olarak (explicit) dönüştürülürken,
     *      Üst tipten bir değişkenin değeri,alt tipin değer aralığından pozitif yönden fazla büyük,
     *      Negatif yönden fazla küçük ise bu tip dönüşümü sırasında yanlış değer atamaları yapılacaktır.
     */

    val tcIdentityNumber = 15860826657
    val convertedInt = tcIdentityNumber.toInt()
    println(convertedInt)

    /**
     * Kapalı(implicit) tip dönüşümü olmasa bile,iki number tip arasında matematiksel işlem yapılırsa,
     * sonuç değeri çıkan değerin tipinde olacaktır.
     */

    val totalValue: Long = tcIdentityNumber + schoolNumber // Long + Byte = Long
    val someValue = 127 + 127 // Byte değil, short değil int olacak. sameValue:254
    val integerValue = 256.toShort() + 4.toByte() // short + byte =(int)

    // -----------------------------------------------------------------------------------------------------------------

    /**
     * Kotlin'in sağladığı yukarıdaki tip dönüşümlerinin yanında,String to Number dönüşümler için
     * Java'dan aşina olduğumuz tip dönüşümlerini de kullanabiliriz.
     * Bunun için ilgili tiplerin Java versiyonlarını kullanmalısınız.
     */

    val byte: String = "3"
    val intValue = Integer.parseInt(byte)
    println(intValue)

}