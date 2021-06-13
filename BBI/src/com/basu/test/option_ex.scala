package com.basu.test

// Scala program of using
// getOrElse method

// Creating object
object option_ex
{

	// Main method
	def main(args: Array[String])
	{

		// Using Some class
		val some:Option[Int] = Some(15)

		// Using None class
		val none:Option[Int] = None

		// Applying getOrElse method
		val x = some.getOrElse(6)
		val y = none.getOrElse(17)

		// Displays the key in the
		// class Some
		println(x)

		// Displays default value
		println(y)
	}
}
