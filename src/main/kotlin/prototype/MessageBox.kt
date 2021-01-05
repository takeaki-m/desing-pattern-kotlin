package prototype

import kotlin.jvm.internal.Intrinsics

class MessageBox(private val decochar: Char) : KotlinProduct{

    override fun use(s: String) {
        val length: Int = s.length
        for(i in 1 until length ) {
            println(this.decochar)
        }
        println(" ")
        println(this.decochar + " " + s + " " + this.decochar)
        for (i in 1 until length + 4) {
            println(this.decochar)
        }
        println(" ")
    }

    override fun createCrone(): KotlinProduct {
        var p : KotlinProduct? = null
        try {
            p = clone() as KotlinProduct
        } catch (e : CloneNotSupportedException) {
            e.printStackTrace()
        }
        return p!!
    }
}