package net.lab0.azure.cloudloadtest.model.definition

import kotlin.String

interface Application {
  val applicationId: String

  val description: String

  val name: String

  val path: String

  val pathSeperator: String

  val type: String

  val version: String
}
