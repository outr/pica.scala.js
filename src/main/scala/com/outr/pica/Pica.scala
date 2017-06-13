package com.outr.pica

import org.scalajs.dom.html
import org.scalajs.dom.raw.Blob

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@js.native
@JSGlobal("pica")
class Pica extends js.Object {
  def resize(from: html.Canvas | html.Image,
             to: html.Canvas,
             options: ResizeOptions = js.native): js.Promise[html.Canvas] = js.native

  def toBlob(canvas: html.Canvas, mimeType: String, quality: Double = js.native): js.Promise[Blob] = js.native
}
