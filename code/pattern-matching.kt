val nb = 42
// 单值匹配不使用关键词，使用 -> 作为分隔符
// 多值匹配使用in
// 默认值关键字是else
when (nb) {
    in 0..7, 8, 9 -> println("single digit")
    10 -> println("double digits")
    in 11..99 -> println("double digits")
    in 100..999 -> println("triple digits")
    else -> println("four or more digits")
}
