name := "introduction-to-fp-in-scala"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "org.scalaz"        %% "scalaz-core"                  % "7.3.0-M32"
, "org.scalaz"        %% "scalaz-scalacheck-binding"    % "7.3.0-M32"    % "test"
, "org.scalacheck"    %% "scalacheck"                   % "1.14.3"       % "test"
)

resolvers ++= Seq(
  "oss snapshots"       at "http://oss.sonatype.org/content/repositories/snapshots"
, "oss releases"        at "http://oss.sonatype.org/content/repositories/releases"
, "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"
)

scalacOptions := Seq(
  "-deprecation"
, "-unchecked"
// , "-Xfatal-warnings"
, "-Xlint"
, "-feature"
, "-language:_"
)
