package net.lab0.azure.cloudloadtest.model.definition

import javax.json.JsonNumber
import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface PageSummary {
  val averagePageTime: JsonNumber

  val pageUrl: String

  val percentagePagesMeetingGoal: Int

  val percentileData: List<SummaryPercentileData>

  val scenarioName: String

  val testName: String

  val totalPages: Int
}
