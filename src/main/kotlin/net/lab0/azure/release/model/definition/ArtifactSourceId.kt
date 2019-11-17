package net.lab0.azure.release.model.definition

import kotlin.String
import kotlin.collections.List

interface ArtifactSourceId {
  val artifactTypeId: String

  val sourceIdInputs: List<SourceIdInput>
}
