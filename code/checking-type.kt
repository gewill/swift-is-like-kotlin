var movieCount = 0
var songCount = 0

// 所有控制语句的条件都有小括号
for (item in library) {
    if (item is Movie) {
        // 仍支持C风格的++
        ++movieCount
    } else if (item is Song) {
        songCount += 1
    }
}
