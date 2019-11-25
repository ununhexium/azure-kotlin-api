plugins {
  kotlin("jvm") version "1.3.60"
}

repositories {
  mavenLocal()
  jcenter()
}

dependencies {

  val moshiVersion = "1.9.1"
  implementation("com.squareup.moshi:moshi:$moshiVersion")
  implementation("com.squareup.moshi:moshi-kotlin:$moshiVersion")

  val retrofitVersion = "2.6.2"
  implementation("com.squareup.retrofit2:retrofit:$retrofitVersion")
  implementation("com.squareup.retrofit2:converter-moshi:$retrofitVersion")
  implementation("com.squareup.retrofit2:converter-scalars:$retrofitVersion")

  implementation("javax.json:javax.json-api:1.1.4")

  implementation("net.lab0.azure:client:0.2.0")

  implementation("net.lab0.moshi:moshi-javaxjson-adapter:0.1.1")

  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

  implementation("org.slf4j:slf4j-api:2.0.0-alpha1")

  // TEST

  testImplementation("ch.qos.logback:logback-classic:1.3.0-alpha5")

  testImplementation("org.assertj:assertj-core:3.13.2")

  testImplementation("org.junit.jupiter:junit-jupiter:5.5.2")

  testRuntime("org.glassfish:javax.json:1.1.4")
}

