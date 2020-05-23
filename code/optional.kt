var result: Int? = 30

// 默认拆包
if (result != null) {
println(result + 1)
}

// 可选绑定为it
result.let {
println(it)
}

// 可选链
var longValue = result?.toLong()
// 默认值
var defaultValue = result ?: 0