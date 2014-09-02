lazy val root = (project in file(".")).settings(
    sourceDirectory in Compile <<= baseDirectory(_ / "app"),
    sourceDirectory in Test <<= baseDirectory(_ / "test"),
    target <<= baseDirectory(_ / "target/sbt")
).enablePlugins(SbtWeb)

scalaVersion := Option(System.getProperty("scala.version")).getOrElse("2.10.4")

includeFilter in (Assets, LessKeys.less) := "*.less"

excludeFilter in (Assets, LessKeys.less) := "_*.less"
