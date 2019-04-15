name := "file-checker"

version := "1.0"

maintainer := "Olivier Bruchez <olivier@bruchez.org>"

packageSummary := "File checker"

packageDescription := "A service that regularly checks local files for integrity."

scalaVersion := "2.12.8"

enablePlugins(SystemdPlugin)

scalafmtOnCompile in ThisBuild := true
