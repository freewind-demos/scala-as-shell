#!/usr/bin/env scalas
 
/***         
scalaVersion := "2.10.6"
 
resolvers += Resolver.url("typesafe-ivy-repo", url("http://repo.typesafe.com/typesafe/releases"))(Resolver.ivyStylePatterns)
 
libraryDependencies += "org.scala-sbt" % "io" % "0.13.9"
*/         
 
import sbt._, Path._
import java.io.File
import java.net.{URI, URL}
import sys.process._
def file(s: String): File = new File(s)
def uri(s: String): URI = new URI(s)
 
val targetDir = file("./target/")
val srcDir = file("./src/")
val toTarget = rebase(srcDir, targetDir)
 
def processFile(f: File): Unit = {
  val newParent = toTarget(f.getParentFile) getOrElse {sys.error("wat")}
  val file1 = newParent / f.name
  println(s"""$f => $file1""")
  val xs = IO.readLines(f) map { _ + "!" }
  IO.writeLines(file1, xs)
}

val fs: Seq[File] = (srcDir ** "*.scala").get
fs foreach { processFile }