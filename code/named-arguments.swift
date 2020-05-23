func area(_ width: Int, height h: Int) -> Int {
    return width * h
}
// 还是Swift比较规范，区分形参和实参
// 当形参为_时，才可以省略
area(2, height: 3)
