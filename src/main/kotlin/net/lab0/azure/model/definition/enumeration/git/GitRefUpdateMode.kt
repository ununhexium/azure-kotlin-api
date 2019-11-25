package net.lab0.azure.model.definition.enumeration.git

import com.squareup.moshi.Json

enum class GitRefUpdateMode {
  /**
   * Indicates the Git protocol model where any refs that can be updated will be updated, but any
   * failures will not prevent other updates from succeeding.
   */
  @Json(name = "bestEffort")
  BEST_EFFORT,

  /**
   * Indicates that all ref updates must succeed or none will succeed. All ref updates will be
   * atomically written. If any failure is encountered, previously successful updates will be rolled
   * back and the entire operation will fail.
   */
  @Json(name = "allOrNone")
  ALL_OR_NONE
}
