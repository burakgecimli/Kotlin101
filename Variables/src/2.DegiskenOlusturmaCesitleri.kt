fun main() {
    var fiyat = 200
    println("Fiyat:$fiyat")
    fiyat = fiyat + (fiyat * 40 / 100)

    println("Fiyat:$fiyat")

    //Type Safety – Tür Güvenliği
    //•Oluşturduğunuz değişkene farklı türde değişken atayamazsınız.
    
    var number = 100
    // number=12.6 hatalı kullanım
    // number="Ahmet" hatalı kullanım

    val myNumber: Int = 123
    // myNumber=35 Val cannot be reassigned


}