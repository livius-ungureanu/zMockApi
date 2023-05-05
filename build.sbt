scalaVersion := "3.2.2"
name := "mockApi"
version := "0.0.1"
val zioVersion = "2.0.11"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio" % zioVersion,
  "dev.zio" %% "zio-test" % zioVersion,
  "dev.zio" %% "zio-test-sbt" % zioVersion,
  "dev.zio" %% "zio-http" % "0.0.5",
  "dev.zio" %% "zio-metrics-connectors" % "2.0.7",
  "dev.zio" %% "zio-json" % "0.5.0"
)
