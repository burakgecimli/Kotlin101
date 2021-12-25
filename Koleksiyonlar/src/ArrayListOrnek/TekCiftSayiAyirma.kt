package ArrayListOrnek

fun main() {
    val arrayListSayilar = ArrayList<Int>()
    val arrayListCiftSayilar = ArrayList<Int>()
    val arrayListTekSayilar = ArrayList<Int>()
    arrayListSayilar.add(1)
    arrayListSayilar.add(2)
    arrayListSayilar.add(3)
    arrayListSayilar.add(4)
    arrayListSayilar.add(5)

    for (sayi in arrayListSayilar) {
        if (sayi % 2 == 0) {
            arrayListCiftSayilar.add(sayi)

        } else {
            arrayListTekSayilar.add(sayi)
        }
    }

    yazdir(arrayListSayilar)
    println("***********")
    yazdir(arrayListCiftSayilar)
    println("************")
    yazdir(arrayListTekSayilar)


}

fun yazdir(arrayList: ArrayList<Int>) {
    for (sayilar in arrayList) {
        println(sayilar)
    }

}