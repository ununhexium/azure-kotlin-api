package net.lab0.azure.model.definition.test

import javax.json.JsonObject

interface TestResultHistoryDetailsForGroup {
  val groupByValue: JsonObject

  val latestResult: TestCaseResult
}
