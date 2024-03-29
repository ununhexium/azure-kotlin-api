package net.lab0.azure.model.definition.release

import kotlin.String

interface ReleaseTaskAttachment {
  val _links: ReferenceLinks

  val createdOn: String

  val modifiedBy: IdentityRef

  val modifiedOn: String

  val name: String

  val recordId: String

  val timelineId: String

  val type: String
}
