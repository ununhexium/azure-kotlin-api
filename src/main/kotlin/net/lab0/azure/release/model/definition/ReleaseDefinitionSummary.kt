package net.lab0.azure.release.model.definition

import kotlin.collections.List

interface ReleaseDefinitionSummary {
  val environments: List<ReleaseDefinitionEnvironmentSummary>

  val releaseDefinition: ReleaseDefinitionShallowReference

  val releases: List<Release>
}
