package net.lab0.azure.cloudloadtest.model.definition

import kotlin.String
import net.lab0.azure.cloudloadtest.model.definition.enumeration.ProcessorArchitecture

interface TestSettings {
  val cleanupCommand: String

  val hostProcessPlatform: ProcessorArchitecture

  val setupCommand: String
}
