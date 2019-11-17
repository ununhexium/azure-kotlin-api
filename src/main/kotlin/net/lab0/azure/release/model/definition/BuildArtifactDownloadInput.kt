package net.lab0.azure.release.model.definition

import kotlin.String
import kotlin.collections.List

interface BuildArtifactDownloadInput : ArtifactDownloadInputBase {
  val artifactItems: List<String>
}
