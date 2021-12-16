class Toplam {

    var x = 10 //Global Variable
    var y = 20 //Global Variable

    fun topla() {
        x = 5 //Local Variable
        y=10 //Local Variable
        var z = x + y
        println(z)
    }

}

//Lokal değişkenler Global değişkenlere göre baskındır.
fun main() {
    var toplam = Toplam()
    toplam.topla()

}