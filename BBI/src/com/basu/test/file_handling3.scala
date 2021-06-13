package com.basu.test


// Scala file handling program to Read each
// line from a single file
import scala.io.Source

// Creating object
object file_handling3
{
	// Main method
	def main(args:Array[String])
	{
		val fname = "/home/user/Downloads/sample3.txt"
		val fSource = Source.fromFile(fname)
		for(line<-fSource.getLines)
		{
			println(line)
		}
		fSource.close()
	}
}
