package MapHashMap.MapHashMapOrnek

import SetHashSet.SetHashSetOrnek.Ogrenci

fun main() {
    val ogr1 = Student(1, "Burak", "12D")
    val ogr2 = Student(2, "Ceren", "12C")
    val ogr3 = Student(2, "Berna", "12B")

    val students = HashMap<Int, Student>()
    students.put(ogr1.ogrenciNo, ogr1)
    students.put(ogr2.ogrenciNo, ogr2)
    students.put(ogr3.ogrenciNo, ogr3)

    for ((ogrNo, nesne) in students) {
        println("***********")
        println(ogrNo)
        println(nesne.ogrenciAd)
        println(nesne.ogrenciSinif)
    }


}