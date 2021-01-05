package builder

class Director(private val builder:Builder) {
    fun construct(){
        builder.makeTitle("Greeting")
        builder.makeString("朝から昼にかけて")
        builder.makeItems(arrayOf("おはようございます", "こんにちは"))
        builder.makeString("夜に")
        builder.makeItems(arrayOf("こんばんは", "おやすみなさい", "さようなら"))
        builder.close()
    }
}