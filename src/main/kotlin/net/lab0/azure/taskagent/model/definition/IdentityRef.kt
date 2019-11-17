package net.lab0.azure.taskagent.model.definition

import kotlin.Boolean
import kotlin.String

interface IdentityRef : GraphSubjectBase {
  val directoryAlias: String

  val id: String

  val imageUrl: String

  val inactive: Boolean

  val isAadIdentity: Boolean

  val isContainer: Boolean

  val isDeletedInOrigin: Boolean

  val profileUrl: String

  val uniqueName: String
}
