package com.basu.test

// Scala program of using
// isEmpty method

// Creating object
object option_ex1
{

	// Main method
	def main(args: Array[String])
	{

		// Using Some class
		val some:Option[Int] = Some(20)

		// Using None class
		val none:Option[Int] = None

		// Applying isEmpty method
		val x = some.isEmpty
		val y = none.isEmpty

		// Displays false if there
		// is a value else true
		println(x)
		println(y)
	}
}
