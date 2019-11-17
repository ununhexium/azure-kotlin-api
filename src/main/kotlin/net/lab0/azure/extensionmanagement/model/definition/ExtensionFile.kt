package net.lab0.azure.extensionmanagement.model.definition

import kotlin.String

interface ExtensionFile {
  val assetType: String

  val language: String

  val source: String
}
