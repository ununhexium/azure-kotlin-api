package net.lab0.azure.git.model.definition

import kotlin.String

interface GitDeletedRepository {
  val createdDate: String

  val deletedBy: IdentityRef

  val deletedDate: String

  val id: String

  val name: String

  val project: TeamProjectReference
}
