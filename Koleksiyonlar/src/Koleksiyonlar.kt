/*
    • Mutable özelliği diziler hem yazılabilir hem okunabilir.
    • Mutable olmayan diziler sadece okunabilir.
    • Böyle bir ayrım yapmalarının sebebi kodlama yaparken büyük
     çoğunlukla veri tabanlarından alınan dizileri okuma işlemi yapmamız diyebiliriz.
    • Performansı artırmak amaçlanmıştır.
 */

fun main() {
    //ArrayList tanımlama
    val dizi1 = ArrayList<String>()
    val dizi2: ArrayList<Int> = ArrayList<Int>()

    val meyveler = ArrayList<String>()
    meyveler.add("Elma")
    meyveler.add("Şeftali")
    meyveler.add("Çilek")
    meyveler.add("Portakal")
    println(meyveler.toString())

    val str = meyveler.get(0)
    println(str)

    val str1 = meyveler[2]
    println(str1)

    meyveler.add("Mandalina") //Arraylist'in sonuna veri ekleme
    println(meyveler.toString())

    meyveler[2] = "Kivi" //Mevcut yerin üzerine veri yazma Çilek yerine Kivi
    println(meyveler.toString())

    meyveler.add(3, "Armut") //Belirtilen yere veriyi ekler var olan verileri bir yana kaydırır.
    println(meyveler.toString())
}