package prototype

interface KotlinProduct : Cloneable{
    fun use(s: String)
    fun createCrone(): KotlinProduct
}