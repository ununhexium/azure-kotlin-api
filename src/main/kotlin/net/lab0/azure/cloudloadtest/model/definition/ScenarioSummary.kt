package net.lab0.azure.cloudloadtest.model.definition

import kotlin.Int
import kotlin.String

interface ScenarioSummary {
  val maxUserLoad: Int

  val minUserLoad: Int

  val scenarioName: String
}
