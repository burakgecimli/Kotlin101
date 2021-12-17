import java.util.*

fun main() {
    //Konsoldan girilen adınızı konsoldan girdiğiniz tekrar sayısı kadar yazdıran programı yazınız.
    val input = Scanner(System.`in`)
    println("İsim Giriniz")
    val name = input.next()
    println("Kaç kez tekrarlanacak")
    val tekrarSayisi = input.nextInt()

    for (tekrarSayisi in 1..tekrarSayisi) {
        println("$tekrarSayisi. $name")
    }


    //Konsoldan girilen işlenecek veri sayısını işleyerek ekrana yazdırınız.
    println("----------------------------------------")
    println("İşlenecek veri miktarını giriniz")
    var veriKumesi = input.nextInt()

    while (veriKumesi > 0) {
        println("${veriKumesi}. veri")
        veriKumesi--
    }
}