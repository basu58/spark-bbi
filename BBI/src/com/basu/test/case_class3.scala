package com.basu.test

// Scala program of case class To create
// a duplicate of same instance
case class Student (name:String, age:Int)
object case_class3
{
	// Main method
	def main(args: Array[String])
	{
		val s1 = Student("dev", 26)
		
		// Display parameter
		println("Name is " + s1.name);
		println("Age is " + s1.age);
		val s2 = s1.copy()
		
		// Display copied data
		println("Copy Name " + s2.name);
		println("Copy Age " + s2.age);
	}
}
