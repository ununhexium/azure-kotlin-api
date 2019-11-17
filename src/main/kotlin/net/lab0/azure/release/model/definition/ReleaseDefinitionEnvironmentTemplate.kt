package net.lab0.azure.release.model.definition

import kotlin.Boolean
import kotlin.String

interface ReleaseDefinitionEnvironmentTemplate {
  val canDelete: Boolean

  val category: String

  val description: String

  val environment: ReleaseDefinitionEnvironment

  val iconTaskId: String

  val iconUri: String

  val id: String

  val isDeleted: Boolean

  val name: String
}
