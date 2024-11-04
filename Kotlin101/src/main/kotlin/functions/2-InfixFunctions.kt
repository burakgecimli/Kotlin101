package functions

/**
 *  Daha okunaklı kodlar yazmak için kullanılır.
 *  .(nokta) kullanımı kaldırır.
 *  Bir fonksiyonu infix hale getirebilmek için 5 şart vardır.
 *  1.  infix keywordu ile başlar.
 *  2. fonksiyon bir üye fonksiyon üye fonksiyon olmalıdır.(bir sınıfa ait olmalıdır)
 *  3. Ya da bir extension fonkisyon olmalıdır.
 *  4. sadece bir parametre olmalıdır.Bu parametre vararg olamaz!!
 *  5. infix methodunun parametresi default değer olamaz.
 *
 *  Yapısal olarak;
 *
 *      infix fun infixMethod(justOneParam:AwesomeParam):Whatever{
 *      }
 *
 */

fun main() {
    val isStudent = false
    val isMale = true

    /**
     *  and,or,xor gibi onlarca infix method vardır.
     */

    if (!isStudent and isMale) {
        println("Öğrenci olmayan Erkek")
    }

    isStudent.and(isMale)
    isStudent and isMale // İnfix kullanımı


    val awesomeInstance = AweSomeClass()
    awesomeInstance.downloadImage("www.google.com.tr")
    awesomeInstance downloadImage "www.gooole.com.tr" // infix kullanımı


    /**
     * Not:" infix methodunun parametresi default değer olamaz." dedik bunun nedeni ise awesomeInstance classına baktığımızda
     * default parametre alabilen bir fonksiyona baktığımızda o fonksiyonu downloadImage(),downloadImage("www.google") şeklinde de
     * çağırabiliyoruz.
     *
     */

    // ---------------------------------------------------------------------------------------------------------------

    val number = 5
    /*
        matematiksel operatörlerin, tip dönüşümlerin (basics.kekod2022.lesson10.getType conversion),range kullanımının,infix metodlara
        karşı işlem önceliği vardır.
     */

    if (number + number - 2 * (awesomeInstance specialPlus 4) == 5) {

    }

    // infix methodların da mantık operatörlerine göre önceliği vardır.
    if (number == 3 && number < 5 || awesomeInstance specialPlus 4 == 5) {

        // 5==3 && ||
        // 5==3 && 5<5 || 4==5
        // false && false || false
    }


}


class AweSomeClass {
    infix fun downloadImage(url: String) {


    }

    infix fun specialPlus(number: Int) = 1

    //çalışmaz.Comment'i kaldır kontrol et
    /*
      infix fun <T> downloadImage2(vararg mageUrl: T) {

    }
     */

    // --------------------------------------------------------------------------------------------------------

    // bir sınıfın içindeyken this kullanımı size bulunduğu sınıfı işaret eder.
    // aşağıdaki kullanımında AweSomeclass().downloadImage(imageUrl) kullanımı oluşur aslında. (implicit)

    fun logWhenImageDownloaded(imageUrl: String) {
        downloadImage(imageUrl)

        this downloadImage imageUrl
    }


}

//bir sınıfın dışındayken infix method çağrımı yapılırsa this kullanılamaz.
fun logWhenImageDownloaded1(imageUrl: String) {
   // this downloadImage imageUrl
}

