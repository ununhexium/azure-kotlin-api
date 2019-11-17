package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.collections.List

interface TestResultsGroupsForBuild {
  /**
   * BuildId for which groupby result is fetched.
   */
  val buildId: Int

  /**
   * The group by results
   */
  val fields: List<FieldDetailsForTestResults>
}
