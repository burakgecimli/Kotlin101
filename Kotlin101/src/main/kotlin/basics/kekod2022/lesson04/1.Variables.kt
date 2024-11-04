package basics.kekod2022.lesson04

fun main() {

    /*
     Variable Types :
     Numbers(Byte,Short,Int,Long,Double,Float) & Unsigned Types
     Characters
     Booleans
     Arrays
     String
     Decimals[0-9]
     Octals -> Kotlin tarafından desteklenmiyor.
     Binary[0-1]
     Hexadecimals[0-9A-Fa-f]
     -------------------------------------------------------------------------------------------------------------------------------------------------
     */


    val number: Int? = null // Kotlin'de tanımladığımız primitive değişken "nullable" olursa primitive özelliklerini kaybederek "referans tipli değişkene" dönüşür.
    

    /**
     *      Kotlin'de primitive direkt olarak tanımlanamazlar.
     *      Ancak verdiğimiz program makina koduna derlenirken primitive tiplere dönüştürülür.
     *      Eğer değişken "nullable" veya "generic" olarak tanımlanırsa referans tipli olarak dönüştürülür.
     *      Değişken nullable olsa bile hiç null değeri ataması yapılmazsa yine primitive tip olarak dönüştürülür.
     *      Bundan dolayı Java'dan farklı değildir.
     *      Kontrol etmek için:
     *      1-Bir programı çalıştırın
     *      2-Ctrl + Shift + basics.kekod2022.lesson09.A -> Show Kotlin Bytecode
     *      3-İsterseniz decompiler diyerek Java kodundaki  karşılığını da görebiliriz.
     */


    //---------------------------------------------------------------------------------------------------------------------------------------


    /**
     *      Multithread programlama yaparken performans artışı sağlamak için olabildiğince val değişken kullanmalıyız.
     *      Best Practice olqrak alışkanlığımız değişkenleri val tanımlama şeklinde olsun.
     *      Eğer değişkenin değerini sonradan değiştirmek gerekirse var yaparız.
     */

    val immutableVariable: String = "Değişemez değişken"
    var mutableVariable: String = "Değişebilir değişken"


    //  immutableVariable="val ifadesi ile tanımlanan değişkenin değeri değiştirilemez.Comment'i kaldır kontrol et."
    mutableVariable = "var ifadesi ile tanımlanan değişkenin değeri değiştirilebilir."


    /**
     *  Değişken tanımı sırasında değer ataması yapılırsa,değişken tipi gereksizdir.
     */

    val name = "Burak" // Kotlin tip çıkarımını destekler. (Type Inference) -> String
    val age = 24      // Kotlin tip çıkarımını destekler. (Type Inference) -> Int


    /**
     *      Değişken tanımı yapıldıktan sonra atama yapılabilir.
     */

    val surName: String
    surName = "Geçimli"


    /**
     *  Ancak değer ataması sonradan yapılacaksa değişken tipi belirtilmelidir.
     *  Aşağıdaki kod çalışmaz.Comment'i kaldır ve kontrol et
     */

    //   val middleName
    //    middleName="Geçimli"

}
