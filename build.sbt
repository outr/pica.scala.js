name := "pica.scala.js"
organization := "com.outr"
version := "3.0.5"

scalaVersion := "2.12.2"
crossScalaVersions := List("2.12.2", "2.11.11", "2.13.0-M1")

enablePlugins(ScalaJSPlugin)

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.3"

jsDependencies += ProvidedJS / "pica.js"
skip in packageJSDependencies := false
