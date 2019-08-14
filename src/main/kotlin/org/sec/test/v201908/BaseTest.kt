package org.sec.test.v201908

/**
 * 多行文本
 */
fun multitext() {
    val text = """
        > First.  eat
        > Second. sleep
        > Third.  eat
        > Fourth. sleep
        > ...
    """.trimMargin(">")
    println(text)
}

/**
 * when作为多if-else条件语句使用
 */
fun switch(six: Boolean) {
    when {
        six -> println("666")
        else -> println("!666")
    }
}

/**
 * 数字区间迭代
 */
fun intIt() {
    for (i in 1..10) {
        print("$i\t")
    }
    println()
    for (i in 10 downTo 0 step 2) {
        print("$i\t")
    }
    println()
}

/**
 * 数组迭代
 */
fun arrIt() {
    val intArr = intArrayOf(2, 3, 5, 7, 11, 13, 17, 19, 23)
    for ((index, value) in intArr.withIndex()) {
        println("intArr[$index] = $value")
    }
}

fun main() {
    multitext()
    switch(true)
    intIt()
    arrIt()
}