package com.refinitiv.fuqiang.scala.playground

import com.refinitiv.fuqiang.scala.playgroud.ImplicitContextUser
import org.scalatest.{BeforeAndAfterEach, Matchers, WordSpecLike}

class ImplicitContextPlayTest extends WordSpecLike with Matchers with BeforeAndAfterEach {

    override def beforeEach() = {
        System.out.println("Begin Test")
    }

    override def afterEach() = {
        System.out.println("End Test")
    }

    "Add key and value" in {
        val user: ImplicitContextUser = new ImplicitContextUser
        import user._
        val userMap = user.addKeyValue("name", "user1")
        assert(userMap.get("name").get == "user1")
    }

}