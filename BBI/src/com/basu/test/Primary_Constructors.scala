package com.basu.test

class Primary_Constructors(sId : Int, sName: String, sAge: Int) {
  override def toString: String = s"sName = $sName, sId = $sName, sAge = $sAge"
}

object TestPrimary{
  def main(args: Array[String]): Unit = {
    val obj = new Primary_Constructors(123, "Dev", 26)
    println(obj)
  }
}