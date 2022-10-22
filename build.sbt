ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "queryengine4s",
    libraryDependencies ++= Seq(
      "org.apache.arrow" % "arrow-vector" % "9.0.0",
      "org.apache.arrow" % "arrow-memory" % "9.0.0"
    )
  )
