package basics.kekod2022.lesson06

fun main() {


    /**
     * Sonlu sayili liste olusturmaya yarar.
     * Kucukten buyuge liste olusturmak icin .. operatorunu, ya da rangeTo() fonksiyoununu kullanabiliriz.
     */

    val numbers = 1..100 //[1,100]
    val numbers2 = 1.rangeTo(100)//[1,100]

    //-----------------------------------------------------------------------------------------------------------------------------------------

    /**
     * Charlar'dan oluşan bir liste de tanımlanabilir.Turkce karakterleri icermez.
     */

    val alphabet = 'A'..'Z'


    //-----------------------------------------------------------------------------------------------------------------------------------------

    /**
     * Buyukten kucuge .. operatorunu kullanarak liste oluturamayiz.Ide hata verir.
     * Buyukten kucuge downTo() fonksiyonunu kullanabilirsiniz.
     */

    //  val reversedNumbers = 100..1  Calismaz.Comment'i kaldır kontrol et istersen.
    val reversedNumbers = 100.downTo(1)
    val reversedNumbers2 = 100..1
    println("reversedNumbers")
    reversedNumbers.forEach { println(it) }

    //-------------------------------------------------------------------------------------------------------------------------------------------

    /**
     *      until fonksiyonunu kullanarak da range tanimalanabilir.Ancak bu durumda bitiş değeri dahil değildir.
     */
    val gradeNumbers = 10.until(100) //[10,100)
    val gradeNumbers2 = 10.rangeTo(99)
    val gradeNumbers3 = 10..99
    print("gradeNumbers")
    gradeNumbers.forEach { print(" $it") }
    println()
    //--------------------------------------------------------------------------------------------------------------------------------------

    /**
     *      step fonksiyonu kullanarak liste oluşturulurken belli sayıda atlamalar yapabilirsiniz.
     */

    val stepedNumbers = 1..101 step (2)
    val stepedNumbers2 = 1..100 step 3
    print("stepedNumbers")
    stepedNumbers.forEach { print(" $it") }
    println()

    val reversedStepedNumbers = 100 downTo 1 step (3)
    val reversedStepedNumbers2 = 100.downTo(1) step 2
    print("reversedStepedNumbers")
    reversedStepedNumbers.forEach { print(" $it") }
    println()

    //-------------------------------------------------------------------------------------------------------------------------------------------

    /**
     *      CharRange,IntRange gibi primitive tiplerle de range tanımı yapılabilir.
     *      Bu durumda first,last,step,count gibi ek bilgiler alınabilir.
     */


    val numberList: IntRange = 10 until 90
    numberList.first
    numberList.last
    numberList.step

    when (10) {
        in numberList -> {
            println("10 sayisi numberlist içerisinde yer alir.")
        }

        !in reversedNumbers -> {}
    }
    numberList.count()

    val countBiggerThan50 = numberList.count { it > 50 }
    println(countBiggerThan50)

    println("numberList.average ${numberList.average()}")
    println("numberList.reverse ${numberList.reversed()}")


}