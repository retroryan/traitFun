
name := "trait-fun"

version := "0.1"

scalaVersion := "2.12.4"

val circeVersion = "0.8.0"


lazy val root = project.in(file("."))
  .settings(common)
  .settings(
    libraryDependencies ++= Seq(
      "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.9.6",
      "com.fasterxml.jackson.core" % "jackson-core" % "2.9.6",
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.9.6",
      "io.circe" %% "circe-core" % circeVersion,
      "io.circe" %% "circe-generic" % circeVersion,
      "io.circe" %% "circe-parser" % circeVersion
    )
  )



lazy val common =
  Seq(
    scalaVersion := "2.12.4",
    organization := "com.fauna",
    version := "0.1",
    scalacOptions ++= Seq(
      "-deprecation",
      "-feature",
      "-Xlint",
      "-Ypartial-unification",
      "-target:jvm-1.8",
      "-encoding", "UTF-8"
    )
  )
