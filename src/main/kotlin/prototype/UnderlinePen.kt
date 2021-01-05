package prototype

class UnderlinePen(private val char : Char) : KotlinProduct{
    override fun use(s: String) {
        val length : Int = s.length
        println("\"" + s + "\"")
        println(" ")
        for (i in 1 until length) {
            println(this.char)
        }
        println(" ")
    }

    override fun createCrone(): KotlinProduct {
        var p : KotlinProduct? = null
        try {
            p =  clone() as KotlinProduct
        } catch (e : CloneNotSupportedException) {
            e.printStackTrace()
        }
        return p!!
    }
}