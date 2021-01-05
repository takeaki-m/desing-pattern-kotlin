package builder

import java.io.BufferedWriter
import java.io.FileNotFoundException
import java.io.FileWriter
import java.io.PrintWriter

class HTMLBuilder:Builder() {
    private var filename:String? = null
    private var printWriter: PrintWriter? = null

    override fun makeTitle(title: String) {
        this.filename = "$title.html"
        try {
            printWriter = PrintWriter(BufferedWriter(FileWriter(filename)))

        } catch (e: FileNotFoundException) {
            println(e)
        }
        printWriter?.println("<html><head><title>$title</title></head><body>")
        printWriter?.println("<h1>$title</h1>")
    }
    override fun makeString(str: String) {
        printWriter?.println("<p>$str</p>")
    }

    override fun makeItems(items: Array<String?>) {
        printWriter?.println("<ul>")
        for (i in 1 until items.size) {
            printWriter?.println("<li>" + items[i] + "</li>")
        }
        printWriter?.println("</ul>")
    }

    override fun close() {
        printWriter?.println("</body></html>")
        printWriter?.close()
    }

    fun getResult():String {
        return this.filename.toString()
    }

}