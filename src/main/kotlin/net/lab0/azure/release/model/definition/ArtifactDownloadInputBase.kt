package net.lab0.azure.release.model.definition

import kotlin.String

interface ArtifactDownloadInputBase {
  val alias: String

  val artifactDownloadMode: String

  val artifactType: String
}
