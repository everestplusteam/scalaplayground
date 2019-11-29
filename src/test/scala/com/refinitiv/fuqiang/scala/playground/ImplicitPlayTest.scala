package com.refinitiv.fuqiang.scala.playground

import com.refinitiv.fuqiang.scala.playgroud.ImplicitPlay
import org.scalatest.{BeforeAndAfterEach, Matchers, WordSpecLike}

class ImplicitPlayTest extends WordSpecLike with Matchers with BeforeAndAfterEach {

    override def beforeEach() = {
        System.out.println("Begin Test")
    }

    override def afterEach() = {
        System.out.println("End Test")
    }

    val implicitPlay = new ImplicitPlay

    import implicitPlay._

    "Convert Int" in {
        assert(123 == implicitPlay.convertToType[Int]("123"))
    }

    "Convert Int failed" in {
        assert(123 == implicitPlay.convertToType[Int]("100"))
    }

    "Convert Double" in {
        assert(1.23 == implicitPlay.convertToType[Double]("1.23"))
    }
}
