package net.lab0.azure.model.definition.release

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface ReleaseDefinitionEnvironmentSummary {
  val id: Int

  val lastReleases: List<ReleaseShallowReference>

  val name: String
}
