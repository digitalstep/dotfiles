// Generated by IntelliJ-IDEA Scala plugin.
// Adds settings when starting sbt from IDEA.
// Manual changes to this file will be lost.
if (java.lang.System.getProperty("idea.runid", "false") == "2017.2") scala.collection.Seq(
resolvers += Resolver.file("intellij-scala-plugin", file(raw"/Users/gunnar.bastkowski/Library/Application Support/IntelliJIdea2018.1/Scala/repo"))(Resolver.ivyStylePatterns),
addSbtPlugin("org.jetbrains" % "sbt-structure-extractor" % "2017.2"),
addSbtPlugin("org.jetbrains" % "sbt-idea-shell" % "2017.2")
) else scala.collection.Seq.empty