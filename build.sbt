organization := "com.novocode"

name := "erased-types"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.1"

crossScalaVersions := Seq("2.10.4", "2.11.1")

scalacOptions ++= Seq("-deprecation", "-unchecked", "-optimise")

//scalacOptions ++= Seq("-deprecation", "-unchecked", "-uniqid", "-Xprint:typer")

libraryDependencies += "com.novocode" % "junit-interface" % "0.10" % "test"

libraryDependencies <+= scalaVersion("org.scala-lang" % "scala-compiler" % _ % "compile")
