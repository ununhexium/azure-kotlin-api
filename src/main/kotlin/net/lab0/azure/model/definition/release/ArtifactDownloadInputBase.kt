package net.lab0.azure.model.definition.release

import kotlin.String

interface ArtifactDownloadInputBase {
  val alias: String

  val artifactDownloadMode: String

  val artifactType: String
}
