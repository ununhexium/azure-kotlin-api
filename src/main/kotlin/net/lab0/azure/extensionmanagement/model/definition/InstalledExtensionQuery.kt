package net.lab0.azure.extensionmanagement.model.definition

import kotlin.String
import kotlin.collections.List

interface InstalledExtensionQuery {
  val assetTypes: List<String>

  val monikers: List<ExtensionIdentifier>
}
