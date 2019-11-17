plugins {
  id("org.jetbrains.kotlin.jvm").version("1.3.50")
}

repositories {
  jcenter()
}

dependencies {

  implementation("com.squareup.retrofit2:retrofit:2.6.2")

  implementation("com.squareup.moshi:moshi:1.9.1")

  implementation("javax.json:javax.json-api:1.1.4")

  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

  implementation("org.slf4j:slf4j-api:2.0.0-alpha1")

  // TEST

  testImplementation("ch.qos.logback:logback-classic:1.3.0-alpha5")

  testImplementation("org.assertj:assertj-core:3.13.2")

  testImplementation("org.junit.jupiter:junit-jupiter:5.5.2")
}

