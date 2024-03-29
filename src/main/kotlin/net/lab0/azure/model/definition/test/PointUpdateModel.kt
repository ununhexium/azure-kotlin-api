package net.lab0.azure.model.definition.test

import kotlin.Boolean
import kotlin.String

/**
 * Model to update test point.
 */
interface PointUpdateModel {
  /**
   * Outcome to update.
   */
  val outcome: String

  /**
   * Reset test point to active.
   */
  val resetToActive: Boolean

  val tester: IdentityRef
}
