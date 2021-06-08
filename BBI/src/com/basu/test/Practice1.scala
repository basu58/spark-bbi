package com.basu.test
import scala.collection.mutable.ArrayBuffer

object Practice1 {
  def main(args: Array[String]){
    val ab = ArrayBuffer[Int]()
    val ar = Array(10, 20, 30, 40)
    ab += 10
    ab += (20, 30, 40)
    
    ab.insert(3, 35)
    ab.appendAll(ar)
    
    ab.remove(3)
    
    println(ab)
    
    //ab.remove(6, 2)
    ab.trimEnd(2)
    
    println(ab)
    
    val x =ab.filter(_>25)
    println(x)
    
    
    for(x <- ab){
      if(x <20)
        x 
    }
    
    val y = ab.map(f => (if(f>25) f+5 else f+10))
    val z = ab.sorted
    println(z)
    
    
  }
}