package com.refinitiv.fuqiang.scala.playgroud

class ImplicitPlay {

    trait Converter[T] {
        def convertTo(input: String): T
    }

    implicit object IntConverter extends Converter[Int] {
        override def convertTo(input: String): Int = input.toInt
    }

    implicit object DoubleConverter extends Converter[Double] {
        override def convertTo(input: String): Double = input.toDouble
    }

    def convertToType[T](input: String)(implicit converter: Converter[T]): T = {
        converter.convertTo(input)
    }
}
