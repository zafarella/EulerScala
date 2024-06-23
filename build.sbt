
import sbt._

lazy val projectVersion = "1.0"
lazy val sVersion = "2.11.8"


lazy val root = (project in file(".")).
  settings(
    name := "Euler",
    version := projectVersion,
    scalaVersion := sVersion
  )

/**
  * coverage settings
  */
coverageEnabled := true
coverageMinimum := 90
coverageFailOnMinimum := true
coverageHighlighting := true
coverageOutputXML := true

/**
  * test dependencies
  */
libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.2"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % "test"

// will be used to run the chain - saves time.
addCommandAlias("runAll", ";clean ;coverage; test ;scalastyle")
