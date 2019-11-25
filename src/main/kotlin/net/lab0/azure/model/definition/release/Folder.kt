package net.lab0.azure.model.definition.release

import kotlin.String

interface Folder {
  val createdBy: IdentityRef

  val createdOn: String

  val description: String

  val lastChangedBy: IdentityRef

  val lastChangedDate: String

  val path: String
}
