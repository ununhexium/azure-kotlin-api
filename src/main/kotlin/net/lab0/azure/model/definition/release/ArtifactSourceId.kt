package net.lab0.azure.model.definition.release

import kotlin.String
import kotlin.collections.List

interface ArtifactSourceId {
  val artifactTypeId: String

  val sourceIdInputs: List<SourceIdInput>
}
