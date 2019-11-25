package net.lab0.azure.model.definition.git

import kotlin.Int
import kotlin.String

interface GitPushRef {
  val _links: ReferenceLinks

  val date: String

  val pushedBy: IdentityRef

  val pushId: Int

  val url: String
}
