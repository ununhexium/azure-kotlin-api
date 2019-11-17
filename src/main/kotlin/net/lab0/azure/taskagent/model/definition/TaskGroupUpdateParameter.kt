package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface TaskGroupUpdateParameter {
  /**
   * Sets author name of the task group.
   */
  val author: String

  /**
   * Sets category of the task group.
   */
  val category: String

  /**
   * Sets comment of the task group.
   */
  val comment: String

  /**
   * Sets description of the task group.
   */
  val description: String

  /**
   * Sets friendly name of the task group.
   */
  val friendlyName: String

  /**
   * Sets url icon of the task group.
   */
  val iconUrl: String

  /**
   * Sets the unique identifier of this field.
   */
  val id: String

  /**
   * Sets input for the task group.
   */
  val inputs: List<TaskInputDefinition>

  /**
   * Sets display name of the task group.
   */
  val instanceNameFormat: String

  /**
   * Sets name of the task group.
   */
  val name: String

  /**
   * Gets or sets parent task group Id. This is used while creating a draft task group.
   */
  val parentDefinitionId: String

  /**
   * Sets revision of the task group.
   */
  val revision: Int

  /**
   * Sets RunsOn of the task group. Value can be 'Agent', 'Server' or 'DeploymentGroup'.
   */
  val runsOn: List<String>

  /**
   * Sets tasks for the task group.
   */
  val tasks: List<TaskGroupStep>

  val version: TaskVersion
}
