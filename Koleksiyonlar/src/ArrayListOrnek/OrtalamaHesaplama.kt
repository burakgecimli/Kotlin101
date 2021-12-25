package ArrayListOrnek

fun main() {
    val arrayListSayilar = ArrayList<Int>()
    arrayListSayilar.add(1)
    arrayListSayilar.add(2)
    arrayListSayilar.add(3)
    arrayListSayilar.add(4)
    arrayListSayilar.add(5)
    var toplam = 0
    for (sayi in arrayListSayilar) {
        toplam = toplam + sayi

    }
    println(toplam / arrayListSayilar.count())

}