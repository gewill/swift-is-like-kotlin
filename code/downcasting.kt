for (current in someObjects) {
    // 类型转换不需要绑定新的变量
    if (current is Movie) {
        println("Movie: '${current.name}', " +
	    "dir. ${current.director}")
    }
}
