package net.lab0.azure.model.definition.enumeration.release

import com.squareup.moshi.Json

/**
 * Days of the week to release
 */
enum class ScheduleDays {
  @Json(name = "none")
  NONE,

  @Json(name = "monday")
  MONDAY,

  @Json(name = "tuesday")
  TUESDAY,

  @Json(name = "wednesday")
  WEDNESDAY,

  @Json(name = "thursday")
  THURSDAY,

  @Json(name = "friday")
  FRIDAY,

  @Json(name = "saturday")
  SATURDAY,

  @Json(name = "sunday")
  SUNDAY,

  @Json(name = "all")
  ALL
}
