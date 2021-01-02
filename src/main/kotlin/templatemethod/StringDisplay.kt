package templatemethod

class StringDisplay(private val string: String): AbstractDisplay() {
    private val width: Int = string.length
    override fun open() {
        printLine()
    }

    override fun print() {
        println("|" + this.string + "|")
    }

    override fun close() {
        printLine()
    }

    private fun printLine(){
        print("+")
        for (i in 1 until this.width) {
            print("-")

        }
        println("+")
    }
}