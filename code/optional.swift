var result: Int? = 30

// 默认拆包
if let result = result {
    print(result + 1)
}

// 可选链
var resultDescription = result?.description
// 默认值
var defaultValue = result ?? 0