package net.lab0.azure.release.model.definition

import kotlin.Int
import kotlin.String

interface DefinitionEnvironmentReference {
  val definitionEnvironmentId: Int

  val definitionEnvironmentName: String

  val releaseDefinitionId: Int

  val releaseDefinitionName: String
}
