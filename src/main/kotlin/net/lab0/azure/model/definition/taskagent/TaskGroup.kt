package net.lab0.azure.model.definition.taskagent

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface TaskGroup : TaskDefinition {
  /**
   * Gets or sets comment.
   */
  val comment: String

  val createdBy: IdentityRef

  /**
   * Gets or sets date on which it got created.
   */
  val createdOn: String

  /**
   * Gets or sets as 'true' to indicate as deleted, 'false' otherwise.
   */
  val deleted: Boolean

  val modifiedBy: IdentityRef

  /**
   * Gets or sets date on which it got modified.
   */
  val modifiedOn: String

  /**
   * Gets or sets the owner.
   */
  val owner: String

  /**
   * Gets or sets parent task group Id. This is used while creating a draft task group.
   */
  val parentDefinitionId: String

  /**
   * Gets or sets revision.
   */
  val revision: Int

  /**
   * Gets or sets the tasks.
   */
  val tasks: List<TaskGroupStep>
}
