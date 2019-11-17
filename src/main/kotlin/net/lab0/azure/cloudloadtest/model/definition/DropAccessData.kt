package net.lab0.azure.cloudloadtest.model.definition

import kotlin.String

interface DropAccessData {
  val dropContainerUrl: String

  val sasKey: String
}
