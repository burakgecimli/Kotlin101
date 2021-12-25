package OopKoleksiyonOrnek

fun main() {
    val product1 = Product(1, "Saat", 200)
    val product2 = Product(2, "TV", 4000)
    val product3 = Product(3, "Bilgisayar", 8750)

    val productArrayList = ArrayList<Product>()
    productArrayList.add(product1)
    productArrayList.add(product2)
    productArrayList.add(product3)

    for (product in productArrayList) {
        println("***************")
        println(product.productId)
        println(product.productName)
        println(product.productPrice)
    }
}