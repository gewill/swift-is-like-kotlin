fun area(width: Int, height: Int) = width * height
area(width = 2, height = 3)

// 形参可以省略，IDE会用灰色字体显示
area(2, height = 2)
area(height = 3, width = 2)
