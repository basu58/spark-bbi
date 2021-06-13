package com.basu.test

// Scala File handling program
import scala.io.Source

// Creating object
object file_handling2
{
	// Main method
	def main(args : Array[String])
	{
		// file name
		//val fname = "abc.txt"

		// creates iterable representation
		// of the source file			
		val fSource = Source.fromFile("/home/user/Documents/abc.txt")
		while (fSource.hasNext)
		{
			print(fSource.next)
		}

		// closing file
		fSource.close()
	}
}
