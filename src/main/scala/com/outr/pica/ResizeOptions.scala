package com.outr.pica

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
trait ResizeOptions extends js.Object {
  var quality: js.UndefOr[Double] = js.undefined
  var alpha: js.UndefOr[Boolean] = js.undefined
  var unsharpAmount: js.UndefOr[Double] = js.undefined
  var unsharpRadius: js.UndefOr[Double] = js.undefined
  var unsharpThreshold: js.UndefOr[Double] = js.undefined
  var cancelToken: js.UndefOr[js.Promise[js.Any]] = js.undefined
}
