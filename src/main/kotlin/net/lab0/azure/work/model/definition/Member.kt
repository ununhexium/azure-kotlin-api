package net.lab0.azure.work.model.definition

import kotlin.String

interface Member {
  val displayName: String

  val id: String

  val imageUrl: String

  val uniqueName: String

  val url: String
}
