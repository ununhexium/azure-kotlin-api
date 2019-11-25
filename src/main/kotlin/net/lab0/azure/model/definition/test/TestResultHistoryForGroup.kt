package net.lab0.azure.model.definition.test

import kotlin.String
import kotlin.collections.List

/**
 * List of test results filtered on the basis of GroupByValue
 */
interface TestResultHistoryForGroup {
  /**
   * Display name of the group.
   */
  val displayName: String

  /**
   * Name or Id of the group identifier by which results are grouped together.
   */
  val groupByValue: String

  /**
   * List of results for GroupByValue
   */
  val results: List<TestCaseResult>
}
