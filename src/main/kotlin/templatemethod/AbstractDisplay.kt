package templatemethod

/**
 * 処理の順番を定める抽象クラス
 */
abstract class AbstractDisplay {
    abstract fun open()
    abstract fun print()
    abstract fun close()
    fun display() {
        open()
        for (i in 1..5) print()
        close()
    }
}