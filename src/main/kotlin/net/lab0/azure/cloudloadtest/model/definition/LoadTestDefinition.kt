package net.lab0.azure.cloudloadtest.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface LoadTestDefinition {
  val agentCount: Int

  val browserMixs: List<BrowserMix>

  val coreCount: Int

  val coresPerAgent: Int

  val loadGenerationGeoLocations: List<LoadGenerationGeoLocation>

  val loadPatternName: String

  val loadTestName: String

  val maxVusers: Int

  val runDuration: Int

  val samplingRate: Int

  val thinkTime: Int

  val urls: List<String>
}
