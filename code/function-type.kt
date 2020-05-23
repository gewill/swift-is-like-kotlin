fun makeIncrementer(): (Int) -> Int {
    val addOne = fun(number: Int): Int {
        return 1 + number
    }
    return addOne
}
val increment = makeIncrementer()
increment(7)

// makeIncrementer can also be written in a shorter way:
// 语法糖：函数返回值可以用 = 
// 返回值类型可以省略，编译器能自动推断
fun makeIncrementer() = fun(number: Int) = 1 + number
