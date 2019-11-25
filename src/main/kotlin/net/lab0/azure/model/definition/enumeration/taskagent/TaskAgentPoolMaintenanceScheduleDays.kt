package net.lab0.azure.model.definition.enumeration.taskagent

import com.squareup.moshi.Json

/**
 * Days for a build (flags enum for days of the week)
 */
enum class TaskAgentPoolMaintenanceScheduleDays {
  /**
   * Do not run.
   */
  @Json(name = "none")
  NONE,

  /**
   * Run on Monday.
   */
  @Json(name = "monday")
  MONDAY,

  /**
   * Run on Tuesday.
   */
  @Json(name = "tuesday")
  TUESDAY,

  /**
   * Run on Wednesday.
   */
  @Json(name = "wednesday")
  WEDNESDAY,

  /**
   * Run on Thursday.
   */
  @Json(name = "thursday")
  THURSDAY,

  /**
   * Run on Friday.
   */
  @Json(name = "friday")
  FRIDAY,

  /**
   * Run on Saturday.
   */
  @Json(name = "saturday")
  SATURDAY,

  /**
   * Run on Sunday.
   */
  @Json(name = "sunday")
  SUNDAY,

  /**
   * Run on all days of the week.
   */
  @Json(name = "all")
  ALL
}
