package net.lab0.azure.model.definition.enumeration.work

import com.squareup.moshi.Json

enum class TimelineIterationStatusCode {
  /**
   * No error - iteration data is good.
   */
  @Json(name = "oK")
  O_K,

  /**
   * This iteration overlaps with another iteration, no data is returned for this iteration.
   */
  @Json(name = "isOverlapping")
  IS_OVERLAPPING
}
