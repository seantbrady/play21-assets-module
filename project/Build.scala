import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "play21-assets-module"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean
  )

  val assets = play.Project(appName + "-assets", appVersion, appDependencies, path = file("modules/assets")).settings(
    requireJs += "main.js"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
  ).dependsOn(assets)

}
