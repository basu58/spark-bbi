package com.basu.test

// Scala program for Option
// with Pattern matching

// Creating object
object pattern_matching
{

	// Main method
	def main(args: Array[String])
	{

		// Creating a Map
		val name = Map("Nidhi" -> "author",
						"Geeta" -> "coder")

		//Accessing keys of the map
		println(patrn(name.get("Nidhi")))
		println(patrn(name.get("Rahul")))
	}

	// Using Option with Pattern
	// matching
	def patrn(z: Option[String]) = z  match
	{

		// for 'Some' class the key for
		// the given value is displayed
		case Some(s) => (s)

		// for 'None' class the below string
		// is displayed
		case None => ("key not found")
	}
}
