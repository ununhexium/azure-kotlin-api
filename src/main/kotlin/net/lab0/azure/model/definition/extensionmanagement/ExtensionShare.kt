package net.lab0.azure.model.definition.extensionmanagement

import kotlin.Boolean
import kotlin.String

interface ExtensionShare {
  val id: String

  val isOrg: Boolean

  val name: String

  val type: String
}
