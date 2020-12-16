package com.demo.app

import java.io.File
import java.io.BufferedWriter
import java.io.FileWriter
import java.io.IOException

class LibClass(files: Array[String]) {
    def libFunction() = {
        println("libFunction called")
    }
}

class LibFileClass() {
    def libFileAppendFunction(files: Array[File]) = {
        println("libFileAppendFunction called")
        println("files: " + files.size)
        val sourceFile = files(0)
		try { 
		    // Open given file in append mode. 
		    var out = new BufferedWriter(new FileWriter(sourceFile, true)); 
		    out.write("TEST"); 
		    out.close(); 
		} catch {
			case e: IOException => println("IOException occoured"); 
		}
    }
}

object Main {
    def main(args: Array[String]): Unit = {
        println("lib main running")
        val lc = new LibClass(args)
        lc.libFunction()
    }

}
