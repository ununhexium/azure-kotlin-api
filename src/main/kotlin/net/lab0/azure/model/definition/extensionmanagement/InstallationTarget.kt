package net.lab0.azure.model.definition.extensionmanagement

import kotlin.String

interface InstallationTarget {
  val target: String

  val targetVersion: String
}
