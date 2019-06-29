package com.outr.pica

import scala.scalajs.js

trait PicaOptions extends js.Object {
  var tile: js.UndefOr[Double] = js.undefined
  var features: js.UndefOr[js.Array[String]] = js.undefined
  var idle: js.UndefOr[Long] = js.undefined
  var concurrency: js.UndefOr[Int] = js.undefined
}
