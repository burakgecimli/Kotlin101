package SetHashSet

/*
    • ArrayList ile aynı özelliklere sahiptir.
    • İçine eklenen veriler düzensiz rasgele yerleştirilir.
    • İndeks değerlerinin takibi zordur.
    • Mutable üzerinde değişiklik yapılır demektir.
    • setof : Sadece üzerinden veri okunur demektir.
 */
fun main() {
    val meyveler = setOf<String>("Çilek", "Muz", "Elma", "Kivi")
    val iller = mutableSetOf<String>("Bursa", "İstanbul", "Ankara", "İzmir")
    val sayilar = HashSet<Int>()

    sayilar.add(10)
    sayilar.add(20)
    sayilar.add(30)
    println(sayilar.toString())
    sayilar.add(20)//Aynı veriyi kaydetmez
    println(sayilar.toString())
    println(sayilar.elementAt(1)) //İlgili indexte ki değeri getirir.
    println(sayilar.size)

    println("************")
    for (sayi in sayilar) {
        println(sayi)
    }
    println("*************")
    for ((index, sayi) in sayilar.withIndex()) {
        println("$index. -> $sayi")
    }

    sayilar.remove(10)// Belirtilen değeri siler
    println(sayilar.toString())

    sayilar.clear()
    println(sayilar.toString()) //Bütün elemanları siler.

}