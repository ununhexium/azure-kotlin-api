package net.lab0.azure.release.model.definition

import kotlin.collections.List

interface ArtifactsDownloadInput {
  val downloadInputs: List<ArtifactDownloadInputBase>
}
