package net.lab0.azure.model.definition.test

import kotlin.String

interface WorkItemReference {
  val id: String

  val name: String

  val type: String

  val url: String

  val webUrl: String
}
