package com.refinitiv.fuqiang.scala.playgroud

import scala.collection.immutable.HashMap

class ImplicitContextPlay {

    val context: Map[String, String] = new HashMap[String, String]

    def getValue(key: String): Option[String] = {
        context.get(key)
    }

    def addKeyValue(key: String, value: String): Map[String, String] = {
        context + (key -> value)
    }

}

class ImplicitContextUser {
    implicit val ctx: ImplicitContextPlay = new ImplicitContextPlay

    def getValue(key: String)(implicit ctx: ImplicitContextPlay): Option[String] = ctx.getValue(key)

    def addKeyValue(key: String, value: String)(implicit ctx: ImplicitContextPlay): Map[String, String] = {
        ctx.addKeyValue(key, value)
    }
}
