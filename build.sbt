enablePlugins(ScalaJSPlugin)

enablePlugins(ScalaJSBundlerPlugin)

// @TODO[Security] Is this a good idea to leave this here long term?
resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  "com.raquo" %%% "airstream" % "0.2.1-SNAPSHOT",
  "com.raquo" %%% "dombuilder" % "0.9",
  "com.raquo" %%% "domtestutils" % "0.9" % Test,
  "org.scalatest" %%% "scalatest" % "3.0.5" % Test
)

useYarn := true

requiresDOM in Test := true

scalaJSUseMainModuleInitializer := true

emitSourceMaps := false
