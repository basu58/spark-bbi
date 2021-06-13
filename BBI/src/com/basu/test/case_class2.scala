package com.basu.test

// Scala program of case class and case Object
// affix a method with the name of the class
case class Book (name:String, author:String)
object case_class2
{
	// Main method
	def main(args: Array[String])
	{
		var Book1 = Book("Data Structure and Algorithm", "cormen")
		var Book2 = Book("Computer Networking", "Tanenbaum")
		
		// Display strings
		println("Name of the Book1 is " + Book1.name);
		println("Author of the Book1 is " + Book1.author);
		println("Name of the Book2 is " + Book2.name);
		println("Author of the Book2 is " + Book2.author);
	}
}
