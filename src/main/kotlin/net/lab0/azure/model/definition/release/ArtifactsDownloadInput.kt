package net.lab0.azure.model.definition.release

import kotlin.collections.List

interface ArtifactsDownloadInput {
  val downloadInputs: List<ArtifactDownloadInputBase>
}
