package net.lab0.azure.model.definition.release

import kotlin.String
import kotlin.collections.List

interface JenkinsArtifactDownloadInput : ArtifactDownloadInputBase {
  val artifactItems: List<String>
}
