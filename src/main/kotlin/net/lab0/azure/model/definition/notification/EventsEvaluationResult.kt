package net.lab0.azure.model.definition.notification

import kotlin.Int

/**
 * Encapsulates events result properties. It defines the total number of events used and the number
 * of matched events.
 */
interface EventsEvaluationResult {
  /**
   * Count of events evaluated.
   */
  val count: Int

  /**
   * Count of matched events.
   */
  val matchedCount: Int
}
