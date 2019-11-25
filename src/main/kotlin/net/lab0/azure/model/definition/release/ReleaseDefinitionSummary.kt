package net.lab0.azure.model.definition.release

import kotlin.collections.List

interface ReleaseDefinitionSummary {
  val environments: List<ReleaseDefinitionEnvironmentSummary>

  val releaseDefinition: ReleaseDefinitionShallowReference

  val releases: List<Release>
}
