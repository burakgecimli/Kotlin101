package ArrayListOrnek

fun main() {
    val arrayList = ArrayList<Int>()
    arrayList.add(1)
    arrayList.add(2)
    arrayList.add(3)
    arrayList.add(4)
    arrayList.add(5)

    for ((index, sayi) in arrayList.withIndex()) {
        var sonuc = sayi * 2
        arrayList[index] = sonuc


    }
    for (i in arrayList){
        println(i)
    }
}