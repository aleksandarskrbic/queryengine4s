ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "queryengine4s",
    libraryDependencies ++= Seq(
      // Arrow
      "org.apache.arrow" % "arrow-vector" % "9.0.0",
      "org.apache.arrow" % "arrow-memory" % "9.0.0",
      // Parquet
      "org.apache.hadoop"  % "hadoop-common"  % "3.3.2",
      "org.apache.parquet" % "parquet-arrow"  % "1.12.3",
      "org.apache.parquet" % "parquet-common" % "1.12.3",
      "org.apache.parquet" % "parquet-column" % "1.12.3",
      "org.apache.parquet" % "parquet-hadoop" % "1.12.3",
      // Parses
      "com.univocity" % "univocity-parsers" % "2.9.1"
    )
  )
