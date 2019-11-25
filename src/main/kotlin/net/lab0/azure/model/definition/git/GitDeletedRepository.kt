package net.lab0.azure.model.definition.git

import kotlin.String

interface GitDeletedRepository {
  val createdDate: String

  val deletedBy: IdentityRef

  val deletedDate: String

  val id: String

  val name: String

  val project: TeamProjectReference
}
