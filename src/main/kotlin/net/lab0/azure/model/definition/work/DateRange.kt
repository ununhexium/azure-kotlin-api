package net.lab0.azure.model.definition.work

import kotlin.String

interface DateRange {
  /**
   * End of the date range.
   */
  val end: String

  /**
   * Start of the date range.
   */
  val start: String
}
