

lazy val projectVersion = "1.0"
lazy val sVersion = "3.8.1"


lazy val root = (project in file(".")).
  settings(
    name := "Euler",
    version := projectVersion,
    scalaVersion := sVersion
  )

/** coverage settings */
coverageEnabled := true
coverageFailOnMinimum := true
coverageHighlighting := true
coverageMinimumStmtTotal := 90
coverageOutputXML := true

/** tests settings */
Test / parallelExecution := false

libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.19"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % "test"

// will be used to run the chain - saves time.
addCommandAlias("runAll", ";clean ;coverage; test ;scalastyle")
