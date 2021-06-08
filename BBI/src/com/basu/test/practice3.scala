package com.basu.test

object practice3 {
  def main(args: Array[String]){
    var name = (15, "chandan", true)
  
        println(name._1) // print 1st element
        println(name._2) // print 2st element
        println(name._3) // print 3st element
        
        var (a, b, c) = (15, "chandan", true)
        println(a)
        println(b)
        println(c)
        
        var name1 = (15, "chandan", true)
          
        // The foreach method takes a function
        // as parameter and applies it to 
        // every element in the collection
        name1.productIterator.foreach{i=>println(i)}
    
        val name2 = (15, "chandan", true)
          
        // print converted string
        println(name2.toString() )
        
        val name3 = ("geeksforgeeks","gfg")
          
        // print swapped element
        println(name3.swap)
        
        
  }
}