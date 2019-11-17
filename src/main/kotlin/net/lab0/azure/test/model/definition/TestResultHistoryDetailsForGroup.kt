package net.lab0.azure.test.model.definition

import javax.json.JsonObject

interface TestResultHistoryDetailsForGroup {
  val groupByValue: JsonObject

  val latestResult: TestCaseResult
}
