// 一模一样，除了名字不同
interface Nameable {
    fun name(): String
}

fun f&lt;T: Nameable>(x: T) {
    println("Name is " + x.name())
}
