package factorymethod

class IdCardFactory: AbstractFactory() {
    private val owners: MutableList<String> = mutableListOf()
    override fun createProduct(owner: String): AbstractProduct {
        return IdCard(owner)
    }

    override fun registerProduct(product: AbstractProduct) {
        if (product is IdCard) {
            this.owners.add(product.owner)
        } else {
            println("this product is not IdCard")
        }
    }
}