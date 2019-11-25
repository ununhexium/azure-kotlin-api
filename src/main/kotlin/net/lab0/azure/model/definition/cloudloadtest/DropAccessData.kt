package net.lab0.azure.model.definition.cloudloadtest

import kotlin.String

interface DropAccessData {
  val dropContainerUrl: String

  val sasKey: String
}
