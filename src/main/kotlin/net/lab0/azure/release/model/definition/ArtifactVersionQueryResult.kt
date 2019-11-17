package net.lab0.azure.release.model.definition

import kotlin.collections.List

interface ArtifactVersionQueryResult {
  val artifactVersions: List<ArtifactVersion>
}
