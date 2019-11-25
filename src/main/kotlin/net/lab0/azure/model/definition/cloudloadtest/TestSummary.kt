package net.lab0.azure.model.definition.cloudloadtest

import javax.json.JsonNumber
import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface TestSummary {
  val averageTestTime: JsonNumber

  val failedTests: Int

  val passedTests: Int

  val percentileData: List<SummaryPercentileData>

  val scenarioName: String

  val testName: String

  val totalTests: Int
}
