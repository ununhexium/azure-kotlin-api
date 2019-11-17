package net.lab0.azure.taskagent.model.definition

import kotlin.String

interface TaskAttachment {
  val _links: ReferenceLinks

  val createdOn: String

  val lastChangedBy: String

  val lastChangedOn: String

  val name: String

  val recordId: String

  val timelineId: String

  val type: String
}
