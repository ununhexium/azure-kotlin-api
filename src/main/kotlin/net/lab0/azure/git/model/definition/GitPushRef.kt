package net.lab0.azure.git.model.definition

import kotlin.Int
import kotlin.String

interface GitPushRef {
  val _links: ReferenceLinks

  val date: String

  val pushedBy: IdentityRef

  val pushId: Int

  val url: String
}
