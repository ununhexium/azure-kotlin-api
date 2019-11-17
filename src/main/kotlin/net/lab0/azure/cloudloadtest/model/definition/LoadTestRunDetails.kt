package net.lab0.azure.cloudloadtest.model.definition

import kotlin.Int

interface LoadTestRunDetails : LoadTestRunSettings {
  val virtualUserCount: Int
}
