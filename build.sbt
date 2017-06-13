name := "pica.scala.js"
organization := "com.outr"
version := "3.0.4-SNAPSHOT"

scalaVersion := "2.12.2"
crossScalaVersions := List("2.12.2", "2.11.11")

enablePlugins(ScalaJSPlugin)

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.2"

jsDependencies += ProvidedJS / "pica.js"
skip in packageJSDependencies := false
