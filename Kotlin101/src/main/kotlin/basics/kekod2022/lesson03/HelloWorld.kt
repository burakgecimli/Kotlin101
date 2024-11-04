package basics.kekod2022.lesson03

fun main() {
    println("Hello World")


// HelloWorld.kt dosyasına gelip sağ tıklayıp Open in /Explorer dersek dosyanın konumunu açarız.


    fun main(args: Array<String>) {
        println("Hello World")
    }

// Tekil Yorum Satırı

    /*
  Çoklu Yorum Satırı
*/

    /**
     * Dokümantasyon Yorum Satırı @param args program argüment'lerini tutar.
     */

    /*
TODO (Burak) burası daha sonra düzeltilecektir.
Technical debt(Teknik Borç) yani yazdığımız bir kodun daha iyi yazılacağını düşünüyorsak (Code Smell) olan
ancak zaman olarak sıkıntımızın olduğu durumlarda bu comment'i kullanarak kodu daha müsait bir zamanda düzeltmek için kullanırız.
 */


    /**
     * Kotlin ve Java dilleri JVM tabanlı dillerdir.Kodu yazıp Run tuşuna basınca kodumuzu Bytecode'a dönüştürür.
     * Bytcodeları görmek için(Intellij Idea için) "Shift Shift" kısayolunu kullanırız.
     * Açılan arama kısmına "Show Kotlin ByteCode" diyerek Bytecode'i görebiliriz.
     *
     */

//----------------------- VARIABLES -------------------------

    //value immutable
    //variable mutable
    val name: String = "Ayşe"
    var surName: String = "Aslan"

    println(name)
    println(surName)

    surName = "Kartal"
    //  name="Ahmet" Val cannot be reassigned

    println(name)
    println(surName)

    /**
     *  Değişken tanımlanırken default olarak "val" olarak başlatmalıyız.(Best Practice)
     *  "var" değişkenler "val" değişkenlere göre çok çok küçükte olsa daha performanslı çalışır.
     *  Ancak bir değişkeni "val" ile tanımlamaya özen göstermeliyiz.Çünkü çoklu bir işlem yaparken tek bir thread yerine multithread kullanılır.
     *  Bununda belirli bir maliyeti vardır.Çünkü threadlerin birbiri ile haberleşmesi,işlemi hızlandırır ancak bunun belirli bir maliyeti vardır.
     */

    val age=32  //Burada değişken değeri verilmiştir.
    val eyeColor: String   //Burada değişken tipi verilmiştir.
    eyeColor = "Green"

  /*  var skinTone  // This variable must either have a basics.kekod2022.lesson10.getType annotation or be initialized hatası alırız.
    skinTone="White"  --> Bir değişkeni tanımlarken ya tipini ya da değerini vermemiz gerekir.
   */

}


