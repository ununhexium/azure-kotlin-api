package net.lab0.azure.model.definition.cloudloadtest

import kotlin.Int

interface LoadTestRunDetails : LoadTestRunSettings {
  val virtualUserCount: Int
}
