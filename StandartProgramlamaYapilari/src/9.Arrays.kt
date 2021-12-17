fun main() {
    /*
        • Çoklu değişken oluşturmak gibi düşünebilirsiniz.
        • Sabit boyutlu bir yapıdır.Baştan ne kadar boyutu olduğu bellidir
        • Indeks numaralarına göre veriler eklenir.
        • İlk indeks numarası 0’dan başlar.
        • Mutable yapıdadır.
        • Hem okunabilir hem üzerinde işlem yapılabilir.
     */

    //Tüm Elemanları 0 dan oluşur.
    val arr = Array<Int>(5) { 0 }
    println(arr.contentToString()) //Dizi içeriğini gösterir.
    println("------------------------")

    val arr2 = arrayOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(arr2[0])
    println(arr2[1])
    println(arr2.get(2))
    println(arr2.contentToString())
    println("---------------------------")

    //arrayOf kullanımı dinamik olmadığı için diziye ekleme yapamayız.Sadece var olan dizi üzerinde değişiklikler yapabiliriz.
    val arrFruit = arrayOf<String>("Elma", "Muz", "Kivi", "Çilek")
    println(arrFruit[0])
    println(arrFruit.get(arrFruit.size - 1))
    println(arrFruit.contentToString())

    arrFruit[1] = "Şeftali"
    println(arrFruit.contentToString())

    arrFruit.set(2, "Portakal")
    println(arrFruit.contentToString())


    println("---------------------------")

    val arrAny = arrayOf<Any>("Burak", 12, 25.3, true)
    println(arrAny.contentToString())

    println("---------------------------")
    // *** Bazı array metodları ***
    println(arrFruit.isEmpty()) // boş olup olmadığını kontrol eder
    println(arrFruit.count())   // array boyutunu verir
    println(arrFruit.size)      // array boyutunu verir
    println(arrFruit.first())   // ilk elemanı verir
    println(arrFruit.last())   // son elemanı verir
    println(arrFruit.indexOf("Kivi")) // girilen String ifadenin hangi indexte olduğunu verir.
    println(arrFruit.contains("Şeftali")) // girilen String ifadenin array içerisinde var olup olmadığını kontrol eder.



    val numbers = arrayOf<Int>(23, 40, 67, 45, 2, 7, 90)
    numbers.sort() // küçükten büyüğe doğru sıralama işlemi yapar.
    println(numbers.joinToString())

    println(numbers.minOrNull()) // min elemanı bulur
    println(numbers.maxOrNull()) // max elemanı bulur

    numbers.reverse() // Terse çevirme işlemi
    println(numbers.contentToString())


}