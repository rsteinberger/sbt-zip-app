package com.demo.app

class LibClass(files: Array[String]) {
    def libFunction() = {
        println("libFunction called")
    }
}

object Main {
    def main(args: Array[String]): Unit = {
        println("lib main running")
        val lc = new LibClass(args)
        lc.libFunction()
    }

}
