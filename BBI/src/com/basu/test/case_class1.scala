package com.basu.test
// Scala program of case class and case Object
case class employee(name:String, age:Int)
object case_class1
{
	// Main method
	def main(args: Array[String])
	{
		var c = employee("Dev", 26)
		
		// Display both Parameter
		println("Name of the employee is " + c.name);
		println("Age of the employee is " + c.age);
	}
}
