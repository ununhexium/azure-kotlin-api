package net.lab0.azure.test.model.definition

import kotlin.String
import kotlin.collections.List

interface TestResultHistory {
  val groupByField: String

  val resultsForGroup: List<TestResultHistoryDetailsForGroup>
}
