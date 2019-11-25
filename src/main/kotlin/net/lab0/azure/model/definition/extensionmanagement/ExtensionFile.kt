package net.lab0.azure.model.definition.extensionmanagement

import kotlin.String

interface ExtensionFile {
  val assetType: String

  val language: String

  val source: String
}
