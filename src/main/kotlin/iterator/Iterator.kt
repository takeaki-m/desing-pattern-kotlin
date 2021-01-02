package iterator


interface Iterator {
    fun hasNext(): Boolean
    // AnyはJava のObjectとは違う
    //    fun next()
    fun next(): Any
}