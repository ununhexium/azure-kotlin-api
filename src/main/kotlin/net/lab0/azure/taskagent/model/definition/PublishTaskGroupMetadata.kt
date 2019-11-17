package net.lab0.azure.taskagent.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String

interface PublishTaskGroupMetadata {
  val comment: String

  val parentDefinitionRevision: Int

  val preview: Boolean

  val taskGroupId: String

  val taskGroupRevision: Int
}
