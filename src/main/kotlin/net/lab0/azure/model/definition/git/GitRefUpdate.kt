package net.lab0.azure.model.definition.git

import kotlin.Boolean
import kotlin.String

interface GitRefUpdate {
  val isLocked: Boolean

  val name: String

  val newObjectId: String

  val oldObjectId: String

  val repositoryId: String
}
