package net.lab0.azure.taskagent.model.definition

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Represents tasks in the task group.
 */
interface TaskGroupStep {
  /**
   * Gets or sets as 'true' to run the task always, 'false' otherwise.
   */
  val alwaysRun: Boolean

  /**
   * Gets or sets condition for the task.
   */
  val condition: String

  /**
   * Gets or sets as 'true' to continue on error, 'false' otherwise.
   */
  val continueOnError: Boolean

  /**
   * Gets or sets the display name.
   */
  val displayName: String

  /**
   * Gets or sets as task is enabled or not.
   */
  val enabled: Boolean

  /**
   * Gets dictionary of environment variables.
   */
  val environment: JsonObject

  /**
   * Gets or sets dictionary of inputs.
   */
  val inputs: JsonObject

  val task: TaskDefinitionReference

  /**
   * Gets or sets the maximum time, in minutes, that a task is allowed to execute on agent before
   * being cancelled by server. A zero value indicates an infinite timeout.
   */
  val timeoutInMinutes: Int
}
