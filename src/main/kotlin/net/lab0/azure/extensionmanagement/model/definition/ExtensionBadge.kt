package net.lab0.azure.extensionmanagement.model.definition

import kotlin.String

interface ExtensionBadge {
  val description: String

  val imgUri: String

  val link: String
}
