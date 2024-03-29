package net.lab0.azure.model.definition.cloudloadtest

import kotlin.String
import kotlin.collections.List

interface TestDefinition : TestDefinitionBasic {
  val description: String

  val loadGenerationGeoLocations: List<LoadGenerationGeoLocation>

  val loadTestDefinitionSource: String

  val runSettings: LoadTestRunSettings

  val staticAgentRunSettings: StaticAgentRunSetting

  val testDetails: LoadTest
}
