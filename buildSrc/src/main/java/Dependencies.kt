object Versions {
  val kotlin = "1.2.21"
  val supportLib = "27.0.2"
  val buildTools = "27.0.2"
  val minSDK = 19
  val targetSDK = 26
  val compileSDK = 26
  val versionCode = 1
  val versionName = "1.0"

  val junit = "4.12"
  val testRunner = "1.0.1"
  val espressoCore = "3.0.1"
}

object PluginVersions {
  val gradle = "3.0.1"
  val bintray = "1.7.3"
  val maven = "1.5"
  val dokka = "0.9.15"
}

object AndroidTestDependencies {
  val junit = "junit:junit:${Versions.junit}"
  val testRunner = "com.android.support.test:runner:${Versions.testRunner}"
  val espressoCore = "com.android.support.test.espresso:espresso-core:${Versions.espressoCore}"
}

object AndroidDependencies {
  val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
  val supportAppCompatV7 = "com.android.support:appcompat-v7:${Versions.supportLib}"
  val supportV4 = "com.android.support:support-v4:${Versions.supportLib}"
  val supportDesign = "com.android.support:design:${Versions.supportLib}"
}

object BuildScriptDependencies {
  val gradlePlugin = "com.android.tools.build:gradle:${PluginVersions.gradle}"
  val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
  val bintrayPlugin = "com.jfrog.bintray.gradle:gradle-bintray-plugin:${PluginVersions.bintray}"
  val mavenPlugin = "com.github.dcendents:android-maven-gradle-plugin:${PluginVersions.maven}"
  val dokkaPlugin = "org.jetbrains.dokka:dokka-android-gradle-plugin:${PluginVersions.dokka}"
}