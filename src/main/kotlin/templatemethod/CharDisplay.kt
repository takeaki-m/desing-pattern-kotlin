package templatemethod

class CharDisplay(private val ch: Char): AbstractDisplay() {

    override fun open() {
        println("<<")
    }

    override fun print() {
        println(this.ch)
    }
    override fun close() {
        println(">>")
    }
}