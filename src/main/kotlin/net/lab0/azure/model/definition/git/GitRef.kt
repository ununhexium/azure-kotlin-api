package net.lab0.azure.model.definition.git

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

interface GitRef {
  val _links: ReferenceLinks

  val creator: IdentityRef

  val isLocked: Boolean

  val isLockedBy: IdentityRef

  val name: String

  val objectId: String

  val peeledObjectId: String

  val statuses: List<GitStatus>

  val url: String
}
