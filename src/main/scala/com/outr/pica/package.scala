package com.outr

import scala.scalajs.js

package object pica {
  def apply(): Pica = js.Dynamic.global.pica().asInstanceOf[Pica]
  def apply(options: PicaOptions): Pica = js.Dynamic.global.pica(options).asInstanceOf[Pica]
}