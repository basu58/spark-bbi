package com.basu.test
// A Scala program to illustrate
// how to call method inside singleton object

// Singleton object with named
// as Exampleofsingleton
object Exampleofsingleton
{
	
	// Variables of singleton object
	var str1 = "Welcome ! Scala";
	var str2 = "This is Scala language";
	
	// Method of singleton object
	def display()
	{
		println(str1);
		println(str2);
	}
}

// Singleton object with named as Main
object Main
{
	def main(args: Array[String])
	{
		// Calling method of singleton object
		Exampleofsingleton.display();
	}
}
