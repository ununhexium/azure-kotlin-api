package net.lab0.azure.release.model.definition

import kotlin.Int
import kotlin.String
import net.lab0.azure.release.model.definition.enumeration.ScheduleDays

interface ReleaseSchedule {
  /**
   * Days of the week to release
   */
  val daysToRelease: ScheduleDays

  /**
   * Team Foundation Job Definition Job Id
   */
  val jobId: String

  /**
   * Local time zone hour to start
   */
  val startHours: Int

  /**
   * Local time zone minute to start
   */
  val startMinutes: Int

  /**
   * Time zone Id of release schedule, such as 'UTC'
   */
  val timeZoneId: String
}
