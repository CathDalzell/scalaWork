

ThisBuild / scalaVersion := "2.13.8"


lazy val hello = (project in file("."))
  .settings(
    name := "Rando",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.7" % Test,
    libraryDependencies  ++= Seq(
    // Last stable release
    "org.scalanlp" %% "breeze" % "2.1.0",
    
    // The visualization library is distributed separately as well.
    // It depends on LGPL code
    "org.scalanlp" %% "breeze-viz" % "2.1.0"
    )
  )
