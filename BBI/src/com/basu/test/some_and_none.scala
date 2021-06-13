package com.basu.test

// Scala program for Option

// Creating object
object some_and_none
{

	// Main method
	def main(args: Array[String])
	{

		// Creating a Map
		val name = Map("Nidhi" -> "author",
						"Geeta" -> "coder")

		// Accessing keys of the map
		val x = name.get("Nidhi")
		val y = name.get("Rahul")

		// Displays Some if the key is
		// found else None
		println(x)
		println(y)
	}
}
