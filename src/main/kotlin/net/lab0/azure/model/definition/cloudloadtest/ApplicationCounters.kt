package net.lab0.azure.model.definition.cloudloadtest

import kotlin.Boolean
import kotlin.String

interface ApplicationCounters {
  val applicationId: String

  val description: String

  val id: String

  val isDefault: Boolean

  val name: String

  val path: String
}
