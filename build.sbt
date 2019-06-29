name := "pica.scala.js"
organization := "com.outr"
version := "3.0.5_1"

scalaVersion := "2.13.0"
crossScalaVersions := List("2.13.0", "2.12.8", "2.11.12")
scalacOptions += "-P:scalajs:sjsDefinedByDefault"

publishTo in ThisBuild := sonatypePublishTo.value
sonatypeProfileName in ThisBuild := "com.outr"
publishMavenStyle in ThisBuild := true
licenses in ThisBuild := Seq("MIT" -> url("https://github.com/outr/pica.scala.js/blob/master/LICENSE"))
sonatypeProjectHosting in ThisBuild := Some(xerial.sbt.Sonatype.GitHubHosting("outr", "pica.scala.js", "matt@outr.com"))
homepage in ThisBuild := Some(url("https://github.com/outr/pica.scala.js"))
scmInfo in ThisBuild := Some(
  ScmInfo(
    url("https://github.com/outr/pica.scala.js"),
    "scm:git@github.com:outr/pica.scala.js.git"
  )
)
developers in ThisBuild := List(
  Developer(id="darkfrog", name="Matt Hicks", email="matt@matthicks.com", url=url("http://matthicks.com"))
)

enablePlugins(ScalaJSPlugin)

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.7"

jsDependencies += ProvidedJS / "pica.js"
skip in packageJSDependencies := false
