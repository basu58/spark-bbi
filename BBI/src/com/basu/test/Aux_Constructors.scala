package com.basu.test

class Aux_Constructors {
 private var sId = 0
 private var sName = ""
 private var sAge = 0
 
 def this(sId: Int) = {
   this()
   this.sId = sId
 }
 
 def this(sId: Int, sAge: Int) = {
   this(sId)
   this.sAge = sAge
 }
 
 def this(sId: Int, sAge: Int, sName: String) = {
   this(sId, sAge)
   this.sName = sName
 }
 
 override def toString: String = s"sId = $sId, age = $sAge, Name = $sName"
 
}

object TestConstructors{
  def main(args: Array[String]): Unit = {
    val obj = new Aux_Constructors
    println(obj)
    
    val obj1 = new Aux_Constructors(123, 26, "dev")
    println(obj1)
    
  }
}