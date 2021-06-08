val scala3Version = "3.0.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-simple",
    version := "0.1.0",

    scalaVersion := scala3Version,

    libraryDependencies += "tech.units" % "indriya" % "2.1.2",
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )
