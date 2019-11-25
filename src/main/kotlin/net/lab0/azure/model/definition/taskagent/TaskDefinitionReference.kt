package net.lab0.azure.model.definition.taskagent

import kotlin.String

interface TaskDefinitionReference {
  /**
   * Gets or sets the definition type. Values can be 'task' or 'metaTask'.
   */
  val definitionType: String

  /**
   * Gets or sets the unique identifier of task.
   */
  val id: String

  /**
   * Gets or sets the version specification of task.
   */
  val versionSpec: String
}
