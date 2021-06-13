package com.basu.test

// Scala program of case class same object
// with changing attributes
case class Student1 (name:String, age:Int)

object case_class4
{
	// Main method
	def main(args: Array[String])
	{
		val s1 = Student1("Dev", 26)
		
		// Display parameter
		println("Name is " + s1.name);
		println("Age is " + s1.age);
		val s2 = s1.copy(age = 24)
		
		// Display copied and changed attributes
		println("Copy Name is " + s2.name);
		println("Change Age is " + s2.age);
	}
}
