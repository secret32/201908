package org.sec.test.v201908

class ClassB {

    private fun readBook(bookName: String) {
        println("$bookName xxx")
    }

    private fun ClassA.read(name: String) {
        this.readBook(name)
        this@ClassB.readBook(name)
    }

    fun read() {
        val a = ClassA()
        a.name = "Harden"
        a.read("<Gold coins>")
    }

}