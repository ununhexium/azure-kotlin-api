package net.lab0.azure.model.definition.release

import kotlin.String

interface ReleaseWorkItemRef {
  val id: String

  val state: String

  val title: String

  val type: String

  val url: String
}
