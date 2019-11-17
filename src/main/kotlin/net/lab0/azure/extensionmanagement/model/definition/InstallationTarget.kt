package net.lab0.azure.extensionmanagement.model.definition

import kotlin.String

interface InstallationTarget {
  val target: String

  val targetVersion: String
}
