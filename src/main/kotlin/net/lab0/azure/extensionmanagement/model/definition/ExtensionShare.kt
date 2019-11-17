package net.lab0.azure.extensionmanagement.model.definition

import kotlin.Boolean
import kotlin.String

interface ExtensionShare {
  val id: String

  val isOrg: Boolean

  val name: String

  val type: String
}
