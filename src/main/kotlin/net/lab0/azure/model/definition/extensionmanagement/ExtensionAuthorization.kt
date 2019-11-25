package net.lab0.azure.model.definition.extensionmanagement

import kotlin.String
import kotlin.collections.List

interface ExtensionAuthorization {
  val id: String

  val scopes: List<String>
}
