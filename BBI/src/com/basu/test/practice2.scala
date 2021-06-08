package com.basu.test
import scala.collection.mutable.Map

object practice2 {
  def main(args: Array[String]){
    val mp = Map("A" -> "a", "B" -> "b", "C" -> "c")
    
    println(mp.values)
    println(mp.keys)
    
    mp -= "B"
    
    println(mp)
    
    val value = readLine()
    
    
    println(mp.get(value))
    
    if(mp.get(value) == None){
      println("Not available")
      mp += ("new" -> "value")
    }
    
    println(mp)
    
    val str = "Java Scala Java Scala Scala Scala Scala"
    
    val mp1 = Map[String, Int]()
    
    val arr = str.split(" ")
    
    for(word <- arr)
      if(!mp1.contains(word))
          mp1 += (word->1)
      else{
         val value = mp1.get(word)
      value match{
        case Some(x) => (mp1 += (word -> (x+1)))
         case None => println("value not found")
        }
      }
    println(mp1)
        
  }
}