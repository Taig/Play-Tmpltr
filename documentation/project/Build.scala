import sbt._
import sbt.Keys._
import play.Project._

object Build extends sbt.Build
{
	val dependencies = Seq(
		"org.webjars" %% "webjars-play" % "2.1.0-3",
		"org.webjars" % "bootstrap" % "3.0.0",
		"org.webjars" % "highlightjs" % "7.3-1"
	)

	val tmpltr = ProjectRef( file( "../" ), "play-tmpltr" )

	val main = play.Project( "documentation", "0.1", dependencies ).settings(
		templatesImport ++= Seq(
			"com.taig.tmpltr._",
			"com.taig.tmpltr.engine.html._",
			"com.taig.tmpltr.engine.{ bootstrap => bs }",
			"widget._" ),
		scalacOptions ++= Seq( "-feature", "-language:implicitConversions" )
	).dependsOn( tmpltr ).aggregate( tmpltr )	
}