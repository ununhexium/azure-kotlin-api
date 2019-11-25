package net.lab0.azure.model.definition.test

import kotlin.String
import kotlin.collections.List

interface TestResultHistory {
  val groupByField: String

  val resultsForGroup: List<TestResultHistoryDetailsForGroup>
}
