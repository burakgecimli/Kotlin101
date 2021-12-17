fun main() {

    val arrFruit = arrayOf<String>("Elma", "Muz", "Kivi", "Çilek")
    for (fruit in arrFruit){
        println(fruit)
    }
    println("---------------")

    for ((index,fruit) in arrFruit.withIndex()){
        println("$index.index $fruit")
    }

}