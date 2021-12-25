import java.util.ArrayList

fun main() {

    val takimlar = ArrayList<String>()
    takimlar.add("Beşiktaş")
    takimlar.add("Galatasaray")
    takimlar.add("Fenerbahçe")
    takimlar.add("TrabzonSpor")

    println(takimlar.size)
    println(takimlar.isEmpty())
    println(takimlar.count())
    println(takimlar.last())
    println(takimlar.first())
    println(takimlar.contains("Başakşehir"))


    takimlar.sort()
    println("--------------------")
    println(takimlar.toString())

    println("-------------------")
    takimlar.reverse()
    println(takimlar.toString())

    println("---------------------")
    takimlar.removeAt(1)

    println(takimlar.toString())

}