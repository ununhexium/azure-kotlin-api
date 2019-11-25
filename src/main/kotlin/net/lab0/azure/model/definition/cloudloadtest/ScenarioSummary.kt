package net.lab0.azure.model.definition.cloudloadtest

import kotlin.Int
import kotlin.String

interface ScenarioSummary {
  val maxUserLoad: Int

  val minUserLoad: Int

  val scenarioName: String
}
