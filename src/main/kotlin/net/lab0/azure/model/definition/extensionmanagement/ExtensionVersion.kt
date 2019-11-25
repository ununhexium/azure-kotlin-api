package net.lab0.azure.model.definition.extensionmanagement

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.extensionmanagement.ExtensionVersionFlags

interface ExtensionVersion {
  val assetUri: String

  val badges: List<ExtensionBadge>

  val fallbackAssetUri: String

  val files: List<ExtensionFile>

  val flags: ExtensionVersionFlags

  val lastUpdated: String

  val properties: List<JsonObject>

  val validationResultMessage: String

  val version: String

  val versionDescription: String
}
