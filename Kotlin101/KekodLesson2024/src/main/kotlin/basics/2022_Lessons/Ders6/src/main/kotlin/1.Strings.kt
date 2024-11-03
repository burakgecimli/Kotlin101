fun main() {


    /**
     *      Çift tırnak içerisine yazılan karakterler bütünüdür.
     *      Bir String ifadenin tüm karakterlerini tek tek alıp Char bir listeye atabilirsiniz.
     *      Ya da ekrana yazdırabilirsiniz.
     */

    val name: String = "Kekod"
    val char1 = 'K'
    val char2 = 'E'
    val char3 = 'K'
    val char4 = 'O'
    val char5 = 'D'

    val nameArray = arrayOf(char1, char2, char3, char4, char5)

    for (char in name) {
        println(char)
    }

    val awesomeKekod = "Kekod is Awesome"
    val firstCharOfAwesomeKekod = awesomeKekod[awesomeKekod.indices.first]
    val lastCharOfAwesomeKekod = awesomeKekod[awesomeKekod.indices.last]
    
    for (i in 0..awesomeKekod.length-1){
        println(awesomeKekod[i])
    }


// ------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     *      Farklı bir tipte ki bir değişkenin önüne String bir değişken ya da ifade koyarak toplarsanız,sonuç String olur.
     *      Ancak String bir değişken ya da ifadenin sonuna, + operatörü ile faklı tipte bir değişken eklersiniz, kod çalışmaz
     */

    val numbersValue: String = "value" + (4 + 2 + 8)
    //  val numbersValue2: String = (4 + 2 + 8) + "value" Çalışmaz Comment'i kaldır kontrol et.

    /**
     * Herhangi bir değişken + operatörüne ihtiyaç duyulmadan direkt olarak "" arasına yazılarak kullanılabilir.
     * Bunun için sadece $ işaretine ihtiyacınız vardır.Bu yapıya String template denir.
     * Eğer değişkenin bir özelliğine ihtiyaç duyacaksınız ${} şeklinde kullanılır.
     */
    println("numbersValue: $numbersValue")
    println("numbersValue: ${numbersValue.length}")


    /**
     *      3 tane çift tırnak kullanarak Raw String oluşturulabilir.
     *      Row String'ler nasıl yazılıyorsa öyle kullanılır.Hizalamada bozulma olmaz.
     *      trimIndent() fonkiyonu ile bu Row String'in kenar boşluklarını silebilirsiniz.
     *      Bu silme işlemini yaparken tüm satırlardaki en soldaki karakteri baz alarak silme işlemini
     *      Alttaki örnek için 3 satırdan da $ işaretinin solundaki boşluğa kadarını siler.
     *      Row Stringlerin içinde escape karakterler çalışmaz.
     */

    val rowPineTree = """
                *
               ***
              *****
    """.trimIndent()

    println(rowPineTree)


    /**
     *      trimMargin(marginPrefix) ise verilen karakter ne ise, string satırlarındaki o karaktere kadar boşluğu sileriz.
     *      Yukarıdan farklı olarak bu karakter tek bir satırda ise,sadece o satırın o karaktere kadar siler.
     *      trimMargin() ise karaktere bakmadan tüm satırların en solundakini baz alıp,
     *      tüm satırlardan o  değerin solundaki boşluk kadar boşluk siler.
     */

    val rowPineTree2 = """
                  *
        /        ***
        /       *****
    """.trimMargin("/")

    println(rowPineTree2)


}
