import sbt._

object ApplicationBuild extends Build
{
	val appName = "bootstrapper"
	val appVersion = "0.1"

	val appDependencies = Seq()

	val main = play.Project( appName, appVersion, appDependencies ).settings()
}