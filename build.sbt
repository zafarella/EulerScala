import sbt._

val projectVersion = "1.0"
val sVersion = "2.11.7"


lazy val root = (project in file(".")).
  settings(
    name := "Euler",
    version := projectVersion,
    scalaVersion := sVersion
  )

/*
 * test dependencies
 */
libraryDependencies += "org.scalactic" %% "scalactic" % "2.2.6"
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"


addCommandAlias("runAll", ";clean ;compile ;test ;scalastyle")
