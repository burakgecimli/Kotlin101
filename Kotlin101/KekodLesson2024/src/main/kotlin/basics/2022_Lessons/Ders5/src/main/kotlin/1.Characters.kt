fun main() {

    /**
     *  Tek tırnakların arasına,harf,sayı,escape char ya da unicode yazarak kullanılır.
     *  Çift tırnak içerisine yazılırsa String olur, Char olmaz.
     */

    val firstCharOfName: Char = 'G'
    // val firsCharOfName2: Char = "G"  type mismatch
    //  val firsCharOfName3: Char = 'Gö'

    val charNumber: Char = '6'
    // val charNumber2: Char = '53' Sayıda olsa tek bir karakterden oluşmalıdır.

//-------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     *      Number değer alan bir Char değişken Int'e çevrilirken,greçek sayısal değerini almaz.
     *      Alacağı değer ASCII tablosundaki o sayısal değerin karşılığı olacaktır.
     */

    val contertedCharNumber = charNumber.toInt()
    println(charNumber)
    println(contertedCharNumber)

    val totalValue = charNumber.toInt() + contertedCharNumber
    println("Total Value: $totalValue")

// -----------------------------------------------------------------------------------------------------------------------------------------------

    /**
     *  Kaçış(Escape) karakterlerin de tanımlamak için kullanılır.
     */

    val escapeCharT: Char = '\t' // tab bırakmak için
    val escapeCharN: Char = '\n'  // alt satıra geçmek için
    val escapeCharB: Char = '\b' // backspace için
    val escapeCharR: Char = '\r' // satır başı
    val escapeChar1: Char = '\'' // ' özel karakterini kullanmak için
    val escapeChar2: Char = '\"'  // " özel karakterini kullanmak için
    val escapeCharSlash: Char = '\\' // \ özel karakterini kullanmak için
    val escapeCharDolar: Char = '\$' // $ özel karakterini kullanmak için

    val loremImpsum = "Lorem ImpsumT $escapeCharT " +
            "EscapeCharN: $escapeCharN" +
            "EscapeCharB: $escapeCharB" +
            "EscapeCharR: $escapeCharR" +
            "EscapeChar1: $escapeChar1" +
            "EscapeChar2: $escapeChar2" +
            "EscapeCharSlash: $escapeCharSlash" +
            "EscapeCharDolar: $escapeCharDolar"

    println(loremImpsum)


}