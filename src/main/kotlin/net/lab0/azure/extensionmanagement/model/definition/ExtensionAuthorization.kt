package net.lab0.azure.extensionmanagement.model.definition

import kotlin.String
import kotlin.collections.List

interface ExtensionAuthorization {
  val id: String

  val scopes: List<String>
}
