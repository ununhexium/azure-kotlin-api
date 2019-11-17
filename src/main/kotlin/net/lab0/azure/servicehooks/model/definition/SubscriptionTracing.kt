package net.lab0.azure.servicehooks.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String

interface SubscriptionTracing {
  val enabled: Boolean

  /**
   * Trace until the specified end date.
   */
  val endDate: String

  /**
   * The maximum number of result details to trace.
   */
  val maxTracedEntries: Int

  /**
   * The date and time tracing started.
   */
  val startDate: String

  /**
   * Trace until remaining count reaches 0.
   */
  val tracedEntries: Int
}
