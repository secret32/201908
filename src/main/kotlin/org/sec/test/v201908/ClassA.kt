package org.sec.test.v201908

class ClassA {

    companion object A {
        fun whatsUp() = println("What's your problem?")
    }

    var name: String? = null
        set(value) {
            field = value!!.toUpperCase()
        }

    private var gender: String = "Male"
        get() {
            if (name?.startsWith("R")!!) {
                return "Female"
            }
            return field
        }

    fun readBook(bookName: String) {
        println("$name is reading $bookName")
    }

    override fun toString(): String {
        return "ClassA(name=$name, gender=$gender)"
    }
}