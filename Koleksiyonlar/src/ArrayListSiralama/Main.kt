package ArrayListSiralama

fun main() {
    val kisi1 = Kisiler("Ahmet", 1)
    val kisi2 = Kisiler("Zeynep", 2)
    val kisi3 = Kisiler("Berna", 3)

    val kisiArrayList = ArrayList<Kisiler>()
    kisiArrayList.add(kisi1)
    kisiArrayList.add(kisi2)
    kisiArrayList.add(kisi3)

    println("****** Önce *******")
    for (kisiler in kisiArrayList) {
        println("${kisiler.kisiNo}- ${kisiler.kisiAd}")
    }

    println("****** Sayısal Olarak Küçükten Büyüğe Doğru Sıralama *******")
    val kisiArrayList1 = kisiArrayList.sortedWith(compareBy { it.kisiNo })
    for (kisiArray1 in kisiArrayList1) {
        println("${kisiArray1.kisiNo}- ${kisiArray1.kisiAd}")
    }

    println("****** Sayısal Olarak Büyükten Küçüğe Doğru Sıralama *******")
    val kisiArrayList2 = kisiArrayList.sortedWith(compareByDescending { it.kisiNo })
    for (kisiArray2 in kisiArrayList2) {
        println("${kisiArray2.kisiNo}- ${kisiArray2.kisiAd}")
    }

    println("****** Harfsel Olarak Küçükten Büyüğe Doğru Sıralama *******")
    val kisiArrayList3 = kisiArrayList.sortedWith(compareBy { it.kisiAd })
    for (kisiArray3 in kisiArrayList3) {
        println("${kisiArray3.kisiNo}- ${kisiArray3.kisiAd}")
    }


    println("****** Harfsel Olarak Büyükten Küçüğe Doğru Sıralama *******")
    val kisiArrayList4 = kisiArrayList.sortedWith(compareByDescending { it.kisiAd })
    for (kisiArray4 in kisiArrayList4) {
        println("${kisiArray4.kisiNo}- ${kisiArray4.kisiAd}")
    }

}