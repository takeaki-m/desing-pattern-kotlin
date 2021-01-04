import adaptor.*
import factorymethod.AbstractFactory
import factorymethod.AbstractProduct
import factorymethod.IdCard
import factorymethod.IdCardFactory
import iterator.Book
import iterator.BookShelf
import prototype.JavaProduct
import prototype.Manager
import prototype.MessageBox
import prototype.UnderLinPen
import singleton.Singleton
import templatemethod.AbstractDisplay
import templatemethod.CharDisplay
import templatemethod.StringDisplay

fun main() {
    println("Hello World")
    // --start for copy--
    // patternname
    // details
    // println("patternname")
    // println("------------------------------------")
    // println("------------------------------------")
    // --end for copy--

    // Iterator
    // 数え上げ
    println("------------------------------------")
    println("Iterator")
    val bookShelf = BookShelf(4)
    bookShelf.appendBook(Book("Around the World in 80 days"))
    bookShelf.appendBook(Book("Bible"))
    bookShelf.appendBook(Book("Cinderella"))
    bookShelf.appendBook(Book("Daddy-Long_legs"))
    val bookShelfIterator = bookShelf.iterator()
    while (bookShelfIterator.hasNext()) {
        val book= bookShelfIterator.next()
        //        bookShelfIterator.getIndex
        // 本当は下でなまえが出てくるはずなのだが、getterできない
        // println(book.name)
        println("ttt")
    }
    println("------------------------------------")
    // Adaptor--extend-version
    // 変換
    println("Adaptor--extend-version")
    println("------------------------------------")
    val print: Print = PrintBanner("Hello")
    print.printWeak();
    print.printStrong()
    println("------------------------------------")
    // Adaptor--transfer-version
    println("Adaptor--transfer-version")
    println("------------------------------------")
    val printTransfer: PrintTransfer = PrintBannerTransfer("Hello", Banner("Trans"))
    printTransfer.printWeak();
    printTransfer.printStrong()
    println("------------------------------------")
    // template-method
    // スーパークラスで処理の枠組みをさだめ、アブクラスでその具体的内容を定める
    println("template-method")
    println("------------------------------------")
    val d1: AbstractDisplay = CharDisplay('h')
    val d2: AbstractDisplay = StringDisplay("こんにちは")
    val d3: AbstractDisplay = StringDisplay("Hello")
    d1.display()
    d2.display()
    d3.display()
    println("------------------------------------")
    // factory-method
    // template method patternをインスタンス生成場面に応用したもの
    // インスタンスの生成方法をスーパークラス側で定める
    println("factory-method")
    println("------------------------------------")
    val abstractFactory: AbstractFactory = IdCardFactory()
    val card1: AbstractProduct = abstractFactory.createProduct("hiroshi")
    val card2: AbstractProduct = abstractFactory.createProduct("mario")
    val card3: AbstractProduct = abstractFactory.createProduct("ruiz")
    card1.use()
    card2.use()
    card3.use()
    println("------------------------------------")

    // singleton
    // 指定したクラスのインスタンスがプログラム中で一つしか存在しないことを保証する
    // インスタンスの生成方法をスーパークラス側で定める
    println("singleton")
    println("------------------------------------")
    println("Singleton called")
    var singleton1: Singleton
    var singleton2: Singleton
    println(Singleton.created)
    println(Singleton.time())

    println("------------------------------------")
    // prototype
    // インスタンスから別のインスタンスを生成する
    //
    println("prototype")
    println("------------------------------------")
    val man: Manager = Manager()
    val upen: UnderLinPen = UnderLinPen('~')
    val mbox: MessageBox = MessageBox('*')
    val sbox: MessageBox = MessageBox('/')
    man.register("strong message", upen)
    man.register("warning box", mbox)
    man.register("slash box", sbox)
    val p1: JavaProduct = man.create("strong message")
    p1.use("Hello World!")
    val p2: JavaProduct = man.create("warning box")
    p2.use("Hello World!")
    val p3: JavaProduct = man.create("slash box")
    p3.use("Hello World!")


    println("------------------------------------")}
