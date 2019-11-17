package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

/**
 * Test result retention settings
 */
interface ResultRetentionSettings {
  /**
   * Automated test result retention duration in days
   */
  val automatedResultsRetentionDuration: Int

  val lastUpdatedBy: IdentityRef

  /**
   * Last updated date
   */
  val lastUpdatedDate: String

  /**
   * Manual test result retention duration in days
   */
  val manualResultsRetentionDuration: Int
}
