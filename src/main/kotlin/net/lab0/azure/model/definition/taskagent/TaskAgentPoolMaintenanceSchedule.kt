package net.lab0.azure.model.definition.taskagent

import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.taskagent.TaskAgentPoolMaintenanceScheduleDays

interface TaskAgentPoolMaintenanceSchedule {
  /**
   * Days for a build (flags enum for days of the week)
   */
  val daysToBuild: TaskAgentPoolMaintenanceScheduleDays

  /**
   * The Job Id of the Scheduled job that will queue the pool maintenance job.
   */
  val scheduleJobId: String

  /**
   * Local timezone hour to start
   */
  val startHours: Int

  /**
   * Local timezone minute to start
   */
  val startMinutes: Int

  /**
   * Time zone of the build schedule (string representation of the time zone id)
   */
  val timeZoneId: String
}
