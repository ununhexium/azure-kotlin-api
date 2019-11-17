package net.lab0.azure.extensionmanagement.model.definition

import kotlin.String

interface Scope {
  val description: String

  val title: String

  val value: String
}
