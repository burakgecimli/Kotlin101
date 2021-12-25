package SetHashSet.SetHashSetOrnek


fun main() {
    val ogr1 = Ogrenci(1, "Burak", "12D")
    val ogr2 = Ogrenci(2, "Ceren", "12C")
    val ogr3 = Ogrenci(2, "Berna", "12B")
    val ogr4 = Ogrenci(4, "Ayşe", "12A")

    val ogrenciler = HashSet<Ogrenci>()
    ogrenciler.add(ogr1)
    ogrenciler.add(ogr2)
    ogrenciler.add(ogr3)
    ogrenciler.add(ogr4)



    for (o in ogrenciler) {
        println("**************")
        println(o.ogrenciAd)
        println(o.ogrenciNo)
        println(o.ogrenciSinif)
    }


}

