// 少了Extension关键字
// 直接在变量或者函数前加类型名
val Double.km: Double get() = this * 1000
val Double.m: Double get() = this
val Double.cm: Double get() = this / 100
val Double.mm: Double get() = this / 1000
val Double.ft: Double get() = this / 3.28084

val oneInch = 25.4.mm
println("One inch is $oneInch meters")
// prints "One inch is 0.0254 meters"
val threeFeet = 3.0.ft
println("Three feet is $threeFeet meters")
// prints "Three feet is 0.914399970739201 meters"

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}
val list = mutableListOf(1, 2, 3)
list.swap(0, 2) 
// 'this' inside 'swap()' will hold the value of 'list'