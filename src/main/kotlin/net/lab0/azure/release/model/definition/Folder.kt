package net.lab0.azure.release.model.definition

import kotlin.String

interface Folder {
  val createdBy: IdentityRef

  val createdOn: String

  val description: String

  val lastChangedBy: IdentityRef

  val lastChangedDate: String

  val path: String
}
