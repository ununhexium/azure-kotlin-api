package net.lab0.azure.model.definition.release

import kotlin.collections.List

interface ArtifactVersionQueryResult {
  val artifactVersions: List<ArtifactVersion>
}
