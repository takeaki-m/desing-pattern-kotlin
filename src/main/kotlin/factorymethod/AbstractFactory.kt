package factorymethod

abstract class AbstractFactory {
    fun create(owner: String): AbstractProduct{
       val p: AbstractProduct = this.createProduct(owner)
        registerProduct(p)
        return p
    }

    abstract fun createProduct(owner: String): AbstractProduct
    abstract fun registerProduct(product: AbstractProduct)
}