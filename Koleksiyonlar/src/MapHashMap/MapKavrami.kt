package MapHashMap

/*
• Key ve value ilişkisi ile çalışır.
• Key ile verilere erişiriz.
• Mutable olmazsa map üzerinde değişiklik yapılamaz
 */

fun main() {
    val sayilar = mapOf<Int, String>(1 to "Bir", 2 to "İki", 3 to "Üç")

    val oranlar = mutableMapOf(1.5 to "1.5", 2.4 to "2.4", 3.6 to "3.6")

    val iller = HashMap<Int, String>()
    iller.put(27, "Gaziantep")
    iller.put(34, "İstanbul")

    println(iller.toString())

    iller.put(27, "GaziantepYeni")
    println(iller.toString())

    println(iller.get(34))

    println(iller.containsKey(46))
    println(iller.containsValue("İstanbul"))

    for ((key, value) in iller) {
        println("$key: $value")
    }
}