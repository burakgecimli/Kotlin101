import java.util.ArrayList

fun main() {
    val takimlar = ArrayList<String>()
    takimlar.add("Beşiktaş")
    takimlar.add("Galatasaray")
    takimlar.add("Fenerbahçe")
    takimlar.add("TrabzonSpor")

    for (takim in takimlar) {
        println(takim)
    }

    for ((index, takim) in takimlar.withIndex()) {
        println("$index. $takim")
    }

}