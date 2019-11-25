package net.lab0.azure.model.definition.work

import kotlin.String

interface Member {
  val displayName: String

  val id: String

  val imageUrl: String

  val uniqueName: String

  val url: String
}
