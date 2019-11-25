package net.lab0.azure.model.definition.cloudloadtest

import javax.json.JsonNumber
import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface RequestSummary {
  val averageResponseTime: JsonNumber

  val failedRequests: Int

  val passedRequests: Int

  val percentileData: List<SummaryPercentileData>

  val requestsPerSec: JsonNumber

  val requestUrl: String

  val scenarioName: String

  val testName: String

  val totalRequests: Int
}
