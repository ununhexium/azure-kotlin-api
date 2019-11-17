package net.lab0.azure.release.model.definition

import kotlin.String

interface ReleaseWorkItemRef {
  val id: String

  val state: String

  val title: String

  val type: String

  val url: String
}
