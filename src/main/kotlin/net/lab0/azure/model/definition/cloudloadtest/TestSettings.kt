package net.lab0.azure.model.definition.cloudloadtest

import kotlin.String
import net.lab0.azure.model.definition.enumeration.cloudloadtest.ProcessorArchitecture

interface TestSettings {
  val cleanupCommand: String

  val hostProcessPlatform: ProcessorArchitecture

  val setupCommand: String
}
