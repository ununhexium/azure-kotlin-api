package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.collections.List

interface TestResultsGroupsForRelease {
  /**
   * The group by results
   */
  val fields: List<FieldDetailsForTestResults>

  /**
   * Release Environment Id for which groupby result is fetched.
   */
  val releaseEnvId: Int

  /**
   * ReleaseId for which groupby result is fetched.
   */
  val releaseId: Int
}
