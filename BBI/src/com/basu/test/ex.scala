package com.basu.test

object ex {
  def main(args: Array[String]): Unit = {
    val x = Map("abc" -> "ABC", "def" -> "DEF")
    print(x.get("def"))
  }
}