package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.test.TestResultGroupBy

/**
 * Filter to get TestCase result history.
 */
interface TestHistoryQuery {
  /**
   * Automated test name of the TestCase.
   */
  val automatedTestName: String

  /**
   * Results to be get for a particular branches.
   */
  val branch: String

  /**
   * Get the results history only for this BuildDefinationId. This to get used in query GroupBy
   * should be Branch. If this is provided, Branch will have no use.
   */
  val buildDefinitionId: Int

  /**
   * It will be filled by server. If not null means there are some results still to be get, and we
   * need to call this REST API with this ContinuousToken. It is not supposed to be created (or
   * altered, if received from server in last batch) by user.
   */
  val continuationToken: String

  /**
   * Group the result on the basis of TestResultGroupBy. This can be Branch, Environment or null(if
   * results are fetched by BuildDefinitionId)
   */
  val groupBy: TestResultGroupBy

  /**
   * History to get between time interval MaxCompleteDate and  (MaxCompleteDate - TrendDays).
   * Default is current date time.
   */
  val maxCompleteDate: String

  /**
   * Get the results history only for this ReleaseEnvDefinitionId. This to get used in query GroupBy
   * should be Environment.
   */
  val releaseEnvDefinitionId: Int

  /**
   * List of TestResultHistoryForGroup which are grouped by GroupBy
   */
  val resultsForGroup: List<TestResultHistoryForGroup>

  /**
   * Number of days for which history to collect. Maximum supported value is 7 days. Default is 7
   * days.
   */
  val trendDays: Int
}
