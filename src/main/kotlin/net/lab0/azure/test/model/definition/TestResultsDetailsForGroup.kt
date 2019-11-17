package net.lab0.azure.test.model.definition

import javax.json.JsonObject
import kotlin.collections.List

interface TestResultsDetailsForGroup {
  val groupByValue: JsonObject

  val results: List<TestCaseResult>

  val resultsCountByOutcome: JsonObject
}
