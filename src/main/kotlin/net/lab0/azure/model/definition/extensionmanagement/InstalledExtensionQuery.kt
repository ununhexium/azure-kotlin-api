package net.lab0.azure.model.definition.extensionmanagement

import kotlin.String
import kotlin.collections.List

interface InstalledExtensionQuery {
  val assetTypes: List<String>

  val monikers: List<ExtensionIdentifier>
}
