package builder

class TextBuilder: Builder() {
    private val sb:StringBuilder = StringBuilder()
    override fun makeTitle(title: String) {
        sb.append("================================¥n")
        sb.append("[$title]")
        sb.append("¥n")
    }
    override fun makeString(str: String) {
        sb.append("■$str¥n")
        sb.append("¥n")
    }

    override fun makeItems(items: Array<String?>) {
        for (i in 1 until items.size ) {
            sb.append(" ・" + items[i] + "¥n")
        }
        sb.append("¥n")
    }

    override fun close() {
        sb.append("================================¥n")
    }

    fun getResult():String {
        return this.sb.toString()
    }
}