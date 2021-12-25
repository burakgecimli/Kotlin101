package ArrayListFiltreleme

fun main() {
    val ogr1 = Ogrenci(1, "Ahmet", "11A")
    val ogr2 = Ogrenci(2, "Zeynep", "10A")
    val ogr3 = Ogrenci(3, "Ceyda", "12A")
    val ogr4 = Ogrenci(4, "Mehmet", "9Z")
    val ogr5 = Ogrenci(5, "Yasin", "11F")

    val ogrArrayList1 = ArrayList<Ogrenci>()
    ogrArrayList1.add(ogr1)
    ogrArrayList1.add(ogr2)
    ogrArrayList1.add(ogr3)
    ogrArrayList1.add(ogr4)
    ogrArrayList1.add(ogr5)

    yazdir(ogrArrayList1)

    println("\n------ Filtreleme İşlemi ----------")
    val ogrArrayList2 = ogrArrayList1.filter { it.ogrenciNo >= 2 }
    yazdir(ogrArrayList2)
    println("\n\n")

    val ogrArrayList3=ogrArrayList1.filter { (it.ogrenciAd).contains("a") }
    yazdir(ogrArrayList3)

}



fun yazdir(ogrArrayList: List<Ogrenci>) {
    for (ogr in ogrArrayList) {
        println("********************")
        println("Öğrenci No: ${ogr.ogrenciNo}")
        println("Öğrenci Ad: ${ogr.ogrenciAd}")
        println("Öğrenci Sınıf: ${ogr.ogrenciSinif}")
    }
}




