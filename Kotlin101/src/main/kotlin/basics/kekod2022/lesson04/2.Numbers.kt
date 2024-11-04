package basics.kekod2022.lesson04

fun main() {

    /**
     *      Type    |   Size(bits)  |   Min Value                             |     Max value
     *      ------------------------------------------------------------------------------------------------------------
     *      Byte    |   8 Bit       |   -128                                  |     127
     *      Short   |   16 Bit      |   -32768                                |     32767
     *      Int     |   32 Bit      |   -2,147,483,648 (-2^31)                |     2,147,483,647 (2^31-1)
     *      Long    |   64 Bit      |   -9,223,372,036,854,775,808 (-2^63)    |     9,223,372,036,854,775,807 (2^63-1)
     */

    /**
     *      Type    |   Size(bits)  |   Significant bits    |   Exponent bits   |   Decimal digits
     *      ------------------------------------------------------------------------------------------------------------
     *      Float   |       32      |           24          |        8          |       6-7
     *      Double  |       64      |           53          |        11         |       15-16
     */
//----------------------------------------------------------------------------------------------------------------------
    /**
     * Değişkene değer ataması yapılırken maksimum preformans almak  için doğru değişken tipini kullanmak önemlidir.
     * Bunun için değişkenlerin değer aralıklarını yukarıdan kontrol edebilirsiniz.
     * Tip Çıkarımı (Type Inference) sırasında eğer sayı Int ifadeden büyük  değilse tipi default olarak Int set edilir.
     * Tip Çıkarımı (Type Inference) sırasında eğer sayı Int ifadeden büyükse tipi default olarak Long set edilir.
     */

    val minByteValue: Byte = Byte.MIN_VALUE
    val maxByteValue: Byte = Byte.MAX_VALUE

    val minShortValue: Short = Short.MIN_VALUE
    val maxShortValue: Short = Short.MAX_VALUE

    val minIntValue: Int = Int.MIN_VALUE
    val maxIntValue: Int = Int.MAX_VALUE

    val minLongValue: Long = Long.MIN_VALUE
    val maxLongValue: Long = Long.MAX_VALUE

    println("-------------------------------------------------------")
    println("Byte Min Value= $minByteValue")
    println("Byte Max Value= $maxByteValue")
    println("Short Min Value= $minShortValue")
    println("Short Max Value= $maxShortValue")
    println("Int Min Value= $minIntValue")
    println("Int Max Value= $maxIntValue")
    println("Long Min Value= $minLongValue")
    println("Long Max Value= $minLongValue")
    println("-------------------------------------------------------")


    /**
     *      Long            değişkenler için sayının sonuna "L" konularak değer ataması yapılabilir.
     *      Float           değişkenler için sayının sonuna "F" veya "f" konularak değer ataması yapılabilir.
     *      Double          için geleneksel gösterim desteklenir.
     *      Decimal         tanımı yapılabilir.     [0-9]
     *      Oktal           tanımı yapılabilir.     [0-7]
     *      Hexadecimal     tanımı yapılabilir.
     *      Binary          tanımı yapılabilir.     [0-1]
     */

    val longNumber = 1586L
    val floatNumber1 = 19.90F
    val floatNumber2 = 13f
    val doubleNumber = 3.14
    val doubleNumber2 = 3.14e10
    val decimalNumber = 1907
    // val octalNumber=0917  Çalışmaz Comment'i kaldır ve kontrol et istersen
    val hexadecimalNumber = 0x759
    val binaryNumber = 0b01000011

    /**
     *  Number değişken tanımı yapılırken underscore "_" kullanılabili
     */

    val oneMillion = 1_000_000
    val creditCardNumber = 1_234_456_789_1234L
    val bytes = 0b01000011_01101111_01100011_0111101

    /**
     *  Boxed: Değişkenin obje referansı olarak tutulmasıdır.
     *  Unboxed: Değişkenin primitive olarak tutulmasıdır.
     *  === : operatörü değişkenin referansını karşılaştırırken kullanılır.
     *  == : operatörü değişkenlerin değerini karşılaştırırken kullanılır.
     */

    val number: Int = 1000 // Int
    println(number === number) //true değerini verir.
    val boxedNumber: Int? = number
    val anotherNumber: Int? = number //Nullable değerlerde boxed olarak tanımlanır.
    println(boxedNumber === anotherNumber) // false değerini verir.

    val number2: Int = 10000
    println(number2 == number2) //true değerini verir.
    val boxedNumber2: Int? = number2
    val anotherNumber2: Int? = number2
    println(boxedNumber2 == anotherNumber2) //true değerini verir.


    /**
     *       Backend'den dönen Double ve Float değerleri kullanırken dikkatli olmalıyız.
     *       Eğer backend'ten dönen değer üzerinde "." işaretine göre bir split işi yapacaksınız başınız ağrıyabilir.
     *       Çünkü Backend'ten dönen Double ve Float değişkenleri her zaman "." ile ayrılmıyor olabilir.
     *       Database dilinin farklı olmasına göre (türkçe-ingilizce gibi ) "." yerine ","ile de ayrışıyor olabilir.
     */

}
