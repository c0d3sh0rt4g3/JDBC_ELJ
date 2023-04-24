fun main() {

    val product = Product(11, "Smartphone", 999.99f, "The latest smartphone model", "Apple", "Electronics")
    val newProduct = ProductDAO()
    val productId = newProduct.createProduct(product)

    println("Product ID: $productId")

}